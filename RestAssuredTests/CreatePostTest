import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreatePostTest {

    @Test
    public void testCreatePost() {

        String url = "https://jsonplaceholder.typicode.com/posts";

        // Request Body
        String requestBody = "{\n" +
                "  \"title\": \"Automation Test\",\n" +
                "  \"body\": \"This is a POST request using Rest Assured\",\n" +
                "  \"userId\": 1\n" +
                "}";

        // Send POST request
        Response response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .post(url);

        // Print Response
        System.out.println("Response Body:");
        System.out.println(response.getBody().asString());

        // Validations
        Assert.assertEquals(response.getStatusCode(), 201);

        String returnedTitle = response.jsonPath().getString("title");
        int returnedUserId = response.jsonPath().getInt("userId");

        Assert.assertEquals(returnedTitle, "Automation Test");
        Assert.assertEquals(returnedUserId, 1);

        // Extract generated id
        String generatedId = response.jsonPath().getString("id");
        System.out.println("Generated Post ID: " + generatedId);

    }
}
