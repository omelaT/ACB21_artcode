package homework_additional;

import java.util.Scanner;

/**
 Даны три числа a, b, c. Определить, имеется ли среди них хотя бы одна
 пара равных4
 */
public class Task_add_5 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scan.nextInt();
        System.out.println("Enter second number");
        int b = scan.nextInt();
        System.out.println("Enter third number");
        int c = scan.nextInt();


        if (a==b && a==c && b==c){
            System.out.println("all is equal");
        }
        else  if ( a== b || a==c || b==c) {
            System.out.println("One pair is equal");
        } else {
            System.out.println("no one pair is equal");
        }

    }
}


