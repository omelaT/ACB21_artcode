package firstclass;

import java.util.Scanner;

/**
 2) Ввести с клавиатуры три числа, положительные возвести в куб, а отрица-

 тельные заменить на 0.
 */
public class Second {
    public static void main(String[] args) {
        int cub = 3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scan.nextInt();
        System.out.println("Enter second number");
        int b = scan.nextInt();
        System.out.println("Enter third number");
        int c = scan.nextInt();


        if (a > 0) {
            a = (int) Math.pow(3, a);
        } else {
            a = 0;
        }
        if (b > 0) {
           b = (int) Math.pow(3, b);
        } else {
            b = 0;
        }
        if (c > 0) {
            c = (int) Math.pow(3, c);
        } else {
            c = 0;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
