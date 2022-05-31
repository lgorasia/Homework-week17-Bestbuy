package com.studentapp.extractresponcedata;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class BestBuyResponceValidation  {

   public static ValidatableResponse response;
    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI="http://localhost";
        RestAssured.port=3030;

   response= given()
            .when()
            .get("/stores")
            .then().statusCode(200);}


    @Test
    public void extractTheLimit(){
     int limit=response.extract().path("limit");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The value of limit is : "+limit);
        System.out.println("------------------End of Test---------------------------");
    }

    @Test
    public void extractTheTotal(){
        int total=response.extract().path("total");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The value of total is : "+total);
        System.out.println("------------------End of Test---------------------------");
    }

    @Test
    public void nameof5thStore(){
        String storeName=response.extract().path("data[4].name");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The value of storeName is : "+storeName);
        System.out.println("------------------End of Test---------------------------");
    }

    @Test
    public void namesOfAllStores(){
        List<String> allStoreNames=response.extract().path("data.name");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The value of all Store Name is : "+allStoreNames);
        System.out.println("------------------End of Test---------------------------");
    }

    @Test
    public void storeIDOfAllData(){
        List<Integer> allStoreID=response.extract().path("data.id");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The value of all Store ID is : "+allStoreID);
        System.out.println("------------------End of Test---------------------------");
    }
    @Test
    public void sizeOfAllData(){
        List<String> dataSize=response.extract().path("data");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The Size of the data is : "+dataSize.size());
        System.out.println("------------------End of Test---------------------------");
    }

    @Test
    public void getAllTheValueOfTheStoreWhereStoreNameIsStCloud(){
        List<String> storename=response.extract().path("data.findAll{it.name=='St Cloud'}");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("All value of store where store name St Cloud is : "+storename);
        System.out.println("------------------End of Test---------------------------");
    }

    @Test
    public void  getTheAddressOfTheStoreWhereStoreNameISRochester(){
        List<String> address=response.extract().path("data.findAll{it.name=='Rochester'}.address");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println(" The address of the store where store name = Rochester is : "+address);
        System.out.println("------------------End of Test---------------------------");
    }
    @Test
    public void  getAllServicesOf8Store(){
        List<String> allServices=response.extract().path("data[7].services");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("  All the services of 8th store are : "+allServices);
        System.out.println("------------------End of Test---------------------------");
    }
    @Test
    public void  test10(){
        List<String> storeServices=response.extract().path("data.findAll{it.services.findAll{it.name=='Windows Store'}}.services.storeservices");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("storeservices of the store where service name = Windows Store : "+storeServices);
        System.out.println("------------------End of Test---------------------------");
    }
    @Test
    public void  test11(){
        List<String> storeIds =response.extract().path("data.services.storeservices.storeId");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("all the storeId of all the store are: "+storeIds );
        System.out.println("------------------End of Test---------------------------");
    }
    @Test
    public void  test12(){
        List<Integer> allStoreID=response.extract().path("data.id");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The value of all Store ID is : "+allStoreID);
        System.out.println("------------------End of Test---------------------------");
    }
    @Test
    public void  test13(){
        List<Integer> stateName=response.extract().path("data.findAll{it.state=='ND'}.name");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("store names Where state = ND : "+stateName);
        System.out.println("------------------End of Test---------------------------");
    }
    @Test
    public void  test14(){
        List<Integer> services=response.extract().path("data.findAll{it.name=='Rochester'}.services");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("Total number of services for the store where store name = Rochester : "+services.size());
        System.out.println("------------------End of Test---------------------------");
    }
    @Test
    public void  test15(){
        List<String> storeServices=response.extract().path("data.findAll{it.services.findAll{it.name=='Windows Store'}}.createdAt");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println(" createdAt for all services whose name = “Windows Store” : "+storeServices);
        System.out.println("------------------End of Test---------------------------");
    }

    @Test
    public void  test16(){
        List<String> fargoServices=response.extract().path("data.findAll{it.name=='Fargo'}.services.name");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("name of all services Where store name = “Fargo” : "+fargoServices);
        System.out.println("------------------End of Test---------------------------");
    }
    @Test
    public void  test17(){
        List<String> zipCode = response.extract().path("data.zip");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println(" zip of all the store : "+zipCode);
        System.out.println("------------------End of Test---------------------------");
    }

    @Test
    public void  test18(){
        List<String> zipCodeOfRoseville = response.extract().path("data.findAll{it.name=='Roseville'}.zip");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("zip of store name = Roseville : "+zipCodeOfRoseville);
        System.out.println("------------------End of Test---------------------------");
    }
    @Test
    public void  test19(){
        List<String> storeServices=response.extract().path("data.findAll{it.services.findAll{it.name=='Magnolia Home Theater'}}.services.storeservices");        System.out.println("------------------StartingTest---------------------------");
        System.out.println("storeservices details of the service name = Magnolia Home Theater: "+storeServices);
        System.out.println("------------------End of Test---------------------------");
    }
    @Test
    public void  test20(){
        List<String> lat=response.extract().path("data.lat");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("lat of all the stores: "+lat);
        System.out.println("------------------End of Test---------------------------");
    }








}
