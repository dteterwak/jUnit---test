package com.junit.test;

import com.junit.classes.SmallList;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestList {
    SmallList slist;
    @Before
    public void initalizeList(){
        slist = new SmallList();
        slist.fillList("Apple");
        slist.fillList(null);
    }

    @Test
    public void testIfNull(){
        assertNull(slist.getItem(1));
    }
}
