package homework_additional;

import java.util.Scanner;

/**
 * Created by User on 08.12.2016.
 */
public class Task_add_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter  month");
        int month = scan.nextInt();


        if (month == 1 && month == 2 && month == 12) {
            System.out.println("winter");
        } else if (month >= 3 && month <= 5) {
            System.out.println("spring");
        } else if (month >= 6 && month <= 8) {
            System.out.println("summer");
        } else if (month >= 9 && month <= 11) {
            System.out.println("outumn");
        } else {
            System.out.println(" wrong number");
        }

    }
}
