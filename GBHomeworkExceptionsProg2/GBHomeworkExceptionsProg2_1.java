package GBHomeworkExceptionsProg.GBHomeworkExceptionsProg2;

import java.util.Scanner;

/**
 * Реализуйте метод, который запрашивает у пользователя 
 * ввод дробного числа (типа float), и возвращает введенное 
 * значение. 
 * Ввод текста вместо числа не должно приводить к падению 
 * приложения, вместо этого, необходимо повторно запросить 
 * у пользователя ввод данных.
 */

public class GBHomeworkExceptionsProg2_1 {
    public static void main(String[] arg) {
        boolean flag = true;
        while (flag) {
            System.out.println("Введите вещественное число:");
            try{
                Scanner console = new Scanner(System.in);
                Float num = console.nextFloat();
                System.out.printf("Введено число %f\n", num);
                flag = false;
            } 
            catch (Exception e) {
                System.out.println("Вы ввели символ, а не число " +
                "или вещественное число с точкой, а не с запятой");
            }
        }
    }
}
