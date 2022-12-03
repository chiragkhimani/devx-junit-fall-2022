package com.junit.tests;

import com.junit.groups.AlinaTest;
import com.junit.groups.SmokeTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class LoginValidation extends BaseTest {

    String expectedResult, username, password; // instance


    public LoginValidation(String username, String password, String expectedResult) { // local variables
        this.expectedResult = expectedResult;
        this.username = username;
        this.password = password;
    }

    @Category({SmokeTest.class, AlinaTest.class})
    @Test
    public void checkLogin() {
        String actualResult = checkLogin(username, password);
        String message = "expected=" + expectedResult + "actual=" + actualResult;
        Assert.assertEquals(message, expectedResult, actualResult);
    }

    public String checkLogin(String username, String password){
        String dbUsernmae = "devx";
        String dbPassword = "1234";

        if(dbPassword.equals(password) && dbUsernmae.equals(username)){
            return "true";
        }else{
            return "false";
        }
    }

    @Parameterized.Parameters(name = "Running with {0} and {1} and expecting {2}")
    public static String[][] supplyData() {
        String data[][] = {
                {"chirag", "1234", "true"},
                {"devx", "1234", "true"}
        };
        return data;
    }


}
