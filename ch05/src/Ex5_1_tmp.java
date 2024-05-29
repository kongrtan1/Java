import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class Ex5_1_tmp {
    public static void main(String[] args) {
//        int [] score; // 1. 배열 score를 선언(참조변수)
//        score = new int[5]; //2. 배열의 생성 (int 저장공간 *5 )

//        int[] score = new int[5]; // 배열의 선언과 생성을 동시에
//        score[3] = 100;
//
//        System.out.println("score[0]=" + score[0]);
//        System.out.println("score[1]=" + score[1]);
//        System.out.println("score[2]=" + score[2]);
//        System.out.println("score[3]=" + score[3]);
//        System.out.println("score[4]=" + score[4]);
//
//        int value = score[3];
//        System.out.println("value=" + value);

//        int[] arr = new int[10]; // 길이가 5인 int 배열 arr 을 생성
//        System.out.println("arr.length=" + arr.length);
//
//        for(int i=0; i<arr.length; i++) {
//            System.out.println("arr["+i+"]=" + arr [i]);

        int[]iArr = {100, 95, 80, 70, 60};  // 길이가 5인 int 배열
        for(int i = 0; i< iArr.length; i++){
        System.out.println(iArr[i]);
        }
        System.out.println(Arrays.toString(iArr));
    }
}
