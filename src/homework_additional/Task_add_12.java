package homework_additional;

import java.util.Scanner;

/**
 12) Написать программу, которая в зависимости от характера ветра выдает
 сообщение о его скорости от 1до 4 м/с - слабый (1); от 5-10 м/c -
 умеренный (2); от 9-18 м/c - сильный (3); больше 19 м/c - ураганный (4).
 */
public class Task_add_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите скорость ветра");
        int a = scan.nextInt();

        if (a >= 1 && a <= 4) {
            System.out.println("ветер  слабый");
        } else if (a >= 5 && a <= 10) {
            System.out.println("ветер  умеренный");
        } else if (a >= 11 && a <= 18) {
            System.out.println("ветер  сильный");
        } else if (a >= 19 && a <= 100) {
            System.out.println("ветер  ураганный");
        } else if (a == 0) {
            System.out.println("штиль");
        } else {
            System.out.println("неверное число");
        }
    }
}