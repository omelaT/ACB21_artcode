package homework_additional;

import java.util.Scanner;

/**
 11) Написать программу, которая при вводе числа в диапазоне от 1 до 99
 добавляет к нему слово "копейка" в правильной форме. Например, 1
 копейка, 5 копеек, 42 копейки .
 */
public class Task_add_11 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите количество копеек от 1 до 99");
        int a = scan.nextInt();

        if (a == 1 || a == 21 || a == 31 || a == 41 || a == 51 || a == 61 || a == 71 || a == 81 || a == 91) {
            System.out.println(a + " копейка");
        } else if ((a >= 2 && a <= 4 )|| (a >= 22 && a <= 24) || (a >= 32 && a <= 34) || (a >= 42 && a <= 44) || (a >= 52 && a <= 54)
                || (a >= 62 && a <= 64) || (a >= 72 && a <= 74) || (a >= 82 && a <= 84) || (a >= 92 && a <= 94))
        {System.out.println(a + " копейки");
        } else if ((a >= 5 && a <= 20 )|| (a >= 35 && a <= 40) || (a >= 45 && a <= 50) || (a >= 55 && a <= 60) || (a >= 65 && a <= 70) ||
                (a >= 75 && a <= 80) || (a >= 85 && a <= 90) || (a >= 95 && a <= 99))
        {
            System.out.println(a+ " копеек");

        } else {
            System.out.println("вы ввели неверное число");

        }
    }
}
