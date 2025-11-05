package com.plursalsight;

public class Exercise2 {
    public static void main(String[] args) {
        Greeter greeter = name -> System.out.println("Hello " + name);
        greeter.greet("Hana");
    }
}
