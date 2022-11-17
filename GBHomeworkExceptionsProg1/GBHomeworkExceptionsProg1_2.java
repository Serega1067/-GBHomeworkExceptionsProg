package GBHomeworkExceptionsProg.GBHomeworkExceptionsProg1;

/**
 * Задача 2.
 * Посмотрите на код(прикреплен к материалам урока), подумайте 
 * и напишите сколько разных типов исключений вы тут сможете 
 * получить?
 */

public class GBHomeworkExceptionsProg1_2 {
    public static void main(String[] arg) {
        String[][] arr1 = {{"1", "2", "3", "4", "5"}, 
                           {"1", "2", "3", "4", "5"}};
        System.out.println(sum2d(arr1));
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}

/**
 * Исключения:
 * 1. Проверка на наличие null.
 * 2. Проверка что длина массива arr1[0] не больше 5.
 * 3. Проверка что длина массива arr1[1] не меньше 5.
 */
