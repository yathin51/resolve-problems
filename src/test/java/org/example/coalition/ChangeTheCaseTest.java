package org.example.coalition;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ChangeTheCaseTest {
    @Test
    public void testChangeCase() {
        assertEquals("vARIABLE tocHANGE", (new ChangeTheCase()).changeCase("Variable TOChange"));
    }

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void changeCase() {
    }
}

