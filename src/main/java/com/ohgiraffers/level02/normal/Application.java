package com.ohgiraffers.level02.normal;

import org.w3c.dom.ls.LSOutput;

public class Application {

    public static void main(String[] args) {
        int random = RandomMaker.randomNumber(3, 8);        // 3~8 까지 범위난수 및 3, 8 도 포함
        System.out.println(random);
        String random1 = RandomMaker.randomUpperAlphabet(10);
        System.out.println(random1);
        System.out.println(RandomMaker.rockPaperScissors());
        RandomMaker.tossCoin();

    }


}
