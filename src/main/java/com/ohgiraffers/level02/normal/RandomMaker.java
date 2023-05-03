package com.ohgiraffers.level02.normal;

public class RandomMaker {

    public int randomNumber(int min, int max){
        return ((int)(Math.random() * (max-min+1)) + min);
    }

    public String randomUpperAlphabet(int length){
        String result = "";
        for(int i = 0; i < length; i++){
            result += (char)((Math.random() * (90 - 65 + 1)) + 65);
        }
        return result;
    }

    public String rockPaperScissors(){
        double tmp = (Math.random() * 3);
        if(tmp >= 0 && tmp < 1) return "바위";
        else if (tmp >= 1 && tmp < 2) return "가위";
        else return "보";
    }

    public String tossCoin(){
        int coin = (int)((Math.random() * 10) + 1);
        if(coin % 2 == 0) return "앞면";
        else return "뒷면";
    }
}
