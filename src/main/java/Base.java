import java.text.DecimalFormat;
import java.util.Scanner;

public class Base {
    public static void main(String[] args) throws java.io.IOException {

        Scanner scn = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double result = 0;
        char s;
        int len = 0;
        int j = 0;
        int h = 0;
        System.out.println("Введите что хотите сделать:\n 1. Зайти в калькулятор\n 2. Поиск максимальной длины элемента массива");
        if (scn.hasNextInt()) { //Считываем значение что хочет сделать пользователь
            int mean = scn.nextInt();
            if (mean == 2) {
                System.out.println("Заходим в массив\n Задайте размерность массива:");
                if (scn.hasNextInt()) {
                    int size = scn.nextInt();
                    String[] max_words = new String[size];
                    if (size < 1) System.out.println("Введено некорректное значение для длины массива");
                    else {
                        String[] words = new String[size];
                        for (int i = 0; i < size; i++) {
                            System.out.println("Введите элемент массива");
                            words[i] = scn.next(); // Заполняем массив элементами, введёнными с клавиатуры
                        }
                        System.out.println("Введенный массив:");
                        for (int i = 0; i < size; i++) {
                            System.out.println(" " + words[i]); // Выводим на экран, полученный массив
                        }
                        for (int i = 0; i < size; i++) { //Ищем самое длинное слово и если несколько слов с одной длиной записываем в массив

                            if (words[i].length() > len) {
                                if (j == 0) {
                                    j = 1;
                                    max_words[0] = words[0];
                                }
                                len = words[i].length();
                            } else if (words[i].length() == len) {
                                j += 1;
                                if (h < size - 1) {
                                    h += 1;
                                    System.out.println("h = " + h);
                                    max_words[h] = words[i];
                                    System.out.println(max_words[h]);
                                }

                            }

                        }
                        if (j > 0) {
                            for (int i = 0; i < j; i++) //Выводим на экран самые длинные слова
                                System.out.println("Максимальные слова из элементов массива: " + max_words[i]);
                        }

                    }
                } else System.out.println("Введено не число!");

            } else if (mean == 1) {
                System.out.println("Заходим в калькулятор\n Введите первое число:");

                if (scn.hasNextDouble()) { //Проверяем, что было введено число
                    a = scn.nextDouble();
                    System.out.println("Введите второе число"); //Проверяем, что было введено число
                    if (scn.hasNextDouble()) {
                        b = scn.nextDouble();
                        System.out.println("Введите математический знак"); // после того как было введено 2 числа можно считывать знак операции
                        s = (char) System.in.read();
                        if (s == '+') {
                            result = a + b;
                            System.out.println(new DecimalFormat("###,###.####").format(result));

                        } else if (s == '-') {
                            result = a - b;
                            System.out.println(new DecimalFormat("###,###.####").format(result));

                        } else if (s == '*') {
                            result = a * b;
                            System.out.println(new DecimalFormat("###,###.####").format(result));
                        } else if (s == '/') {
                            if (b == 0) System.out.println("На ноль делить нельзя");
                            else {
                                result = a / b;
                                System.out.println(new DecimalFormat("###,###.####").format(result));
                            }
                        } else System.out.println("Вышла ошибка - введен не математический знак");

                    } else System.out.println("Было введено не число");

                } else System.out.println("Было введено не число");
            } else System.out.println("Введено некорректное значение");
        } else {
            System.out.println("Введено не число");
        }
        scn.close();
    }

}

