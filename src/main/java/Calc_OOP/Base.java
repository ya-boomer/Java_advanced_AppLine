package Calc_OOP;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        //Объявление переменных
        try {
            Scanner myScn = new Scanner(System.in);
            int choice;

            //Ввод пользователем двух дробных чисел
            System.out.println("\nВведите первое число:");

            double firstNumber = myScn.nextDouble();
            System.out.println("Введите второе число:");

            double secondNumber = myScn.nextDouble();

            //Создание объекта калькулятора
            CalcOOP myCalculator = new CalcOOP(firstNumber, secondNumber);
            System.out.println();

            //Цикл выбора операции повторяется, пока пользователь не введет команду выхода из модуля
            while (true) {
                //Вывод меню выбора операции
                System.out.println("\nВыберите операцию ");
                System.out.println("1. +");
                System.out.println("2. -");
                System.out.println("3. *");
                System.out.println("4. /");
                System.out.println("5. Выход из программы.");

                //Считывание выбора операции

                choice = myScn.nextInt();

                //Выбор операции
                switch (choice) {
                    case 1:
                        //При выборе "1" вызывается метод сложения чисел Calculator.plus() и выводится результат
                        System.out.printf("\n%.4f + %.4f = %.4f\n\n",
                                myCalculator.getFirstNumber(), myCalculator.getSecondNumber(), myCalculator.plus());
                        break;
                    case 2:
                        //При выборе "2" вызывается метод вычитания чисел Calculator.minus() и выводится результат
                        System.out.printf("\n%.4f - %.4f = %.4f\n\n",
                                myCalculator.getFirstNumber(), myCalculator.getSecondNumber(), myCalculator.minus());
                        break;
                    case 3:
                        //При выборе "3" вызывается метод умножения чисел Calculator.multiplication() и выводится результат
                        System.out.printf("\n%.4f * %.4f = %.4f\n\n",
                                myCalculator.getFirstNumber(), myCalculator.getSecondNumber(), myCalculator.multiplication());
                        break;
                    case 4:
                        //При выборе "4" вызывается метод деления чисел Calculator.division() и выводится результат
                        System.out.printf("\n%.4f / %.4f = %.4f\n\n",
                                myCalculator.getFirstNumber(), myCalculator.getSecondNumber(), myCalculator.division());
                        break;
                    case 5:
                        //При выборе "5" происходит выход из модуля
                        System.out.println("\nВыход из программы...\n");
                        return;
                    default:
                        //Вывод ошибки при вводе некорректной команды
                        System.out.println("\nТакой операции нет, выберите другую операцию!\n");
                }
            }
            //myScn.close();
        } catch (NumberFormatException e) {
            System.out.println("Было введено не число");
            throw new  ArithmeticException("Error!!! " + e);
        }
        catch (InputMismatchException e){
            System.out.println("Было введено не число из предложенного диапазона");
            throw new  InputMismatchException("Error!!! " + e);
        }
    }
}
