package com.example.neo.creditcardapplication.creditcard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CreditCardService {

    @Autowired
    private final CreditCardRepo creditCardRepository;

    public CreditCardService(CreditCardRepo creditCardRepository) {
        this.creditCardRepository = creditCardRepository;
    }

    public Double getAmountLimit(Long phoneNumber) {
        Optional<CreditCardEntity> creditCardEntity = Optional.ofNullable(creditCardRepository.findByPhoneNumber(phoneNumber)
                .orElseThrow(() -> new RuntimeException("Credit card not found for phone number: " + phoneNumber)));
        return creditCardEntity.get().getAmountLimit();
    }

    public CreditCardEntity getCreditCardDetails(Long phoneNumber) {
        return creditCardRepository.findByPhoneNumber(phoneNumber)
                .orElseThrow(() -> new RuntimeException("Credit card not found for phone number: " + phoneNumber));
    }


}
