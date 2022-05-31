package com.studentapp.storeinfo;

import com.studentapp.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class BestBuyProductDeleteTest extends TestBase {
    @Test

    public void deletProduct() {


        Response response = given()
                .pathParam("id", 8923)
                .when()
                .delete("/{id}");
        response.then().statusCode(204);
        response.prettyPrint();

    }
}
