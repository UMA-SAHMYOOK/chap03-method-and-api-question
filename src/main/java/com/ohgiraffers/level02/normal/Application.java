package com.ohgiraffers.level02.normal;

public class Application {

    public static void main(String[] args) {
        RandomMaker ran = new RandomMaker();

        //첫 번째 인자의 최소값 부터 두 번째 인자까지 범위의 난수를 출력 (randomNumber 호출)
        System.out.println(ran.randomNumber(1, 20));

        //인자로 전달한 정수 길이의 랜덤한 문자열을 출력함 (randomUpperAlphabet 호출)
        System.out.println(ran.randomUpperAlphabet(20));

        //가위, 바위, 보 중 한 가지를 출력함 (rockPaperScissors 호출)
        System.out.println(ran.rockPaperScissors());

        //앞면, 뒷면 중 한 가지를 출력함 (tossCoin 호출)
        System.out.println(ran.tossCoin());


    }
}
