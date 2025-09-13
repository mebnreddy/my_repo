package com.bnreddy.exercises.service;

import org.springframework.stereotype.Service;

@Service
public class ExercisesService {

    public String add(String firstString, String secondString) {

        firstString = new StringBuilder(firstString).reverse().toString();
        secondString = new StringBuilder(secondString).reverse().toString();

        int maxLen = Math.max(firstString.length(), secondString.length());
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < maxLen; i++) {
            char firstCh = firstString.length() > i ? firstString.charAt(i) : '0';
            char secondCh = secondString.length() > i ? secondString.charAt(i) : '0';

            int sum = Integer.parseInt(String.valueOf(firstCh)) + Integer.parseInt(String.valueOf(secondCh)) + carry;
            carry = 0;

            if (sum > 9) {
                carry = 1;
                sum = sum % 10;
            }

            sb.append(sum);
        }

        if (carry > 0) {
            sb.append(carry);
        }

        return sb.reverse().toString();
    }
}
