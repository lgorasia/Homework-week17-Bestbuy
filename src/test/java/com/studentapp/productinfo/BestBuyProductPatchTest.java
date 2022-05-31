package com.studentapp.productinfo;

import com.studentapp.model.Product1Pojo;
import com.studentapp.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class BestBuyProductPatchTest extends TestBase {


        @Test
        public void patchProduct() {
            Product1Pojo product1Pojo = new Product1Pojo();
            product1Pojo.setName("Samsung");
            product1Pojo.setType("Smartphone");
            product1Pojo.setPrice(900);
            product1Pojo.setShipping(80);
            product1Pojo.setUpc("89787665654");
            product1Pojo.setDescription("/Asia");
            product1Pojo.setManufacturer("Apple");
            product1Pojo.setModel("i5");
            product1Pojo.setUrl("https://www.Apple.com/");
            product1Pojo.setImage("https://www.Apple.com/images/Apple");


            Response response = given()
                    .header("Content-Type", "application/json")
                    .header("Accept", "application/json")
                    .body(product1Pojo)
                    .when()
                    .post("/products");
            response.prettyPrint();
            response.then().statusCode(201);

        }



    }

