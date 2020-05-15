package com.codegym.services;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImp implements CalculatorService {
    public String calculator(char operator, double first, double second) {
        switch (operator) {
            case '+':
                return String.valueOf(first + second);
            case '-':
                return String.valueOf(first - second);
            case '*':
                return String.valueOf(first * second);
            case '/':
                if (second != 0) {
                    return String.valueOf(first / second);
                } else {
                    return "Can't divide by zero";
                }
            default:
                return "Invalid Operator";
        }
    }
}
