package com.aldado;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    private Student student = new Student("John", "Doe", "Networking", 4.0);

    @Test
    public void getMajor() throws Exception{
        assertSame("AppDev",student.getMajor() );//Exception on purpose
    }

    @Test
    public void getGpa()throws Exception{
        assertSame("4.0", 3.5 ); //Exception on purpose
    }

    @Test
    public void shouldAnswerWithTrue(){
        assertTrue(true);
    }

}
