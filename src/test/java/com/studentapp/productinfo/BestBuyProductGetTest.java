package com.studentapp.productinfo;

import com.studentapp.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class BestBuyProductGetTest extends TestBase {

    @Test
    public void getAllProductsInfo() {
        Response response = given()
                .when()
                .get("/products");
        response.then().statusCode(200);
        response.prettyPrint();

    }



}
