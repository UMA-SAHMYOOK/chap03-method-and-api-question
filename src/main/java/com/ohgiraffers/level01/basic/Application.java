package com.ohgiraffers.level01.basic;

public class Application {
    public static void main(String[] args) {
        Calculator a = new Calculator();
        a.checkMthod();
        System.out.println("1부터 10까지의 합 : " + a.sum1to10());
        a.checkMaxNumber(10,20);
        a.sumTwoNumer(10,20);
        System.out.println("10과 20의 합은 " + a.sumTwoNumer(10,20));
        System.out.println("10과 5의 차는 " + a.minusTwoNumber(10,5));
    }
}
