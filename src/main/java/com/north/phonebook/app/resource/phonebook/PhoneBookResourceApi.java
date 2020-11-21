package com.north.phonebook.app.resource.phonebook;

import com.north.phonebook.app.model.PhoneBookDTO;
import com.north.phonebook.app.service.phonebook.PhoneBookService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@RestController
@RequestMapping("/phonebook/contacts")
public class PhoneBookResourceApi {

    private static final Logger logger = LogManager.getLogger(PhoneBookResourceApi.class);

    private final PhoneBookService phoneBookService;

    @Autowired
    public PhoneBookResourceApi(final PhoneBookService phoneBookService) {
        this.phoneBookService = phoneBookService;
    }

    @GetMapping
    public ResponseEntity<?> searchContacts(@RequestParam("name") final String name,
            @RequestParam("phoneNumber") final String phoneNumber) {

        logger.info("Received request for searching contacts with name: {}, phoneNumber: {}", name, phoneNumber);
        final List<PhoneBookDTO> response = phoneBookService.findContacts(name, phoneNumber);
        return null;
    }

    @PostMapping
    public String createContacts(@Valid @RequestBody final PhoneBookDTO phoneBookDTO) {

        logger.info("Received request for creating new phonebook contact with data: {}.", phoneBookDTO);

        return null;
    }
}
