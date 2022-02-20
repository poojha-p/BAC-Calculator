package com.BAC.Model;

public interface Person {
    void setName(String name);
    void setPhone(String number);
    void setEmail(String email);
    void setAddress(String address);
    void setWeight(double weight);
    void setAge(int age);
    void setGender(String gender);

    String getName();
    String getPhone();
    String getEmail();
    String getAddress();
    double getWeight();
    int getAge();
    String getGender();


}
