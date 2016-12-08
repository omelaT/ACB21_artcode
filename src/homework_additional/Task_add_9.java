package homework_additional;

import java.util.Scanner;

/**
 9) Написать программу вычисления идеального веса пользователя (рост-
 100). Выдать рекомендации о необходимости поправиться либо поху-
 деть.
 */
public class Task_add_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ведите ваш  рост");
        int a = scan.nextInt();
        System.out.println("Ведите ваш  вес");
        int b = scan.nextInt();

        if ((a-100)==b ){
            System.out.println("Ты в отличной форме");
        } else if ((a-100)>b) {
                System.out.println("Нужно  лучше питаться");
        } else {
            System.out.println("Больше кардио!");
        }
    }
}
