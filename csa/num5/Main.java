package com.csa.num5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("S = ");
        String s = in.nextLine();
        System.out.print("words(以‘,’隔开) = ");
        String str = in.nextLine();
        //用分割符来获取字符串组
        String []words = str.split(",");
        System.out.println(hasSubsequence(s,words));
    }
    //定义函数来判断t是否为s的子序列
    public static boolean isSubsequence(String s, String t) {
        int position = 0;
        for(int i = 0; i < t.length(); i++){
            position = s.indexOf(t.charAt(i), position);
            if(position == -1)
                return false;
            //更新位置，从找到的下一个位置开始寻找下一个字符
            position++;
        }
        return true;
    }
    //定义函数从字符串数组中找到是字符串s子序列的个数
    public static int hasSubsequence(String s, String[] words){
        int count=0;
        for(String i : words){
            if(isSubsequence( s,i )){
                count++;
            }
        }
        return count;
    }
}
