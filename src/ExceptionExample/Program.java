package ExceptionExample;

public class Program  {
    public static void main(String[] args){
        try{
            int result = getFactorial(-9);
            System.out.printf("Result = %d,",result);
        }
        catch (FactorialException fEx){
            System.out.println(fEx.getMessage());
        }

    }
    public static int getFactorial(int n)  throws FactorialException /*throws Exception*/{
        int res = 1;
        try{
        if(n<1) throw new FactorialException("The number is less than 1", n);
        for(int i =1; i<=n; i++){
            res *= i;

        }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
            res = n;
        }
        return res;
    }

}

class FactorialException extends Exception{
    private int number;
    public int getnumber(){
        return number;
    }
    public FactorialException(String message, int number){
        super(message);
        this.number = number;
    }
}

// Unchecked exceptions Не проверяемые исключении

// Arithmethicexception: деление на ноль
// IndexOutofboxexception: вне массива
// IllegalArgumentException: неверный аргумент
// NullPointException: к пустой ссылке
// NumberFormatException: преобразование строки в число



// Сhecked exceptions Проверяемые исключении

// CloneNotSupportedException: во время cloneable
// InterruptedExceptions: во время прерывания потоков
// ClassNotFoundExceptions: невозможно найти класс
