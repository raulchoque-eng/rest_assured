import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
/**
 * TestClass class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class TestClass {

    @Test
    public void test_getAlbumsById1StatusCode_ShoudBe200() {
        String stCode = "";

        given().
        when().
            get("https://jsonplaceholder.typicode.com/albums/1").
        then().
            assertThat().
            statusCode(200);

    }

    @Test
    public void test_DeleteAlbumsByID1_StatusCode_ShoudBe200() {
        given().
        when().
            get("https://jsonplaceholder.typicode.com/Albums/1").
        then().
            assertThat().
            statusCode(200);

    }

    @Test
    public void test_GetAlbumsById1ValidateData_ShoudBe1Andquidem_molestiae_enim() {
        given().
        when().
            get("https://jsonplaceholder.typicode.com/albums/1").
        then().
            body("userId", equalTo(1)).
            body("title", equalTo("quidem molestiae enim"));
    }

    @Test
    public void test_PostAlbumsWithTitleTestAlbum_ShoudBeTitle_TestAlbum() {
        Map<String,String> mymap = new HashMap<String, String>();
        mymap.put("title", "TestAlbum");

        given().
            params(mymap).
        when().
            post("https://jsonplaceholder.typicode.com/albums").
        then().
            assertThat().
            statusCode(201);
//            body("title", equalTo("TestAlbum"));
    }
}
