
package homework_additional;
import java.util.Scanner;
/**
 1) Ввести с клавиатуры значения трех сторон треугольника a, b и c и опреде-

 лить, является ли он прямоугольным. Ответ вывести в виде сообщения.
 */

public class Task_add_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first side");
        int a = scan.nextInt();
        System.out.println("Enter second side");
        int b = scan.nextInt();
        System.out.println("Enter third side");
        int c = scan.nextInt();
// a2+b2=c2
        if (((a * a) + (b * b)) == (c * c)) {
            System.out.println("True");
        } else {
            System.out.println("False");


        }

    }
}
