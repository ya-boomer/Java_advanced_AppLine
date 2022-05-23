/**
 * Есть входной файл с набором слов, написанных через пробел
 * Необходимо:
 * - Прочитать слова из файла.
 * - Отсортировать в алфавитном порядке.
 * - Посчитать сколько раз каждое слово встречается в файле
 * - Вывести статистику на консоль
 * - Найти слово с максимальным количеством повторений
 * - Вывести на консоль это слово и сколько раз оно встречается в файле
 */

package Collections;

import java.util.List;


public class Base {
    public static void main(String[] args) {
        String fname = "C:\\Users\\Professional\\IdeaProjects\\Java_advanced_AppLine\\src\\main\\java\\Collections\\item.txt";
        Count c = new Count(fname);
        List<String> result = c.getResult();
        for (String wordRes : result) {
            System.out.println(wordRes);
        }
    }
}
