package com.junit.test;

import com.junit.classes.Greater;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestGreater {
    Greater greater;
    @Before
    public void initialize(){
        greater = new Greater();
    }

    @Test
    public void testGreater(){
        assertTrue(greater.isGreaterThan(5));
        assertFalse(greater.isGreaterThan(-190));
    }

    @Test
    public void testEqual(){
        assertEquals(greater,0);
    }
}
