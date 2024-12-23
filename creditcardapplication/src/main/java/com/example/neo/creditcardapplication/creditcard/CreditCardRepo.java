package com.example.neo.creditcardapplication.creditcard;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CreditCardRepo extends JpaRepository <CreditCardEntity, Long>{

    Optional<CreditCardEntity> findByCardNumber(Long cardNumber);

    Optional<CreditCardEntity> findByPhoneNumber(Long PhoneNumber);
}
