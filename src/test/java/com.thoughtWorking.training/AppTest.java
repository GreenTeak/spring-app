package com.thoughtWorking.training;

import com.thoughtWork.training.App;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class AppTest {
    @Test
    public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("hello world", classUnderTest.test());
    }

}