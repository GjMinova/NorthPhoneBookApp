package com.north.phonebook.app.resource.phonebook;

import com.north.phonebook.app.NorthPhonebookAppApplication;
import org.json.JSONException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = NorthPhonebookAppApplication.class,
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PhoneBookResourceIT {

    @LocalServerPort
    private int port;

    TestRestTemplate restTemplate = new TestRestTemplate();

    HttpHeaders headers = new HttpHeaders();

    @Test
    public void testRetrieveStudentCourse() throws JSONException {

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);

        final ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/phonebook/contacts"),
                HttpMethod.GET, entity, String.class);

        String expected = "{id:0,name:Gjurgjica,phoneNumber:+38976668498}";

        JSONAssert.assertEquals(expected, response.getBody(), false);
    }

    private String createURLWithPort(final String uri) {
        return "http://localhost:" + port + uri;
    }
}
