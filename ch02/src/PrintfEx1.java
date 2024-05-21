public class PrintfEx1 {
    public static void main(String[] args) {
//        System.out.println(10.0/3);

//        System.out.printf("%d%n", 15);
//        System.out.printf("%#o%n", 15); // 8진수 o
//        System.out.printf("%#x%n", 15); // 16진수 x 접두사 # 개행 %n
//        System.out.printf("%s", Integer.toBinaryString(15)); // 문자열 -> 2진수

//        double f = 123.456789;
//        System.out.printf("%f%n", f); //float 정밀도 7자리 double 정밀도 15자리
//        System.out.printf("%e%n", f); // 지수형태
//        System.out.printf("%g%n", f); //소수점 포함 7자리

        System.out.printf("[%5d]%n", 1234567); //5자리 출력 빈부분은 공백처리 //지정자리 수 넘으면 그대로 출력됨
        System.out.printf("[%-5d]%n", 10); // -를 붙이면 왼쪽 정렬
        System.out.printf("[%05d]%n", 10); // 0을 붙이면 빈자리에 0으로 채움

        double d = 1.23456789;
        System.out.printf("%.6f%n", d); //소수점 포함 14자리 소수점 아래 10자리 남은공간은 0으로 채움

        System.out.printf("[%s]%n", "www.codechobo.com");
        System.out.printf("[%20s]%n", "www.codechobo.com"); //20자리 까지 출력 나머지 공백
        System.out.printf("[%-20s]%n", "www.codechobo.com");
        System.out.printf("[%.10s]%n", "www.codechobo.com"); // 10자리 까지 출력
    }
}
