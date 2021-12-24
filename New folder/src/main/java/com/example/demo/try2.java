package com.example.demo;

public class try2 {
    private static int factorial;

    try2(int a){
        factorial=a;
    }

    public static int getFactorial(){
        int total=1;
        for(int i=factorial;i>=1;i--){
            total=total*i;
        }
        System.out.println(total);
        return total;
    }
}
