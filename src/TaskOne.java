import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        // Todo 1: Определение года на високосность
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите год: ");
        int number = scanner.nextInt();
        if (number % 4 == 0 && number % 100 != 0 || number % 400 == 0) {
            System.out.println("год високосный");

        } else {
            System.out.println("год не високосный");
        }
    }
}
