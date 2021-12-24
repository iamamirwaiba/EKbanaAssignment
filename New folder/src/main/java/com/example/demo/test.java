package com.example.demo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class test {
    try3 ty=new try3();

    @Test
    public void testMessage(){
         String message="amir";
        assertEquals(message,try3.palindrom());

    }
}
