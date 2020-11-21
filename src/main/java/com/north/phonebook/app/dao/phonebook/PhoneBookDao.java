package com.north.phonebook.app.dao.phonebook;

import com.north.phonebook.app.entity.PhoneBook;

import java.util.List;

public interface PhoneBookDao {

    List<PhoneBook> findContacts(String name, String phoneNumber);
}
