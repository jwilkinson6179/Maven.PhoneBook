package com.zipcodewilmington.phonebook;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {
    TreeMap<String, Integer> directory;

    public PhoneBook(Map<String, List<String>> map) {
    }

    public PhoneBook() {
        this(null);
    }

    public void add(String name, String phoneNumber) {
    }

    public void addAll(String name, String... phoneNumbers) {
    }

    public void remove(String name) {
    }

    public Boolean hasEntry(String name) {
        return null;
    }

    public List<String> lookup(String name) {
        return null;
    }

    public String reverseLookup(String phoneNumber)  {
        return null;
    }

    public List<String> getAllContactNames() {
        return null;
    }

    public Map<String, List<String>> getMap() {
        return null;
    }
}
