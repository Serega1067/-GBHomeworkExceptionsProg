package GBHomeworkExceptionsProg.GBHomeworkExceptionsProg1;

/**
 * Задача 3.
 * Реализуйте метод, принимающий в качестве аргументов два 
 * целочисленных массива, и возвращающий новый массив, 
 * каждый элемент которого равен разности элементов двух 
 * входящих массивов в той же ячейке. Если длины массивов 
 * не равны, необходимо как-то оповестить пользователя.
 */

public class GBHomeworkExceptionsProg1_3 {
    public static void main(String[] arg) {
        int[] arr1 = {3, 49, 192, 134, 98198};
        int[] arr2 = {1, 2, 3, 4, 5};

        checkLenArrays(arr1, arr2);

        for (int c : subElemArray(arr1, arr2)) {
            System.out.println(c);
        }

        int[] arr3 = {1, 2, 3, 4};

        checkLenArrays(arr1, arr3);
    }

    /**
     * Вычитание каждого элемента массива из другого массива
     * @param argArr1
     * @param argArr2
     * @return
     */
    public static int[] subElemArray(int[] argArr1, int[] argArr2) {
        int[] resultArr = new int[argArr1.length];
        for (int i = 0; i < argArr1.length; i++) {
            resultArr[i] = argArr1[i] - argArr2[i];
        }
        return resultArr;
    }
    
    /**
     * Проверка что длины двух массивов равны
     * @param argArr1
     * @param argArr2
     */
    public static void checkLenArrays(int[] argArr1, int[] argArr2) {
        if (argArr1.length != argArr2.length) {
            throw new RuntimeException(
                "Different length of arrays");
        }
    }
}
