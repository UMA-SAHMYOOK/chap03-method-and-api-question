package com.ohgiraffers.level02.normal;

public class RandomMaker {
    public static int randomNumber(int min, int max){
        int result = (int)(Math.random() * (Math.abs(min-max))+1) + min;
        return result;
    }

    public static String randomUpperAlpabet(int length){
        String a = "";
        for(int i = 0; i<length;i++){
            a+=(char)((int)(Math.random()*26)+65);
        }
        return a;
    }
    public static String rockPaperScissors(){
        String str = new String();
        int a = (int)(Math.random()*3);
        switch (a){
            case 0 : str = "가위"; break;
            case 1 : str = "바위"; break;
            case 2 : str = "보"; break;
        }
        return str;
    }
    public static String tossCoin(){
        String str = new String();
        int a= (int)(Math.random()*2);
        if(a==0) str = "앞면";
        else str = "뒷면";
        return str;


    }
}
