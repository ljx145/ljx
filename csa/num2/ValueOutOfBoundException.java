package com.csa.num2;

//自定义异常，当输入的数字超过范围就会抛出
public class ValueOutOfBoundException extends RuntimeException{
    public ValueOutOfBoundException() {
    }

    public ValueOutOfBoundException(String message) {
        super(message);
    }
}
