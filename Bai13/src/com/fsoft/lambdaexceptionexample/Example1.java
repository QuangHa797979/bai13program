package com.fsoft.lambdaexceptionexample;

@FunctionalInterface
interface MyFunctionalInterface1 {
 
    //A method with no parameter
    public String sayHello();
}
public class Example1 {
 
   public static void main(String args[]) {
        // lambda expression
        MyFunctionalInterface1 msg = () -> {
            return "Hello";
        };
        System.out.println(msg.sayHello());
    }
}
