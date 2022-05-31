package com.studentapp.utilities;

import com.studentapp.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class BestBuyGetTest extends TestBase {
    @Test
    public void getVersion() {
        Response response = given()
                .when()
                .get("/version");
        response.then().statusCode(200);
        response.prettyPrint();

    }
    @Test
    public void getHealthCheck() {
        Response response = given()
                .when()
                .get("/healthcheck");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}
