package Homework;

import java.util.Scanner;

/**
 4.6. Вводим два числа, вывести их суму, если она в диапазоне от 11 до 19.

 */
public class Task4_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter  first number");
        int a = scan.nextInt();
        System.out.println("Enter  second number");
        int b = scan.nextInt();

        if ( (a+b)>=11 && (a+b)<=19){
            System.out.println( "сумма чисел = " + (a+b));
        }else {
            System.out.println( "сумма чисел не входит в диапазон " );
        }
}}
