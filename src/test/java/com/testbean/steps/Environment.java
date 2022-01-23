package com.testbean.steps;

import io.cucumber.java.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeEach;


public class Environment {

    @BeforeAll
    public static void beforeAll() {
        // Runs before all
        System.out.println("Before All");
    }

    @AfterAll
    public static void afterAll() {
        // Runs after all
        System.out.println("After All");
    }

    @Before
    public static void before() {
        // Run before a scenario
        System.out.println("Before Scenario");
    }

    @After
    public static void after() {
        // Run after a scenario
        System.out.println("After Scenario");
    }

}
