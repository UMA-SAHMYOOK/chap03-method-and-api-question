package com.ohgiraffers.level01.basic;

public class Calculator {

    public void checkMethod() {
        System.out.println("메소드 호출 확인");
    }
    public int sum1to10() {
        int result = 0;
        for(int i = 1; i < 11; i++){
            result += i;
        }
        return result;
    }

    public void checkMaxNumber(int a, int b) {
        if( a > b) System.out.println("둘 중 큰 수는 " + a + "입니다.");
        else System.out.println("둘 중 큰 수는 " + b + "입니다.");
    }

    public int sumTwoNumber(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public int minusTwoNumber(int a, int b) {
        int min = a - b;
        return min;
    }
}
