/*
 * Реализовать калькулятор в стиле ООП
 * Архитектуру приложения продумать самостоятельноКласс Калькулятор
 */
package Calc_OOP;

public class CalcOOP {
    private double firstNumber;
    private double secondNumber;

    public CalcOOP(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }


    public double getFirstNumber() {     // Геттер для первого числа
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {    // Сеттер для первого числа
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {   // Геттер для второго числа
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {  // Сеттер для второго числа
        this.secondNumber = secondNumber;
    }

    public double plus() {  // Метод для сложения двух чисел, хранящихся в текущем объекте
        return getFirstNumber() + getSecondNumber();
    }

    public double minus() { // Метод для вычитания двух чисел, хранящихся в текущем объекте
        return getFirstNumber() - getSecondNumber();
    }


    public double multiplication() {       // Метод для умножения двух чисел, хранящихся в текущем объекте
        return getFirstNumber() * getSecondNumber();
    }

    public double division() {   // Метод для деления двух чисел, хранящихся в текущем объекте
        return getFirstNumber() / getSecondNumber();
    }
}
