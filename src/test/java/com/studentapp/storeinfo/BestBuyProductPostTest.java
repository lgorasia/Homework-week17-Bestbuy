package com.studentapp.storeinfo;

import com.studentapp.model.ProductPojo;
import com.studentapp.testbase.TestBase;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;


public class BestBuyProductPostTest extends TestBase {

    @Test
    public void createProduct() {
        List<String> serviceList= new ArrayList<>();
        serviceList.add("Mobile repair");
        serviceList.add("Laptop repair");
        ProductPojo productPojo = new ProductPojo();
        productPojo.setName("SpinkalarSprite");
        productPojo.setType("smallBottel");
        productPojo.setAddress("ABC Street");
        productPojo.setAddress2("Harrow");
        productPojo.setCity("London");
        productPojo.setState("Gujarat");
        productPojo.setZip("382350");
        productPojo.setLat(44.956214);
        productPojo.setLng(-54.925214);
        productPojo.setHours("Mon: 10-9; Tue: 10-9; Wed: 10-9; Thurs: 10-9; Fri: 10-9; Sat: 10-9; Sun: 10-8");
        productPojo.getServices(serviceList);

        Response response= given()

                .contentType(ContentType.JSON)
                .body(productPojo)
                .when()
                .post("/stores");
       response.then().statusCode(201);
        response.prettyPrint();
    }

    }