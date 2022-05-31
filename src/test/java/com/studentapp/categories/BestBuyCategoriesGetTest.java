package com.studentapp.categories;

import com.studentapp.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class BestBuyCategoriesGetTest extends TestBase {

    @Test
    public void getAllCategories() {
        Response response = given()
                .when()
                .get("/categories");
        response.then().statusCode(200);
        response.prettyPrint();

    }
    @Test
    public void getServices() {
        Response response = given()
                .when()
                .get("/categories/abcat0020001");
        response.then().statusCode(200);
        response.prettyPrint();

    }




}
