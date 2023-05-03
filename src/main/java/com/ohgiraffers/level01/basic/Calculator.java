package com.ohgiraffers.level01.basic;

public class Calculator {

    public void checkMethod(){
        System.out.println("메소드 호출 확인");
    }

    public int sum1to10(){
        return 5*(1+10);
    }

    public void checkMaxNumber(int a, int b){
        if(a > b) System.out.println("두 수 중 큰 수는 "+ a +"이다.");
        else System.out.println("두 수 중 큰 수는 "+ b +"이다.");
    }

    public int sumTwoNumber(int a, int b){
        return a + b;
    }

    public int minusTwoNumber(int a, int b){
        return a - b;
    }
}
