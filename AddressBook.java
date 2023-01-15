package com.Assignment;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook");

        List<Contact> c = new ArrayList<>();
        Contact c1 = new Contact("Ravi","kumar", "Ballia", "Ballia", "Up", 277211, 8767265462L, "Ravi@gmail.com");

        c.add(c1);
        System.out.println(c1);



    }
}
