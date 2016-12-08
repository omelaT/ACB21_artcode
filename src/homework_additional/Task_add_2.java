package homework_additional;

import java.util.Scanner;

/**
 2) Ввести с клавиатуры три числа, положительные возвести в куб, а отрица-

 тельные заменить на 0.
 */
public class Task_add_2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scan.nextInt();
        System.out.println("Enter second number");
        int b = scan.nextInt();
        System.out.println("Enter third number");
        int c = scan.nextInt();


        if (a > 0) {
            a = (int) Math.pow(a, 3);
        } else {
            a = 0;
        }
        if (b > 0) {
           b = (int) Math.pow(b, 3);
        } else {
            b = 0;
        }
        if (c > 0) {
            c = (int) Math.pow(c, 3);
        } else {
            c = 0;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
