package com.codeskittles.learning.groovy.basics;

class A02_DynamicallyTypedVariables {

    static void main(String[] args) {
        //Statically Typed variable. age is of type int and can only be assigned int values.
        int age = 30
        println age
        println age.getClass()

        // Dynamically Typed variables. the type of ageDef is the type of value it is assigned to.
        def ageDef = "30"
        println ageDef
        println ageDef.getClass()

        // re-using ageDef
        // ageDef can be assigned anything and the type would be the type of what it is assigned to.
        ageDef = new Object();
        println ageDef
        println ageDef.getClass()

    }
}
