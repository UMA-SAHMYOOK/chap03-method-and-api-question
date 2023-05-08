package com.ohgiraffers.level01.basic;

public class Calculator {

    public void checkMethod(){
        System.out.println("매소드 호출 확인");
    }

    public int sum1to10(){
        int result1 = 0;
        for ( int i = 1; i<=10; i++){
            result1 += i;
        }
        return result1;
    }

    public void checkMaxNumber(int a, int b) {
        if ( a > b) {
            System.out.println("큰 수는 " + a);
        } else {
            System.out.println("큰 수는 " + b);
        }
    }
    public int sumTwoNumber(int a, int b){
        int apple = 0;
        apple = a + b;

        return apple;
    }




    public int minusTwoNumber(int a, int b) {
        int banana;
        banana = a -b;
        return banana;
    }

    }
