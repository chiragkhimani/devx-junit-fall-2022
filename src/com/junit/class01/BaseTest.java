package com.junit.class01;

import org.junit.After;
import org.junit.Before;

public class BaseTest {
    Calculator c;

    @Before
    public void setUp(){
        c = new Calculator();
        System.out.println("Before");
    }

    @After
    public void cleanUp(){
        // clean up activity
        System.out.println("After");
    }
}
