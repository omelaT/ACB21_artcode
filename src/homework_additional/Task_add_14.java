package homework_additional;

import java.util.Scanner;

/**

 14) Определить, является ли шестизначное число "счастливым" (сумма
 первых трех цифр равна сумме последних трех цифр).
 */
public class Task_add_14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter  number 6 digit");
        int number = scan.nextInt();

        int first = number / 100000;
        int second = (number / 1000) % 10;
        int third = (number / 100) % 10;
        int fourth = (number / 100) % 10;
        int fifth = (number / 100) % 10;
        int six = number % 10;

        int firstPart = first + second + third;
        int secondPart = fourth + fifth + six;

        if (number >= 100000 && number <= 999999) {
            if (firstPart == secondPart) {
                System.out.println("you are lucky!");
            } else {System.out.println(" try again(( ");}
        } else {
            System.out.println("wrong number");
        }
    }
}
