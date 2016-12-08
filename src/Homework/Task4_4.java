package Homework;

import java.util.Scanner;

/**
 4.4. Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно в диапазоне от 0 до 1
 */
public class Task4_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter  number");
        double  number = scan.nextDouble();


        if ((number >=0 && number <= 1)) {
            System.out.println("число лежит в диапазоне от 0 до 1");
        } else {
            System.out.println("число выходит за  диапазоне от 0 до 1");
        }
}}
