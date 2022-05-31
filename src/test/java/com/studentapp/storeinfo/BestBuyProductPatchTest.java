package com.studentapp.storeinfo;

import com.studentapp.model.ProductPojo;
import com.studentapp.testbase.TestBase;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class BestBuyProductPatchTest extends TestBase {


        @Test
        public void patchProduct() {
            ProductPojo productPojo = new ProductPojo();

            productPojo.setState("Delhi");


            Response response= given()
                    .pathParam("id",8922)
                    .contentType(ContentType.JSON)
                    .body(productPojo)
                    .when()
                    .patch("/stores/{id}");
            response.then().statusCode(200);
            response.prettyPrint();
        }



    }

