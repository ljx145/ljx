package com.csa.num3;

public class ValueNotNegativeNumberException extends RuntimeException{
    public ValueNotNegativeNumberException() {
    }

    public ValueNotNegativeNumberException(String message) {
        super(message);
    }
}
