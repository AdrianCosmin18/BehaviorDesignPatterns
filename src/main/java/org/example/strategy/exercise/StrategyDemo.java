package org.example.strategy.exercise;

import org.example.strategy.exercise.strategies.AmexStrategy;
import org.example.strategy.exercise.strategies.VisaStrategy;

public class StrategyDemo {
    public static void main(String[] args) {
        CreditCard amexCard = new CreditCard(new AmexStrategy());

        amexCard.setNumber("379185883464283");
        amexCard.setDate("04/2026");
        amexCard.setCvv("123");

        System.out.println("Is Amex valid: " + amexCard.isValid());


        CreditCard amexCard2 = new CreditCard(new AmexStrategy());

        amexCard2.setNumber("379185883464282");
        amexCard2.setDate("04/2025");
        amexCard2.setCvv("234");

        System.out.println("Is Amex valid: " + amexCard2.isValid());


        CreditCard visaCard = new CreditCard(new VisaStrategy());

        visaCard.setNumber("4539589763663402");
        visaCard.setDate("04/2023");
        visaCard.setCvv("456");

        System.out.println("Is Visa valid: " + visaCard.isValid());
    }
}
