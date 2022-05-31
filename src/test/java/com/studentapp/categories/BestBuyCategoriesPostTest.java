package com.studentapp.categories;

import com.studentapp.model.CategoryPojo;
import com.studentapp.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class BestBuyCategoriesPostTest extends TestBase {

    @Test
    public void createServices() {
        CategoryPojo categoryPojo=new CategoryPojo();
        categoryPojo.setName("Lalit");
        categoryPojo.setId("ABCD1234");


        Response response = given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .body(categoryPojo)
                .when()
                .post("/categories");
        response.prettyPrint();
        response.then().statusCode(200);



    }

}