package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("하나의 정수를 입력하세요:");
        int num1 = scanner.nextInt();

        if(num1 % 2 == 1){
            System.out.println("입력한 숫자 " + num1 + "는 홀수입니다.");
        }else {
            System.out.println("입력한 숫자 " + num1 + "는 짝수입니다.");
        }
    }
}
