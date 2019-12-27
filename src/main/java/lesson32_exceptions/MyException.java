package lesson32_exceptions;

public class MyException extends  Exception {

    private  int number;

    public MyException(int number){
        super("Ошибка из-за цифры " + number);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

}
