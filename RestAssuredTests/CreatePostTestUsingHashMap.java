import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.util.HashMap;
import java.util.Map;

public class CreatePostUsingHashMap {

    @Test
    public void testCreatePostUsingHashMap(){
        String url = "https://jsonplaceholder.typicode.com/posts";
        Map<String, Object> requestbody = new HashMap<>();
        requestbody.put("title", "Hashmap Test");
        requestbody.put("body", "Post using hashmap in Rest Assured");
        requestbody.put("userId", 1);

        // send post request
        Response response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .body(requestbody)
                .post(url);

        System.out.println("Response body: ");
        System.out.println(response.asString());

        Assert.assertEquals(response.getStatusCode(), 201);
        Assert.assertEquals(response.jsonPath().getString("title"), "Hashmap Test");
        Assert.assertEquals(response.jsonPath().getInt("userId"), 1);


    }

}
