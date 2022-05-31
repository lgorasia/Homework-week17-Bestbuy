package com.studentapp.storeinfo;

import com.studentapp.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class BestBuyProductGetTest extends TestBase {

    @Test
    public void getAllProductsInfo() {
        Response response = given()
                .when()
                .get("stores");
        response.then().statusCode(200);
        response.prettyPrint();

    }
    @Test
    public void getProductsInfo() {
        Response response = given()
                .when()
                .get("/products/48530");
        response.then().statusCode(200);
        response.prettyPrint();

    }



}
