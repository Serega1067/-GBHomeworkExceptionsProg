import java.util.Scanner;
/**
 * Задача 4.
 * Разработайте программу, которая выбросит Exception, 
 * когда пользователь вводит пустую строку. 
 * Пользователю должно показаться сообщение, 
 * что пустые строки вводить нельзя.
 */

public class GBHomeworkExceptionsProg2_4 {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner console = new Scanner(System.in);
        try {
            if (console.nextLine().isEmpty()) {
                throw new RuntimeException();
            }
        } catch (RuntimeException e) {
            System.out.println("Пустые строки вводить нельзя.");
        }
    }
}
