package com.junit.class01;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MulTest extends BaseTest{

    @Test
    public void checkBothNumbersArePositive() {
        int expectedResult = 6;
        int num1 = 2, num2 = 3;
        int actualResult = c.mul(num1, num2);
        String message = "expected=" + expectedResult + "actual=" + actualResult;
        Assert.assertEquals(message, expectedResult, actualResult);
    }

    @Test
    public void checkSecondNumberIsOne() {
        int expectedResult = 3;
        int num1 = 1, num2 = 3;
        int actualResult = c.mul(num1, num2);
        String message = "expected=" + expectedResult + "actual=" + actualResult;
        Assert.assertEquals(message, expectedResult, actualResult);
    }

    @Test
    public void checkSecondNumberIsZero() {
        int expectedResult = 0;
        int num1 = 0, num2 = 3;
        int actualResult = c.mul(num1, num2);
        String message = "expected=" + expectedResult + "actual=" + actualResult;
        Assert.assertEquals(message, expectedResult, actualResult);
    }

    @Test
    public void checkBothNumbersAreLarge() {
        int expectedResult = 600000;
        int num1 = 2000, num2 = 300;
        int actualResult = c.mul(num1, num2);
        String message = "expected=" + expectedResult + "actual=" + actualResult;
        Assert.assertEquals(message, expectedResult, actualResult);
    }

    @Test
    public void checkBothNumbersAreOne() {
        int expectedResult = 1;
        int num1 = 1, num2 = 1;
        int actualResult = c.mul(num1, num2);
        String message = "expected=" + expectedResult + "actual=" + actualResult;
        Assert.assertEquals(message, expectedResult, actualResult);
    }

    @Test
    public void checkBothNumbersAreZero() {
        int expectedResult = 0;
        int num1 = 0, num2 = 0;
        int actualResult = c.mul(num1, num2);
        String message = "expected=" + expectedResult + "actual=" + actualResult;
        Assert.assertEquals(message, expectedResult, actualResult);
    }

    @Test
    public void checkBothNumbersAreNegative() {
        int expectedResult = 6;
        int num1 = -3, num2 = -2;
        int actualResult = c.mul(num1, num2);
        String message = "expected=" + expectedResult + "actual=" + actualResult;
        Assert.assertEquals(message, expectedResult, actualResult);
    }

    @Test
    public void checkFirstNumbersIsNegative() {
        int expectedResult = -6;
        int num1 = -3, num2 = 2;
        int actualResult = c.mul(num1, num2);
        String message = "expected=" + expectedResult + "actual=" + actualResult;
        Assert.assertEquals(message, expectedResult, actualResult);
    }

    @Test
    public void checkSecondNumberIsNegative() {
        int expectedResult = -6;
        int num1 = 2, num2 = -3;
        int actualResult = c.mul(num1, num2);
        String message = "expected=" + expectedResult + "actual=" + actualResult;
        Assert.assertEquals(message, expectedResult, actualResult);
    }

}
