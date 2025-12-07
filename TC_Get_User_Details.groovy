import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

// Send the API request
def response = WS.sendRequest(findTestObject('Object Repository/Get_User_Details'))

// Verify the status code
WS.verifyResponseStatusCode(response, 200)

// Log response body for debugging
println("===== API RESPONSE =====")
println(response.getResponseBodyContent())
KeywordUtil.logInfo("API Test Executed Successfully.")
