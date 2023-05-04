package com.ohgiraffers.level02.normal;

public class RandomMaker {
    static public int randomNumber(int min, int max) {
     int random1 = (int) (Math.random()*(max-min+1) + min);
     return random1;
    }
    static public String randomUpperAlphabet(int length){
        String result = "";
        for(int i=0; i<length; i++) {
            int random = (int) ((Math.random() * 26) + 65);
            char randAlphabet = (char) random;
            result += String.valueOf(randAlphabet);
        }
        return result;
    }

    static public String rockPaperScissors() {
        int random = (int) ((Math.random() * 3));
        if( random == 0) return "가위";
        else if( random == 1) return "바위";
        else return "보";
    }

    static public String tossCoin() {
        int random = (int) ((Math.random() * 2));
        if( random == 0 ) return "앞면";
        else return "뒷면";
    }

}
