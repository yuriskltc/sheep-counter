package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void testAppConstructor() {
        assertTrue("Dummy constructor test, always true.", 2>1);
    }

    @Test
    public void testAppMessage()
    {
        assertTrue("Dummy message output test, always true.", 2>1);
    }
}
