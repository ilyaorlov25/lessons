import java.util.Scanner;

public class Random_Search {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите диапазон натуральных чисел" + "\n" + "Пример: 5 500");
        long down = scan.nextLong();
        long up = scan.nextLong();

        System.out.println("Загадайте число из выбранного диапазона и программа его угадает" + "\n" + "Когда выберете, введите любую букву или слово");
        String a = scan.next();

        double random;
        long choose;
        String answer = "0";
        int k=0;

        while (answer.equals("=") == false) {
            k++;
            random = down + (Math.random()*(up-down+1));
            choose = (long) random;
            System.out.println("Это " + choose + "?" + "\n" + "Если ваше число больше, введите + " + "\n" + "Если ваше число меньше, введите - " + "\n" + "Если число угадано, введите = ");
            answer = scan.next();
            if (answer.equals("+")) {
                down = choose+1;
                continue;
            } else if (answer.equals("-")) {
                up = choose-1;
                continue;
            } else if (answer.equals("=")) {
                System.out.println("Мы угадали ваше число за " + k + " попыток(-ки)(-ку). " + "Это - " + choose);
            } else {
                System.out.println("Вы ввели незадействованный знак");
            }
        }

        System.out.println("_________________________________");
        System.out.println("Спасибо за игру!");
    }
}