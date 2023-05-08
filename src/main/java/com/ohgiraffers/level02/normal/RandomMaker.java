package com.ohgiraffers.level02.normal;

public class RandomMaker {


  public static int randomNumber(int min, int max) { // 0~ 9-3+1  0~7 -> 3 ~ 10
    //System.out.println("min 에서 max 사이의 값 : (Math.random() * (max - min + 1));
    return (int) (Math.random() * (max - min + 1) + min);
    }

    public static String randomUpperAlphabet  (int length) {
      String a = "";
      for(int i = 0; i<length;i++){
        a+=(char)((int)(Math.random()*26)+65); // 91은 포함 안하니깐 math random이 1을 포함하지 않으니깐,
        // 65~90이 되고  65~90은 char형으로 변환
      }
      return a;
    }


    public static String rockPaperScissors() {
   int random = (int) ((Math.random()* 3));
      if( random == 0) return "가위";  // return 값 < - String은 문자열 이니깐 "가위" 라고 표시한다.
      else if( random == 1) return "바위";
      else return "보";

    }
    public static String tossCoin() {
    int random =(int) ((Math.random() * 2));
    if ( random == 0) return "앞면";
    else return "뒷면";
    }


}
