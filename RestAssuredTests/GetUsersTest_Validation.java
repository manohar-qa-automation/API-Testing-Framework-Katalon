import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetUsersTests {

    @Test
    public void testGetUsers() {

        String url = "https://jsonplaceholder.typicode.com/users";

        Response response = RestAssured.get(url);

        System.out.println("Response body: ");
        System.out.println(response.getBody().asString());

        Assert.assertEquals(response.getStatusCode(), 200);

        // Extract first email
        String firstEmail = response.jsonPath().getString("[0].email");
        System.out.println("First Email: "+ firstEmail);

        // Assert extracted  value is not null and contains @
        Assert.assertNotNull(firstEmail);
        Assert.assertTrue(firstEmail.contains("@"));

    }
}
