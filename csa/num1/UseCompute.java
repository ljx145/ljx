package com.csa.num1;

public class UseCompute {
    public static void useCom(Compute com,int one,int two){
        //用result记录计算结果
        int result = com.computer(one,two);
        //判断传入的是什么类型，再进行输出
        if(com instanceof MyAdd){
            System.out.println(one+" + "+two+" = "+result);
        }else if(com instanceof MyDivide){
            //避免因为被除数为0，是得到的结果为0与除数为0返回的0进行分开
            if(result==0&&two==0){
                return;
            }else{
                System.out.println(one+" / "+two+" = "+result);
            }
        }else if(com instanceof MyMultiply){
            System.out.println(one+" * "+two+" = "+result);
        }else{
            System.out.println(one+" - "+two+" = "+result);
        }
    }
}
