package Homework;

import java.util.Scanner;

/**
 4.2. Пользователь вводит три числа с консоли, нужно вывести на консоль наибольшее, наименьшее
 */
public class Task4_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter  first number");
        int a = scan.nextInt();
        System.out.println("Enter  second number");
        int b = scan.nextInt();
        System.out.println("Enter  third number");
        int c = scan.nextInt();


        if (a>b && a>c && b<c ){
            System.out.println(" max "+ a +" "+" min " +b );
        }
        else if((a>b && a>c &&  c<b)) {
            System.out.println(" max "+ a +" "+" min " +c );
        }
        else if(b >a && b > c && a<c) {
            System.out.println(" max "+ b + " "+" min " +a);
        }
        else if(b >a && b > c && c<a) {
            System.out.println(" max " + b + " " + " min " + c);
        }
        else if(c >a && c > b && a<b) {
            System.out.println(" max "+ c + " "+" min " +a);
        }
        else if(c >a && c > b && b<a) {
            System.out.println(" max " + c + " " + "min " + b);
        }
}}
