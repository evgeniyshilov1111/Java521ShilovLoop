import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        //Todo 3: Пирамида из звездочек
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество уровней пирамиды: ");
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= number; i++) {

            for (int w = 0; w < number - i; w++) {
                System.out.print("-");
            }
            for (int w = 0; w < 1 + count; w++) {
                System.out.print("*");
            }
            for (int w = 0; w < number - i; w++) {
                    System.out.print("-");
            }
            count = count + 2;
            System.out.println();
        }
    }
}
