package com.studentapp.servicesinfo;

import com.studentapp.model.ServicesPojo;
import com.studentapp.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class BestBuyServicesPostTest extends TestBase {

    @Test
    public void createProduct() {
        ServicesPojo servicesPojo = new ServicesPojo();
        servicesPojo.setName("Laalit");


        Response response = given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .body(servicesPojo)
                .when()
                .post("/services");
        response.prettyPrint();
        response.then().statusCode(201);



    }

}