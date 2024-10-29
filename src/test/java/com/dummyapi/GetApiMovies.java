package com.dummyapi;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class GetApiMovies extends BaseTest {

    @Test
    public void getApiMovies() {
        given()
                .spec(spec)
                .header("Accept-Encoding", "gzip, deflate")
                .log().all() // İstek ve yanıtın tüm detaylarını logla
                .when()
                .get("/api/movies")
                .then()
                .log().all() // Yanıtın tüm detaylarını logla
                .statusCode(200)
                .body("size()", equalTo(100))
                .body("find { it.id == 84 }.movie", equalTo("Jumanji: Welcome to the Jungle"));
        
    }
}
