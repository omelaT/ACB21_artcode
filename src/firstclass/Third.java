package firstclass;

import java.util.Scanner;

/**
 3) Дано трехзначное число. Определить: а) верно ли, что все его цифры

 одинаковые; б) есть ли среди его цифр одинаковые.
 */
public class Third {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter  number");
        int f = scan.nextInt();


        /* int a = scan.nextInt(); */
        int a = f / 100;
		/* int b = scan.nextInt(); */
        int b = f / 10 % 10;
		/* int c = scan.nextInt(); */
        int c = (f/100)%10;
		/*
		 * if (k==a) { System.out.println(a); }else if (k==b) {
		 * System.out.println(b); } else if(k==c) { System.out.println( c ); }
		 */
        if ((a ==b) & (b==c))
        {System.out.println("equal");}
        else {System.out.println("not equal");
        }
    }
}
