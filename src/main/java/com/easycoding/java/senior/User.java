package com.easycoding.java.senior;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;


@Builder
@Data
public class User implements Serializable {
    public String name;
    public Integer age;
    public float height;
    public double weight;
    public String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public User(){}

    public User(String name,Integer age,float height,double weight,String address){
        this.name = name;
        this.age =age;
        this.height = height;
        this.weight = weight;
        this.address = address;
    }

    public void mailCheck()
    {
        System.out.println("Mailing a check to " + name
                + " " + address);
    }
}
