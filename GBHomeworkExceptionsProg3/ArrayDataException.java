package GBHomeworkExceptionsProg3;

public class ArrayDataException extends RuntimeException {
    public ArrayDataException() {
        System.out.println("Ошибка: неверные данные");
    }
}
