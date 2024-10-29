package com.dummyapi;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeEach;

import java.util.Arrays;

import static io.restassured.RestAssured.given;


public class BaseTest {
    RequestSpecification spec;
    @BeforeEach
    public void setup(){
        spec=new RequestSpecBuilder()
                .setBaseUri("https://dummyapi.online")
                .addFilters(Arrays.asList(new RequestLoggingFilter(), new ResponseLoggingFilter()))
                .build();

    }

}
