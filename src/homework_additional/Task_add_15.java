package homework_additional;

import java.util.Scanner;

/**
 15) Известны площади круга и квадрата. Определить: а) уместится ли круг в
 квадрат; б) уместится ли квадрат в круге.
 */
public class Task_add_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите площадь круга");
        int Scrug = scan.nextInt();
        System.out.println("введите площадь квадрата");
        int Scvadrat = scan.nextInt();

        double p = 3.14;
        double D = Scrug * 4 / p;
        double a;

        System.out.println(" сторона квадрата = " + Math.sqrt(Scvadrat));
        System.out.println(" диаметр круга  = " + Math.sqrt(D));

        /*
          S=(P/4)*D2 ; crug; S cv = a*a
         */

        if (Math.sqrt(Scvadrat) >= Math.sqrt(D)) {
            System.out.println("круг поместиться в квадрате");
        } else if (Math.sqrt(Scvadrat) <= Math.sqrt(D)){
            System.out.println("квадрат поместится в круге");
        } else {
            System.out.println("они одинаково могут поместится  друг в друге");
        }

    }
}