package com.zipcodewilmington.phonebook;

public class Person {
    private static Integer uniqueId = 0;
    String firstName;
    String lastName;

    public Person(String initFirstName, String initLastName)
    {
        firstName = initFirstName;
        lastName = initLastName;
        uniqueId = ++uniqueId;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public Integer getUniqueId()
    {
        return uniqueId;
    }

    public void setFirstName(String newFirstName)
    {
        this.firstName = newFirstName;
    }

    public void setLastName(String newLastName)
    {
        this.lastName = newLastName;
    }

    @Override
    public String toString() {
        return (lastName + ", " + firstName);
    }
}
