package com.junit.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitBeforeAndAfter {

        @Test
        public void verifyUserCanLoginIntoTheApp(){
            System.out.println("============ Test 1=====================");
        }

        @Test
        public void verifyUserCannotLoginWithInvalidCred(){
            System.out.println("============ Test 2=====================");
        }

        @Test
        public void verifyUserCanLogout(){
            System.out.println("============ Test 3=====================");

        }

        @Before
        public void setUp(){
            System.out.println("============ Before =============");
        }

        @After
        public void cleanUp(){
            System.out.println("============ After =============");
        }
}
