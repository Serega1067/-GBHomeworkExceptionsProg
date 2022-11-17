package GBHomeworkExceptionsProg.GBHomeworkExceptionsProg1;

/*
 * Задача 1.
 * Реализуйте 3 метода, чтобы в каждом из них получить 
 * разные исключения 
 * Деление на ноль
 * Проверить что длины двух массивов одинаковы
 * Проверить что в каждом массиве не менее 3 элементов
 */

public class GBHomeworkExceptionsProg1_1 {
    public static void main(String[] args) {
        int[] arr1 = new int[] {43, 100, 36, 79, 85};
        int[] arr2 = new int[] {1, 6, 3, 5};
        // finalResult(arr1, arr2); // разная длина массивов

        int[] arr3 = new int[] {1, 0, 5, 3, 8};
        // finalResult(arr1, arr3); // деление на ноль

        int[] arr4 = new int[] {6};
        int[] arr5 = new int[] {2};
        // finalResult(arr4, arr5); // элементов в массиве меньше 3

        int[] arr6 = new int[] {1, 3, 5, 6, 9};
        finalResult(arr1, arr6);
    }

    /**
     * Проверяет массивы, делит элементы массивов и вывадит
     * результат в консоль
     * @param argArr1
     * @param argArr2
     */
    public static void finalResult(int[] argArr1, int[] argArr2) {
        if (checkArrays(argArr1, argArr2)) {
            int[] resultArray = divArr(argArr1, argArr2);
            for (int c : resultArray) {
                System.out.println(c);
            }
        }
    }

    public static boolean checkArrays(int[] argArr1, 
                                      int[] argArr2) {
        /**
         * Проверка что массивы одной длины
         */
        if (argArr1.length != argArr2.length) {
            throw new RuntimeException(
                "Arrays of different lengths");
        }
        
        /**
         * Проверка что не произойдёт деление на ноль
         */
        for (int c : argArr2) {
            if (c == 0) {
                throw new RuntimeException(
                    "You can't divide dy zero");
            }
        }

        /**
         * Проверка что оба массива содержат не менее трёх 
         * элементов
         */
        if (argArr1.length < 3 && argArr2.length < 3) {
            throw new RuntimeException(
                "The length of one of arrays is less than 3");
        }
        return true;
    }

    /**
     * Делит каждый элемент массива на соответствующий элемент
     * другого массива
     * @param argArr1
     * @param argArr2
     * @return
     */
    public static int[] divArr(int[] argArr1, int[] argArr2) {
        int[] resultArr = new int[argArr1.length];
        for (int i = 0; i < argArr1.length; i++) {
            resultArr[i] = argArr1[i] / argArr2[i];
        }
        return resultArr;
    }
}
