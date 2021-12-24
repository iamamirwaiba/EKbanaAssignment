package com.example.demo;


public class try3 {
    private static String message;

    public try3(){
        message="amir";
    }

    public static String palindrom(){
        String Message="";
        for(int i=message.length()-1;i>=0;i--){
            Message=Message.concat(String.valueOf(message.charAt(i)));
        }
        return Message;
    }
}
