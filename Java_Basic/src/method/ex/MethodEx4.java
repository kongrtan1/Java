package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int balance = 0;

        while (true) {
            System.out.println("----------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("----------------------------------");
            int option = input.nextInt();
            System.out.println("선택: " + option);

            if (option == 1) {
                System.out.print("입금액을 입력하세요: ");
                int in = input.nextInt();
                balance += in;
                System.out.println(in + "원을 입금하였습니다. 현재 잔액: " + balance + "원");

            } else if (option == 2) {
                System.out.print("출금액을 입력하세요: ");
                int out = input.nextInt();
                if (balance < out) {
                    System.out.println(out + "원을 출금하려 했으나 잔액이 부족합니다.");
                    continue;
                }
                balance -= out;
                System.out.println(out + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
            } else if (option == 3) {
                System.out.println("현재 잔액: " + balance);
            } else if (option == 4) {
                System.out.println("시스템을 종료합니다.");
                break;
            }
        }
    }
}
