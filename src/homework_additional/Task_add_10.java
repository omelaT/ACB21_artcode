package homework_additional;

import java.util.Scanner;

/**
 10) Написать программу вычисления стоимости переговоров, если по суббо-
 там и воскресеньям предоставляется 20% скидка. Ввести продолжитель-
 ность разговора и день недели (цифра от 1 до 7).
 */
public class Task_add_10 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите день переговоров ( ПН -1; ВТ-2;СР-3;ЧТ-4;ПТ-5;СБ-6;ВС-7");
        int a = scan.nextInt();
        System.out.println("введите продолжительность переговоров ");
        int b = scan.nextInt();
        System.out.println("введите стоимость аренды за 1 час");
        int c = scan.nextInt();

        if (a >= 1 && a <= 5) {
            System.out.println("стоимость переговоров в будние дни будет = " +  b * c + " $");
        } else if (a == 6 || a == 7) {
            System.out.println("стоимость переговоров в выходные дни будет = " + ((b * c) - ( b * c) * 10 / 100) + " $");
        } else {
            System.out.println("вы ввели неверный день  недели");
        }
    }
}
