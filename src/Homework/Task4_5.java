package Homework;

import java.util.Scanner;

/**
 4.5. Вводим 2 числа. Если первое число больше второго, то вывести на экран разницу чисел.
 Если второе больше, то выводим сумму.

 */
public class Task4_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter  first number");
        int a = scan.nextInt();
        System.out.println("Enter  second number");
        int b = scan.nextInt();

        if (a>b){
            System.out.println( "разница чисел равна "+(a-b));
        }else {
            System.out.println( "сумма чисел равна " +  (a+b));
        }
}}
