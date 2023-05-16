package com.csa.num1;

public class MyDivide implements Compute{
    @Override
    public int computer(int n, int m) {
        //判断除数为0的情况，除数为0则返回0
        if(m==0){
            System.out.println("除数不能为0,无法计算");
            return 0;
        }
        return n/m;
    }
}
