package com.BAC.Model;

public class PersonImpl implements Person{
    protected String name;
    protected String number;
    protected String email;
    protected String address;
    protected double weight;
    protected int age;

    public PersonImpl(String name, String number, String email, String address, double weight, int age) {
        if (name == null) {
            throw new IllegalArgumentException();
        }
        if (number == null) {
            throw new IllegalArgumentException();
        }
        if (email == null) {
            throw new IllegalArgumentException();
        }
        if (address == null) {
            throw new IllegalArgumentException();
        }
        if (weight < 0) {
            throw new IllegalArgumentException();
        }
        if (age < 0) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.number = number;
        this.email = email;
        this.address = address;
        this.weight = weight;
        this.age = age;
    }

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
    public void setWeight(double weight) {
        this.weight = weight;
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
    public double getWeight() {
        return this.weight;
    }

    @Override
    public int getAge() {
        return this.age;
    }
}
