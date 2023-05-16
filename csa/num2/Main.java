package com.csa.num2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //正则表达式
        Pattern p = Pattern.compile("[0-9]+");
        int marks;
        while (true){
            try{
                System.out.println("请输入你的分数：");
                String score=in.nextLine();
                //看输入的是否满足正则表达式
                Matcher m = p.matcher(score);
                //接受判断的结果
                boolean b = m.matches();
                if(!b){
                    //不满足就抛出异常
                    throw new InputMismatchException();
                }else{
                    marks = Integer.parseInt(score);
                    if(marks<0||marks>100){
                        throw new ValueOutOfBoundException();
                    }
                }
                System.out.println("恭喜你，你获得了"+marks+"分");
                break;
            }catch (ValueOutOfBoundException e){
                System.out.println("输入的数字超出边界，分数必须为0-100！");
            }catch (InputMismatchException e){
                System.out.println("输入的类型有误，分数必须为0-100！");
            }
        }
    }
}
