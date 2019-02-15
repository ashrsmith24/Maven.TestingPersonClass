package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private int zipcode;
    private String state;
    private Double height;
    private int weight;
    private boolean gender;


    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
    }

    public Person(int age) {

        this.age = age;

    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {

        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

//
/*
    public Person() {
        this.state= "";
        this.zipcode= Integer.MAX_VALUE;
    }

    public Person(int zipcode) {

        this.zipcode = zipcode;

    }

    public Person(String state) {
        this.state = state;
    }

    public Person(String state, int zipcode) {
        this.state  = state;
        this.zipcode = zipcode;

    }*/


    public void setState(String state) {
        this.state = state;
    }

    public void setZipCode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getState() {

        return this.state;
    }

    public Integer getZipCode() {
        return this.zipcode;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public Double getHeight() {
        return this.height;
    }


    public void setState(Double expected) {
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
    public Boolean getGender() {
        return this.gender;
    }


    public void setGender(Boolean gender) {
        this.gender = gender;
    }

}



