package com.example.waiter;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/moniker/v1", produces = {MediaType.APPLICATION_JSON_VALUE})
public class Controller {

    @PostMapping(path = "/phoneNumbers/{phone}")
    public String eternalWait(@PathVariable String phone) throws InterruptedException {
        while(true) {
            Thread.sleep(1000);
        }
    }

    @GetMapping(path="/available/phoneNumbers/npa/all")
    public List<String> getPhonesAll() {
        return Arrays.asList("1","2","3","4","5","6","7","8","9","10","11","12","13");
    }

    @GetMapping(path="/available/phoneNumbers/npa")
    public MonikerAvailableNpasResponse getPhones() {
        return new MonikerAvailableNpasResponse();
    }

}
