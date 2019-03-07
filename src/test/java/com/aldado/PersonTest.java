package com.aldado;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    private Person person = new Person("Aldado", "Dampies");

    @Test
    public void getFirstName() throws Exception{
        assertSame("Aldado",person.getFirstName());
    }

    @Test
    public void getLastName() throws Exception{
        assertSame("Dampies",person.getLastName());
    }


}

