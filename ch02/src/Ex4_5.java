import java.util.Scanner;

public class Ex4_5 {
    public static void main(String[] args) {
        int score = 0;
        char grad = ' ', opt = '0';

        System.out.println("점수를 입력하세요.>");

        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        System.out.printf("당신의 점수는 %d입니다.%n", score);

        if (score >= 90) {
            grad = 'A';
            if (score >= 98) {
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            }
        } else if (score >= 80) {
            grad = 'B';
            if (score >=88) {
                opt = '+';
            } else if (score < 84) {
                opt = '-';
            }
        } else {
            grad = 'C';
        }

        System.out.printf("당신의 학점은 %c%c입니다. %n", grad, opt);
    }
}
