package com.csa.num3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入所有数的总数N：");
        int n = in.nextInt();
        int sum=0;
        for(int i=0;i<n;){
            try{
                System.out.println("请输入第"+(i+1)+"个数字");
                int num = in.nextInt();
                if(num<0){
                    throw new ValueNotNegativeNumberException();
                }else{
                    sum+=num;
                    i++;
                }
            }catch (ValueNotNegativeNumberException e){
                System.out.println("输入的数字必须是正数或者零，请重新输入！");
            }
        }
        System.out.println(n+"个数的平均数为："+(double)sum/n);
    }
}
