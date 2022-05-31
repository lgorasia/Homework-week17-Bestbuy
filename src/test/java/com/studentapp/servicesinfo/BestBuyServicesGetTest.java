package com.studentapp.servicesinfo;

import com.studentapp.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class BestBuyServicesGetTest extends TestBase {

    @Test
    public void getAllServices() {
        Response response = given()
                .when()
                .get("/services");
        response.then().statusCode(200);
        response.prettyPrint();

    }
    @Test
    public void getServices() {
        Response response = given()
                .when()
                .get("/services/24");
        response.then().statusCode(200);
        response.prettyPrint();

    }




}
