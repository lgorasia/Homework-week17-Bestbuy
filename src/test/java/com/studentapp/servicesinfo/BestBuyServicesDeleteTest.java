package com.studentapp.servicesinfo;

import com.studentapp.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class BestBuyServicesDeleteTest extends TestBase {
    @Test

    public void deletProduct() {


        Response response = given()
                //.pathParam("id", 8923)
                .when()
                .delete("services/21");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}
