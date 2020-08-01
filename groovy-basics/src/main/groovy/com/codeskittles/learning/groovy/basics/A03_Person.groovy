package com.codeskittles.learning.groovy.basics

class A03_Person {

    // Not setting the access modifiers of fields will inform Groovy
    // to create a private field and also create getter and setter
    String firstName
    String lastName
    int age

    String getFullName() {
        // In Groovy the last statement of the method will be returned.
        // Developers need not write an explicit return statement
        println "Doing something here to prove a point"
        this.getFirstName() + " " + this.getLastName()
        // Possible semantic errors here.
        // In case if the developer does not place the line that needs to be returned at the end.
        // Need to extremely careful
        // println "Uncomment this line to see whatI mean"
    }

    static void main(String[] args) {

        A03_Person person1 = new A03_Person()

        person1.firstName = "Vinil"
        person1.lastName = "Nelluru"

        person1.age = 30

        println person1.getFullName()
        println person1.getAge()

        // Creating a list of Persons
        def personList = [
                // Groovy provides a convenience to creating objects as below
                new A03_Person(firstName: "Vinil", lastName: "Nelluru", age: 30),
                new A03_Person(firstName: "Swami", lastName: "Vivekananda", age: 55),
                new A03_Person(firstName: "Bhagat", lastName: "Singh", age: 24)
        ]

        personList.add(1, person1)

        println personList.getClass()
        println personList.size()

    }

}
