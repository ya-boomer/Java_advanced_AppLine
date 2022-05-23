package Collections;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.*;

public class Count {
    private String filePath;
    private ArrayList<String> arrayList;
    private Set<String> arraySet;

    public Count(String str) {
        filePath = str;
        arrayList = new ArrayList<>();
        arraySet = new LinkedHashSet<>();
        String inputStr = "";
        int i;

        try (FileInputStream fin = new FileInputStream(new File(filePath))) {
            do {
                i = fin.read();
                if (i != -1) inputStr += ((char) i);
            } while (i != -1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] splitStr = inputStr.split("\\s+");
        for (String s : splitStr) {
            arrayList.add(s);
        }
    }

    int h = 0, max = 0;


    public List<String> getResult() {
        Collections.sort(arrayList);
        TreeSet<String> maxWords = new TreeSet();

        for (int i = 0; i < arrayList.size(); i++) {
            arraySet.add(arrayList.get(i) + " " + Collections.frequency(arrayList, arrayList.get(i)));
            if (max < Collections.frequency(arrayList, arrayList.get(i))) {
                max = Collections.frequency(arrayList, arrayList.get(i));
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (max <= Collections.frequency(arrayList, arrayList.get(i))) {
                maxWords.add(arrayList.get(i) + " " + Collections.frequency(arrayList, arrayList.get(i)));
            }

        }
        System.out.println("Слова с максимальным количеством повторений:");
        System.out.println(maxWords + "\n");

        return new ArrayList<>(arraySet);
    }
}
