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


       @GetMapping("/getLimit")
       public Double getCardLimit(@RequestParam Long phoneNumber) {
       System.out.println("phoneNumber -------- gett mapping"+phoneNumber);
           return creditCardService.getAmountLimit(phoneNumber);
    }



    @GetMapping("/getCreditCardDetails")
    public ResponseEntity<CreditCardEntity> getCreditCardDetails(@RequestParam Long phoneNumber) {
        System.out.println("Fetching credit card details for phone number: " + phoneNumber);
        CreditCardEntity creditCard = creditCardService.getCreditCardDetails(phoneNumber);

        System.out.println(creditCard);
        return ResponseEntity.ok(creditCard);
    }




}
