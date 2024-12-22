package com.example.neo.creditcardapplication.creditcard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@RestController
@CrossOrigin("http://localhost:4200")
public class CreditCardController {

    @Autowired
    private final CreditCardService creditCardService;

    public CreditCardController(CreditCardService creditCardService) {
        this.creditCardService = creditCardService;
    }


//    @GetMapping("/getLimit")
//    public Double getCardLimit(@RequestParam Double cardNumber) {
//        System.out.println("cardNumber");
////        return creditCardService.getAmountLimit(cardNumber);
////
//    }
//
//    @PostMapping("/login")
//    public CreditCardEntity validateUser(@RequestBody CreditCardEntity creditCard)
//    {
//
//    }




}
