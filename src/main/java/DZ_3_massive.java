/*
 * - Массив размерностью 20
 * - Он заполняется случайными целыми числами от -10 до 10
 * - Нужно найти максимальный отрицательный и минимальный положительный элементы массива
 * - Поменять их местами.
 * */
//import

public class DZ_3_massive {
    public static void main(String[] args) throws java.io.IOException {
        int[] myArray = new int[20];
        int neg = -10;
        int pos = 10;
        int temp = 0;
        int x = 0;
        int y = 0;

        for (int i = 0; i < myArray.length; i++) { //Формируем и заполняем массив
            myArray[i] = ((int) (Math.random() * 21) - 10);
            System.out.print(" " + myArray[i] + " ");
        }
        for (int i = 0; i < myArray.length; i++) { //Находим максимальный отрицательный и минимальный положительный элементы массива

            if (myArray[i] > neg && myArray[i] < 0) {
                neg = myArray[i];
                x = i;
                }
            if (myArray[i] < pos && myArray[i] > 0) {
                pos = myArray[i];
                y = i;
            }

        }
        temp = myArray[x];
        myArray[x] = myArray[y];
        myArray[y] = temp;
        System.out.println();
        for (int i = 0; i < myArray.length; i++) { //Выводим получившийся массив
            System.out.print(" " + myArray[i] + " ");
        }
    }
}
