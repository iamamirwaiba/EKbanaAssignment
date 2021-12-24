package com.example.demo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Junittest {
    try2 ty=new try2(5);

    @Test
    public void testMessage(){
        int c=120;
        assertEquals(c,try2.getFactorial());


    }
}
