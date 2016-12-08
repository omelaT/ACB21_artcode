package homework_additional;

import java.util.Scanner;

/**
 8) Вычислить стоимость покупки с учетом скидки. Скидка в 10% предос-
 тавляется, если сумма покупки превышает 1000 гривен.
 */
public class Task_add_8 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Напишите сумму покупки");
        double a = scan.nextDouble();

        if (a > 1000) {
            System.out.println("к оплате с учетом скидки 10% = " + (a-(a * 10/100)));
        } else {
            System.out.println("оплата без скидки = " + a);
        }
    }
}
