package com.testbean.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;


public class Arithmetic {
    private int a;
    private int b;
    private int result;

    @Given("Two number A equal {int} and B equal {int}")
    public void two_number_a_and_b(int a_value, int b_value) {
        a = a_value;
        b = b_value;
    }

    @When("add the two numbers")
    public void add_the_two_numbers() {
        result = a + b;
    }

    @Then("result shall be equal to {int}")
    public void result_shall_be_equal_to(int num) {
        assertEquals(num, result);
    }

    @When("multiply the two numbers")
    public void multiplyTheTwoNumbers() {
        result = a * b;
    }
}
