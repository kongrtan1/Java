package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("학생 수를 입력하세요:");
        int count = scanner.nextInt();


        int[][] array = new int[count][3];
        String[] subject = {"국어", "수학", "영어"};

        for (int i = 0; i < count; i++) {
            System.out.println((i+1) + " 번 학생의 성적을 입력하세요");
            for(int j = 0; j<3; j++){
                System.out.println(subject[j] + "점수: ");
                array[i][j] = scanner.nextInt();
            }
        }
        for(int i=0; i<count; i++){
            int total=0;
            for(int j= 0; j<3; j++){
                total+=array[i][j];
            }
            double average = (double) total/3.0;
            System.out.println((i+1) + "번 학생의 총점: " + total + ", 평균: " +average);
        }
    }
}
