package com.example.demo.com.glo.addressBook;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class AddressBook {

    private Trie<Contact> trie;
    public AddressBook() {
        trie=new Trie<>();
    }

    public void addContact(Contact contact) {
        //TODO
        List<Contact> contacts=trie.look(contact.getName().toLowerCase());
        if(!contacts.isEmpty()) {
           throw new RuntimeException("Contact already exists");
        }
        trie.insert(contact.getName().toLowerCase(), contact);
    }

    public void deleteContact(String name) {
        //TODO
       Contact contact=searchByName(name.toLowerCase()).stream().filter(c->c.getName().equalsIgnoreCase(name)).findAny().orElse(null);
       if(contact==null)
       {
           throw new RuntimeException("Contact doesnt exists");
       }
       trie.delete(name,contact);
    }

    public void updateContact(String name, Contact contact) {
        //TODO
        List<Contact> contactList=trie.search(name.toLowerCase());
        if(!contactList.isEmpty())
        {
            deleteContact(name);
            trie.insert(name,contact);
        }else{
            trie.insert(name,contact);
        }

    }

    public List<Contact> searchByName(String name) {
        //TODO
        List<Contact> contactList= trie.search("");

        return contactList.stream().filter(c->c.getName().toLowerCase().startsWith(name.toLowerCase())).collect(Collectors.toList());

    }

    public List<Contact> searchByOrganisation(String organisation) {
        //TODO
        List<Contact> contactList= trie.search("");

        return contactList.stream().filter(c->c.getOrganisation().toLowerCase().startsWith(organisation.toLowerCase())).collect(Collectors.toList());

    }

}