package lession3.Task1;

import java.util.*;

public class Main {
    public static void main(String[] args){
        List<String> words = Arrays.asList( "Apple", "Avocado", "Apple", "Banana", "Peach",
                                            "Avocado", "Pineapple", "Plum", "Kiwi", "Lime",
                                            "Apple", "Melon", "Mango", "Banana", "Grapefruit",
                                            "Orange", "Apple", "Plum", "Grapes", "Melon");

        Set<String> unique = new HashSet<String>(words);

        //Сам массив
        System.out.println(words.toString());
        //Слова, которые не повторяются
        System.out.println(unique.toString());
        // Как часто встречаются слова
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}