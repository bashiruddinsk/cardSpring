package com.example.neo.creditcardapplication.cardholder;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "cardholderdetails")
public class CardHolderEntity {

        @Id
        @Column(name = "phoneNumber")
        private Long phoneNumber;

        @Column(name = "name")
        private String name;

        @Column(name="password")
        private String password;


        // Constructors
        public CardHolderEntity() {
        }

        public CardHolderEntity(String name, String password, Long phoneNumber) {
            this.name = name;
            this.password = password;
            this.phoneNumber = phoneNumber;
        }


    @Override
        public String toString() {
            return "CardholderDetails{" +
                   ", name='" + name + '\'' +
                    ", password='" + password + '\'' +
                    ", phoneNumber=" + phoneNumber +
                    '}';
        }


    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}



