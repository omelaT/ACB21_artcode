package Homework;

import java.util.Scanner;

/**
 4.3. Пользователь вводит число. Вывести на экран его удвоенное значение, если число делится на 7 нацело.
 */
public class Task4_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter  number");
        double  a = scan.nextDouble();

        if ( a/7== (int)a/7) {
            System.out.println("удвоенное значение числа = "+ a * 2);
        } else  {
            System.out.println("это число не делится нацело на 7");
        }

}}
