package com.example.waiter;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping( path= "/v1/TransactionStore", produces = {MediaType.APPLICATION_JSON_VALUE})
public class QuoteController {

    @GetMapping(path = "/OrderPackage")
    public TransactionStorePackageResponse getQuote(@RequestParam(required = false) String transactionStoreId) throws InterruptedException {
        while (true) {
            Thread.sleep(1000);
        }
    }
}
