package com.auto.test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;


public class MyTest {

    @Test
    public void hello()
    {
        System.out.println("Hello World");
    }





    @Test
    public void test1() {
        RestAssured.baseURI="https://postman-echo.com";

        Response response = RestAssured.get("get?test=123");
        response.prettyPrint();
    }
}
