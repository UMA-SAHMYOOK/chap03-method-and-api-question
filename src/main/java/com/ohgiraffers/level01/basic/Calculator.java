package com.ohgiraffers.level01.basic;

public class Calculator {
    public void checkMthod(){
        System.out.println("메소드 호출 확인");
    }

    public int sum1to10(){
        int result = 0;
        for(int i = 1;i<10;i++){
            result+=i;
        }
        return result;
    }

    public void checkMaxNumber(int a,int b){
        if(a>b) System.out.println("두 수 중 큰 수는 " + a +"이다");
        else System.out.println("두 수 중 큰 수는 " + b +"이다");

    }

    public int sumTwoNumer(int a, int b){
        return a+b;
    }

    public int minusTwoNumber(int a, int b){
        return Math.abs((a-b));
    }

}
