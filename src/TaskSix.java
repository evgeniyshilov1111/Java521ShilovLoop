import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        //Todo 6: Пропуск четных чисел
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) continue;
            System.out.println(i);
        }
    }
}
