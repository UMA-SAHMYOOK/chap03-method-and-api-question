package com.ohgiraffers.level01.basic;
public class Application {

    public static void main(String[] args) {

        Calculator app = new Calculator();
        app.checkMethod();
        System.out.println("1부터 10까지의 합 : " + app.sum1to10());
        app.checkMaxNumber(10, 20);
        int sum = app.sumTwoNumber(10, 20);
        System.out.println("10과 20의 합은 : " + sum);
        int min = app.minusTwoNumber(10, 5);
        System.out.println("10과 5의 차는 : " + min);


    }
}
