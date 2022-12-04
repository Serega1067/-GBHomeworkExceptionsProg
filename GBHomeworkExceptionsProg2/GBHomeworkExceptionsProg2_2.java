/**
 * Задание 2.
 * Если необходимо исправьве данный код
 */

public class GBHomeworkExceptionsProg2_2 {
    public static void main(String[] args) {
        // try {
        //     int d = 0;
        //     double catchedRes1 = intArray[8] / d;
        //     System.out.println("catchedRes1 = " + catchedRes1);
        // } catch (ArithmeticException e) {
        //     System.out.println("Catching exception: " + e);
        // }
        
        try {
            int[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8};
            int d = 0;
            double catchedRes1 = intArray[8] / d; // делить на 0 нельзя
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
