package lesson3.homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class HomeWork {

    /* example:
     * input: Mama mila ramu, Ramu mila mama!!!, [mama, ramu]
     * output: 4
     * use regex, split, lowerCase, replace methods
     * */
    public int countOfWordsFromDictionaryInString(String input, String[] dictionary) {
        HashSet<String> set = new HashSet<>();
        for (String word : dictionary) {
            set.add(word.toLowerCase());
        }
        //System.out.println(set);
        String [] words = input.split(" +");
        int cnt = 0;
        for (String word : words) {
            //System.out.println(word.toLowerCase().replaceAll("[^a-z]+", ""));
            if (set.contains(word.toLowerCase().replaceAll("[^a-z]+", ""))) {
                cnt++;
            }
        }
        return cnt;
    }

    /* example:
     * input: [1,0,3,17,2,7,14,1,1,7], K = 6
     * output: 3
     * use sort
     * */
    public int kOrderValue(int[] array, int k) {
        Arrays.sort(array);
        return array[k-1];
    }

    /*
    *  Это реальная задача, которую я сегодня делал на работе
    *  Кому интересно, можете проверить свои силы))))
    *  Если слово из values есть в словаре from, его необходимо заменить
    *  с from[i] на to[i] [a, b, c], [a, b], [x, y] -> [x, y, c]
    *  Если словарь to длиннее from, то строка to[from.length] - дефолтное
    *  значение для всех values, которых нет в словаре from
    *  [a, b, c, d], [a, b], [x, y, lol] -> [x, y, lol, lol]
    *  Если словарь from длиннее to, то необходимо удалить из values все значения
    *  имющиеся в куске from на индексах от to.length до rom.length
    *  [a, b, c, d], [a, b, e, d], [x, y] -> [x, y, c] d удалем, так как он есть во
    *  from
     */
    public String[] translate(String[] values, String[] from, String[] to) {
        // TODO: 1/22/2020
        if (from.length == to.length) {
            for (int i = 0; i < values.length; i++) {
                for (int j = 0; j < from.length; j++) {
                    if (from[j].equals(values[i])) {
                        values[i] = to[j];
                    }
                }
            }
        }else if (from.length > to.length) {
            for (int i = 0; i < values.length; i++) {
                for (int j = 0; j < to.length; j++) {
                    if (from[j].equals(values[i])) {
                        values[i] = to[j];
                    }
                }
            }
            ArrayList<String> words = new ArrayList<>();
            Collections.addAll(words, values);
            for (int i = to.length; i < from.length; i++) {
                words.remove(from[i]);
            }
            return words.toArray(new String[]{});
        } else {
            for (int i = 0; i < values.length; i++) {
                boolean flag = false;
                for (int j = 0; j < from.length; j++) {
                    if (from[j].equals(values[i])) {
                        values[i] = to[j];
                        flag = true;
                    }
                }
                if (!flag) {
                    values[i] = to[from.length];
                }
            }
        }
        return values;
    }

    /* example:
     * input: m.levin.main@mailg.spb.com
     * output: true
     *
     * use matches
     * */
    public boolean isEmail(String input) {

        return input.matches("[a-zA-Z0-9.]+@[a-zA-Z0-9.]+");
    }

    public void binarySearchGame() {
        //
    }

    public void wordsGame() throws FileNotFoundException {
        //
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(new HomeWork()
                .countOfWordsFromDictionaryInString("Mama mila ramu, Ramu mila mama!!!",
                        new String[]{"mama", "mila"}));

    }
}
