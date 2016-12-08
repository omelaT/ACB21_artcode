package homework_additional;

import java.util.Scanner;

/**
 13) Даны три числа A,B,C. Увеличить числа в два
 раза, если A+B+C>0, в противном случае заменить
 на нули.
 */
public class Task_add_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите  чило А");
        int a = scan.nextInt();
        System.out.println("введите  чило В");
        int b = scan.nextInt();
        System.out.println("введите  чило С");
        int c = scan.nextInt();

        if ((a+b+c)>0) {
            System.out.println("A= "+a*2 + " "+"B= "+ b*2 + " " +"C= " +c*2);
        }else {
            System.out.println("A= " + 0 + " " + "B= " + 0 + " " + "C = " + 0);
        }
    }
}
