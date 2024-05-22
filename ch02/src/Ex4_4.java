import java.util.Scanner;

public class Ex4_4 {
    public static void main(String[] args) {
        int score = 0;
        char grad = 'D';

        System.out.println("점수를 입력하세요.>");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        if (score >= 90) {
            grad = 'A';
        } else if (score >= 80) {
            grad = 'B';
        } else if (score >= 70) {
            grad = 'C';
        }
//        else {
//            grad = 'D';
//        }
        System.out.println("당신의 학점은 "+ grad + "입니다.");
    }
}
