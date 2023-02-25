package GBHomeworkExceptionsProg3;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.util.spi.ResourceBundleProvider;

public class GBHomeworkExceptionsProg3 {
    public static void main(String[] args) throws ArraySizeException, ArrayDataException {
        String consoleStr = requestingDataUser();
        String[] consoleArray = divisionIntoElem(consoleStr);

        workingWithArrayElem(consoleArray);
    }

    /**
     * Функция принимает ввод с терминала и проверяет на пустую
     * строку
     * @return
     */
    public static String requestingDataUser() {
        System.out.println("Введите через пробел данные:\n" +
        "фамилия, имя, отчество, дата рождения, " +
        "номер телефона, пол");
        try (Scanner console = new Scanner(System.in)) {
            String stringResult = console.nextLine();
            System.out.println(stringResult);
            try {
                if (stringResult.isEmpty()) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException e) {
                    System.out.println("Ошибка.Пустая строка.");
            }
            return stringResult;
        }
    }

    /**
     * Функция принимает строку, разбивает её по пробелам,
     * ложит элементы в массив и проверяет на количество
     * элементов
     * @param argStr
     * @throws ArraySizeException
     */
    public static String[] divisionIntoElem(String argStr) 
                           throws ArraySizeException {
        String[] parts = argStr.split(" ");
        for (String c : parts) {
            System.out.println(c);
        }

        try{
            if (parts.length != 6) {
                throw new ArraySizeException();
            }
        } catch (RuntimeException e){
            if (parts.length < 6) {
                System.out.println("Вы ввели меньше " +
                "данных чем требуется.");
            }
            else {
                System.out.println("Вы ввели больше " +
                "данных чем требуется.");
            }
        }
        return parts;
    }

    public static void workingWithArrayElem(String[] argArr) {
        try {
            for (int i = 0; i < 3; i++) {
                if (argArr[0].contains("[0-9]+") == true) {
                    throw new ArrayDataException();
                }
            }

            for (int i = 3; i < 5; i++) {
                if (argArr[i].contains("[a-zA-Z]+") == true) {
                    throw new ArrayDataException();
                }
            }

            if ( argArr[5] != "m" || argArr[5] != "f") {
                throw new ArrayDataException();
            }
        } catch (ArrayDataException e) {
            System.out.println("Ошибка");
        }
    }
}
