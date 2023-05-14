package com.csa.num1;

import java.util.Scanner;

public class MyDivide implements Compute{
    Scanner in=new Scanner(System.in);
    @Override
    public int computer(int n, int m) {
        if(m==0){
            System.out.println("除数不能为0，请重新输入！");
            System.out.print("被除数为：");
            n=in.nextInt();
            System.out.print("除数为：");
            m=in.nextInt();
            computer(n,m);
        }
        return n/m;
    }
}
