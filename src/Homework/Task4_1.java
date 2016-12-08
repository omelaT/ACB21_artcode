package Homework;

import java.util.Scanner;

/**
 4.1. Пользователь вводит параметр с консоли (текущий час от 0 до 24)
 Если время от 9 до 18, то выводим "Я на работе", в другом случае "Я отдыхаю")
 */
public class Task4_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter  time");
        int time = scan.nextInt();


        if (time >= 9 && time <=18 ) {
            System.out.println("Я на работе");
        } else if (time > 18 && time <=24 || time>=0 && time<9) {
            System.out.println("Я отдыхаю");
        } else {
            System.out.println(" wrong number");
        }

    }
}

