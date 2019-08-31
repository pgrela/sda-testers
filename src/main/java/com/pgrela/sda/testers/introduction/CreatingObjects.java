package com.pgrela.sda.testers.introduction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CreatingObjects {
    public static void main(String[] args) {
        Object object = new Object();
        System.out.printf("object is %s\n", object);

        BigDecimal bigDecimal = new BigDecimal("3.1415926535");
        System.out.printf("object is %s\n", bigDecimal);

        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(8);
        System.out.printf("list is %s\n", list);

        List otherList = new ArrayList(list);
        otherList.add(16);
        System.out.printf("otherList is %s\n", otherList);

        Person person;
        person = new Person("Anna", "Maria", "Wesołowska");
        System.out.println("Person is " + person);
        person = new Person("Mariusz", "Max", "Kolonko");
        System.out.println("Person is " + person);
    }
}

class Person {
    private String firstName;
    private String middleName;
    private String lastName;

    public Person(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}