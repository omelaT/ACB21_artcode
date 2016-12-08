package homework_additional;

/**
 6) У вас есть скорость и растояние, за какое время вы приедете в пукт назначания
 */
public class Task_add_6 {
   public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите значение скорости км/ч");
        double v = scan.nextInt();
        System.out.println("введите значение расстояния км ");
        double s = scan.nextInt();
        double t = s / v;
        System.out.println(t + " час");
    }
}


