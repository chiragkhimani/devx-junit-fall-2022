package com.junit.tests;

import com.junit.groups.AlinaTest;
import com.junit.groups.SmokeTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class MulTest extends BaseTest {

    int expectedResult, num1, num2; // instance

    // Construcctor
    public MulTest(int num1, int num2, int expectedResult) { // local variables
        this.expectedResult = expectedResult;
        this.num1 = num1;
        this.num2 = num2;
    }


    // Test Case
    @Category({SmokeTest.class, AlinaTest.class})
    @Test
    public void verifyMultiplicationFunctionality() {
        int actualResult = c.mul(num1, num2);
        String message = "expected=" + expectedResult + "actual=" + actualResult;
        Assert.assertEquals(message, expectedResult, actualResult);
    }

    // Method will supply the data
    @Parameterized.Parameters(name = "Running with {0} and {1} and expecting {2}")
    public static Integer[][] supplyData() {
        Integer data[][] = {
                {0, 3, 0},
                {2000, 300, 600000},
                {1, 1, 1},
                {0, 0, 0},
                {-3, -2, 6},
                {-3, 2, -6},
                {3, -2, -6}
        };
        return data;
    }


}
