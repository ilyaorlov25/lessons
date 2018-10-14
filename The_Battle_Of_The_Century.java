import java.util.Scanner;

public class The_Battle_Of_The_Century {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите случайное число от 1 до миллиона: ");
        long target = scan.nextLong();

        long down = 1;
        long up = 1000000;

        double random;
        long middle;
        long choose = -1;
        String answer = "0";
        int kBin=0;
        int kRan = 0;

        //РАНДОМНЫЙ МЕТОД
        while (choose!=target) {
            kRan++;
            random = down + (Math.random()*(up-down+1));
            choose = (long) random;
            if (choose>target) {
                up = choose-1;
                continue;
            } else if (choose<target) {
                down = choose+1;
                continue;
            } else if (choose==target) {
                System.out.println("Рандомным угадано.");
            }
        }

        choose = -1;
        down = 1;
        up = 1000000;

        //БИНАРНЫЙ МЕТОД
        while (choose!=target) {
            kBin++;
            middle = (down+up)/2;
            choose = (long) middle;
            if (choose>target) {
                up = choose -1;
                continue;
            } else if (choose<target) {
                down = choose+1;
                continue;
            } else if (choose==target) {
                System.out.println("Бинарным угадано.");
            }
        }

        System.out.println("_________________________________");
        System.out.println("Бинарным методом угадано за " + kBin + " попыток");
        System.out.println("Рандомным методом угадано за " + kRan + " попыток");
    }
}
