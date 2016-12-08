package Homework;

import java.util.Scanner;

/**
 4.8. Вводим два числа, сравнить последнии цифры этих чисел (пользоваться оператором %)
 124    4    -   true
 1456   567  -   false
 1      2    -   false
 18     98   -   true
 */
public class Task4_8 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter  first number");
        int a = scan.nextInt();
        System.out.println("Enter  second number");
        int b = scan.nextInt();

        int lastA = a % 10;
        int lastB = b % 10;

        if (lastA == lastB) {
            System.out.println(true);
        } else {
            System.out.println("false");
        }
    }

}
