package com.csa.num1;

public class Test {
    public static void main(String[] args) {
        //测试加法
        UseCompute.useCom(new MyAdd(),3,45);
        //测试除数为0的除法
        UseCompute.useCom(new MyDivide(),45,0);
        //测试除数不为0的除法
        UseCompute.useCom(new MyDivide(),45,3);
        //测试乘法
        UseCompute.useCom(new MyMultiply(),45,3);
        //测试减法
        UseCompute.useCom(new MySubtract(),45,3);
    }
}
