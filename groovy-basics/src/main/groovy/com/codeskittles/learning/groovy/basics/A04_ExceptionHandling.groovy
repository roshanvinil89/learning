package com.codeskittles.learning.groovy.basics;

class A04_ExceptionHandling {

    static void main(String[] args) {
        // Groovy doesnt force developers to handle checked exceptions unlike Java

        File someFile = new File("Some Path");

        // Below line throws a FileNotFoundException which is a checked Exception
        // FileNotFoundException <- IOException <- Exception
        // Groovy does not force you to handle it unlike in Java
        FileInputStream fileInputStream = new FileInputStream(someFile);
    }
}
