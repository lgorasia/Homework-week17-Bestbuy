package com.studentapp.servicesinfo;

import com.studentapp.model.ServicesPojo;
import com.studentapp.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class BestBuyServicesPatchTest extends TestBase {


        @Test
        public void patchProduct() {
            ServicesPojo servicesPojo = new ServicesPojo();
            servicesPojo.setName("Mayur");



            Response response = given()
                    .header("Content-Type", "application/json")
                    .header("Accept", "application/json")
                    .body(servicesPojo)
                    .when()
                    .patch("/services/24");
            response.prettyPrint();
            response.then().statusCode(201);

        }



    }

