package com.BAC.Model;

public class PersonImpl implements Person{
    private String name;
    private String number;
    private String email;
    private String address;
    private int age;


    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setPhone(String number) {
        this.number = number;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getPhone() {
        return this.number;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public int getAge() {
        return this.age;
    }
}
