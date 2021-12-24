package com.example.demo;

public class try1 {
    private static int a;
    private static int b;

    try1(int c,int d){
        a=c;
        b=d;
    }

    public static int calculate(){
        int c=a+b;
        System.out.println(c);
        return c;
    }
}
