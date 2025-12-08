import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.util.KeywordUtil
import groovy.json.JsonSlurper


def response = WS.sendRequest(findTestObject('Object Repository/Get_User_Details'))
WS.verifyResponseStatusCode(response, 200)
// verify response and parse the response body into json
def json = new JsonSlurper().parseText(response.getResponseBodyContent())
assert json[0].id == 1
println (response.getResponseBodyContent())
