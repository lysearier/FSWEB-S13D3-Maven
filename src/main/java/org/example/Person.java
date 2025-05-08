package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;

    public Person() {
        this("Eren", "Gündüz", 23);
    }
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return (age <= 19 && age >= 13);
    }
}
