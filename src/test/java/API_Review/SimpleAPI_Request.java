package API_Review;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

public class SimpleAPI_Request {

    @Test
    public void simpleRequest() {

        RestAssured.get("http://openlibrary.org/search.json?q=the+lord+of+the+rings")
                .prettyPrint();

    }
}
