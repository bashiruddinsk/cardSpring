package com.example.neo.creditcardapplication.creditcard;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "creditcard")
public class CreditCardEntity {

    @Id
    @Column(name = "cardNumber")
    private Long cardNumber;

    @Column(name = "cvv")
    private Integer cvv;

    @Column(name = "expiryDate")
    private String expDate;

    @Column(name = "phoneNumber")
    private Long phoneNumber;

    @Column(name = "amountLimit")
    private Double amountLimit;

    public CreditCardEntity() {}



    public Long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Double getAmountLimit() {
        return amountLimit;
    }

    public void setAmountLimit(Double amountLimit) {
        this.amountLimit = amountLimit;
    }
}
