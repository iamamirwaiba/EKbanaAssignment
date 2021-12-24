package com.example.demo;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class simple {
    private String message;

    simple(String message){
        this.message=message;
    }

    public String print(){
        System.out.println(message);
        return message;
    }
}
