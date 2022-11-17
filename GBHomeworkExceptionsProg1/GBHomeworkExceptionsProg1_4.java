package GBHomeworkExceptionsProg.GBHomeworkExceptionsProg1;

/**
 * Задача 4.
 * Реализуйте метод, принимающий в качестве аргументов два 
 * целочисленных массива, и возвращающий новый массив, каждый 
 * элемент которого равен частному элементов двух входящих 
 * массивов в той же ячейке. 
 * Если длины массивов не равны, необходимо как-то оповестить 
 * пользователя. 
 * Важно: При выполнении метода единственное исключение, которое 
 * пользователь может увидеть - RuntimeException, т.е. ваше.
 */

public class GBHomeworkExceptionsProg1_4 {
    public static void main(String[] arg) {
        int[] arr1 = {134, 28, 914, 18, 91};
        int[] arr2 = {1, 2, 3, 4, 5};

        if (arr1.length != arr2.length) {
            throw new RuntimeException(
                "Different length of arrays");
        }

        for (int c : resDivArrays(arr1, arr2)) {
            System.out.println(c);
        }

        int[] arr3 = {1, 2, 3, 4};

        if (arr1.length != arr3.length) {
            throw new RuntimeException(
                "Different length of arrays");
        }

        for (int c : resDivArrays(arr1, arr3)) {
            System.out.println(c);
        }
    }

    public static int[] resDivArrays(int[] argArr1, int[] argArr2) {
        int[] resultArr = new int[argArr1.length];
        for (int i = 0; i < argArr1.length; i++) {
            resultArr[i] = argArr1[i] / argArr2[i];
        }
        return resultArr;
    }
}

