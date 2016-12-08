package Homework;

import java.util.Scanner;

/**
 4.7. Вводим два числа, если одно из них делиться на другое без остатка, то выводим тру и показываем результат
 деления (целую часть от деления  и остачу)
 в другом случае выводим false и показываем результат деления (целую часть от деления  и остачу)
 */
public class Task4_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter  first number");
        int a = scan.nextInt();
        System.out.println("Enter  second number");
        int b = scan.nextInt();

        int n1 = a % b;
        int n2 = b % a;
        int n3 = a / b;
        int n4 = b / a;


        if (a % b == 0) {
            System.out.println("Число делиться без остачи " + a + "/" + b + " = " + n3);

        } else if (b % a == 0) {
            System.out.println("Число делиться без остачи " + b + "/" + a + " = " + n4);
        } else if (a % b != 0) {
            System.out.println("Число делиться с остачей " + a + "/" + b + " = " + n3 + "." + n1);
        } else if (b % a != 0) {
            System.out.println("Число делиться с остачей " + b + "/" + a + " = " + n4 + "." + n2);
        }
    }
}