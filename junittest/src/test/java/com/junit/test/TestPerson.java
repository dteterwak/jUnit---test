package com.junit.test;

import com.junit.classes.Person;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestPerson {
    Person person;
    @Before
    public void TestPerson(){
        person = new Person("John", "Smith", 25);
    }

    @Test
    public void checkCredentials(){
        assertEquals(person.getName(),"John");
        assertEquals(person.getSurname(),"Smith");
        assertEquals(person.getAge(),25);
    }

    @Test
    public void checkIfNotNull(){
        assertNotNull(person);
    }

    @Test
    public void checkIfSameReference(){
        assertSame(person.getName(),person.getName());
    }
}
