package com.BAC.Model;

import java.util.ArrayList;
import java.util.List;

public class Friends extends PersonImpl {
    protected Person[] friends;

    public Friends(String name, String number, String email, String address, double weight, int age, String gender) {
        super(name, number, email, address, weight, age, gender);
    }

    //    public Friends() {
//        super();
//    }
//    public Friends(Person person) {
//        super(person);
////        super(person);
//        List<Person> friendsList = new ArrayList<>();
//    }
    public void addFriend(Person person) {
//        this.friends.add(person);
    }

}
