import java.text.DecimalFormat;
import java.util.Scanner;

public class Base {
    public static void main(String[] args) throws java.io.IOException {
        Scanner scn = new Scanner(System.in);
        double a = 0;
        double b = 0;
        char s;
        double result = 0;

        System.out.println("Введите первое число");

        if (scn.hasNextDouble()) { //Проверяем, что было введено число
            a = scn.nextDouble();
            System.out.println("Введите второе число"); //Проверяем, что было введено число
            if (scn.hasNextDouble()) {
                b = scn.nextDouble();
                System.out.println("Введите математический знак"); // после того как было введено 2 числа можно считывать знак операции
                s = (char) System.in.read();
                if (s == '+') {
                    result = a + b;
                    System.out.println(new DecimalFormat( "###,###.####" ).format(result));

                } else if (s == '-') {
                    result = a - b;
                    System.out.println(new DecimalFormat( "###,###.####" ).format(result));

                } else if (s == '*') {
                    result = a * b;
                    System.out.println(new DecimalFormat( "###,###.####" ).format(result));
                } else if (s == '/') {
                    if (b == 0) System.out.println("На ноль делить нельзя");
                    else {
                        result = a / b;
                        System.out.println(new DecimalFormat( "###,###.####" ).format(result));
                    }
                } else System.out.println("Вышла ошибка - введен не математический знак");

            } else System.out.println("Было введено не число");

        } else System.out.println("Было введено не число");

    }

}
