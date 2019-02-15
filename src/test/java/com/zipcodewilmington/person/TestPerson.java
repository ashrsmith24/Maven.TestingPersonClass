package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;
import sun.jvm.hotspot.debugger.Address;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSet() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);


    /*@Test
    public void testSecondConstructor() {
        // Given
        String expectedState = "";
        Integer expectedZipCode = Integer.MAX_VALUE;

        // When
        Person address = new Person();

        // Then
        String actualState = address.getState();
        Integer actualZipCode = address.getZipCode();

        Assert.assertEquals(expectedState, actualState);
        Assert.assertEquals(expectedZipCode, actualZipCode);*/
    }

    /*@Test
    public void testConstructorWithState() {
        // Given
        String expected = "Delaware";

        // When
        Person address = new Person(expected);

        // Then
        String actual = address.getState();
        Assert.assertEquals(expected, actual);*/


    /*@Test
    public void testConstructorWithZipCode() {
        // Given
        String expected = "19701";

        // When
        Person address = new Person(expected);

        // Then
        Integer actual = address.getZipCode();
        Assert.assertEquals(expected, actual);*/



    /*@Test
    public void testConstructorWithStateAndZipCode() {
        // Given
        Integer expectedZipCode = 19701;
        String expectedState = "Delaware";

        // When
        Person address = new Person(expectedState, expectedZipCode);

        // Then
        Integer actualZipCode = address.getZipCode();
        String actualState = address.getName();

        Assert.assertEquals(expectedZipCode, actualZipCode);
        Assert.assertEquals(expectedState, actualState);*/


    /*@Test
    public void testSetState() {
        // Given
        Person address = new Person();
        String expected = "Delaware";

        // When
        address.setState(expected);
        String actual = address.getState();

        // Then
        Assert.assertEquals(expected, actual); */


    @Test
    public void testSetZipCode() {
        // Given
        Person zipcode = new Person();
        Integer expected = 19701;

        // When
        zipcode.setZipCode(expected);

        // Then
        Integer actual = zipcode.getZipCode();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAddress() {
        // Given
        Person address = new Person();
        Integer expected = 19701;

        // When
        address.setZipCode(expected);

        // Then
        Integer actual = address.getZipCode();
        Assert.assertEquals(expected, actual);

    }
    //
    @Test
    public void testSetHeight() {
        // Given
        Person height = new Person();
        Double expected = 5.5;

        // When
        height.setHeight(expected);
        Double actual = height.getHeight();

        // Then

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetWeight() {
        // Given
        Person weight = new Person();
        Integer expected = 137;

        // When
        weight.setZipCode(expected);

        // Then
        Integer actual = weight.getZipCode();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetGender() {
        // Given
        Person gender = new Person();
        Boolean expected = true;

        // When
        gender.setGender(expected);

        // Then
        Boolean actual = gender.getGender();
        Assert.assertEquals(expected, actual);

    }

}



