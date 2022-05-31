package com.studentapp.categories;

import com.studentapp.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class BestBuyCategoriesDeleteTest extends TestBase {
    @Test

    public void deletProduct() {


        Response response = given()
                //.pathParam("id", 8923)
                .when()
                .delete("categories/ABCD1234");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}
