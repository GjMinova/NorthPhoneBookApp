package com.north.phonebook.app.service.phonebook;

import com.north.phonebook.app.model.PhoneBookDTO;

import java.util.List;

public interface PhoneBookService {

    List<PhoneBookDTO> findContacts(String name, String phoneNumber);
}
