package com.zipcodewilmington.phonebook;

import java.util.*;


/**
 * Created by leon on 1/23/18.
 */

public class PhoneBook
{
    HashMap<String, List<String>> contacts;

    public PhoneBook(Map<String, List<String>> map)
    {
        contacts = new LinkedHashMap<>();
    }

    public PhoneBook()
    {
        this(null);
    }

    public void add(String name, String phoneNumber)
    {
        List<String> contactNumbers;
        if(contacts.containsKey(name))
        {
            contactNumbers = contacts.get(name);
        }
        else
        {
            contactNumbers = new ArrayList<String>();
        }

        contactNumbers.add(phoneNumber);
        contacts.put(name, contactNumbers);
    }

    public void addAll(String name, String... phoneNumbers)
    {
        for(String number : phoneNumbers)
        {
            this.add(name, number);
        }
    }

    public void remove(String name)
    {
        contacts.remove(name);
    }

    public Boolean hasEntry(String name)
    {
        Boolean result = false;

        for(Map.Entry<String, List<String>> entry : contacts.entrySet())
        {
            if(entry.getKey().equals(name) || entry.getValue().contains(name))
            {
                return true;
            }
        }
        return result;
    }

    public List<String> lookup(String name)
    {
        return contacts.get(name);
    }

    public String reverseLookup(String phoneNumber)
    {
        for(Map.Entry<String, List<String>> entry : contacts.entrySet())
        {
            List<String> currentNumbersForContact = entry.getValue();
            if(currentNumbersForContact.contains(phoneNumber))
            {
                return entry.getKey();
            }
        }

        return "";
    }

    public List<String> getAllContactNames()
    {
        Set<String> names = new HashSet<>();
        List<String> nameDirectory = new ArrayList<>();

        names = contacts.keySet();

        for(String name : names)
        {
            nameDirectory.add(name);
        }

        return nameDirectory;
    }

    public Map<String, List<String>> getMap()
    {
        return contacts;
    }
}
