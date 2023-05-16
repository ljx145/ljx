package com.csa.num2;

//自定义异常，当输入的类型不符合就会抛出
public class InputMismatchException extends RuntimeException{
    public InputMismatchException() {
    }

    public InputMismatchException(String message) {
        super(message);
    }
}