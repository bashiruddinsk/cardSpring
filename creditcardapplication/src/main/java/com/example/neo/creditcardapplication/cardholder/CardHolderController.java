package com.example.neo.creditcardapplication.cardholder;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:4200")
public class CardHolderController {

    @Autowired
    private CardHolderService cardHolderService;

    @PostMapping("/validate")
    public boolean validate(@RequestBody CardHolderEntity cardHolder) {
        System.out.println("Validating user with phone number: " + cardHolder);
        return cardHolderService.validateCardHolder(cardHolder);
    }
}
