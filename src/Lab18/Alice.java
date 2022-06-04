package Lab18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Alice {
    public static void main(String[] args) {

        try {
            List<String> allines = Files.readAllLines(Paths.get("src/alice30.txt"));
            Set<String> wordsSet = new TreeSet<>();

            for (String line : allines) {
                /*line = line.replaceAll("[!,.:;]|[0-9]","");*/
                line = line.replaceAll("\\p{Punct}|\\d","");

                String[] wordsArr = line.split(" ");

                for (String word : wordsArr) {
                    if (!word.isEmpty()) {
                        wordsSet.add(word.toLowerCase());
                    }
                }
            }

/*            for (String word: wordsSet) {
                System.out.println(word);
            }*/

            Map<Character, Integer> statMap = new TreeMap<>();
            for (String word : wordsSet) {
                Character currentFirstChar = word.charAt(0);
                if (statMap.containsKey(currentFirstChar)){
                    statMap.put(currentFirstChar, statMap.get(currentFirstChar) + 1);
                } else {
                    statMap.put(currentFirstChar, 1);
                }
            }

            for (Character c : statMap.keySet()) {
                System.out.println(c + " -> " + statMap.get(c));
            }

            /*Map<Integer, Character> sortedStatMap = new TreeMap<>(Collections.reverseOrder());
            for (Map.Entry<Character, Integer> entry : statMap.entrySet()) {
                sortedStatMap.put(entry.getValue(), entry.getKey());
            }*/

            Integer biggest = 0;
            Character character = '?';
            for (Map.Entry<Character, Integer> entry : statMap.entrySet()) {
                if (entry.getValue() > biggest) {
                    biggest = entry.getValue();
                    character = entry.getKey();
                }
            }

            System.out.println("\nNajwięcej różnych wyrazów zaczyna się na literę " + character + ", jest to liczba " + biggest);

//            System.out.println(sortedStatMap);

            System.out.println("\nLiczba wszystkich różnych wyrazów to: " + wordsSet.size());

        } catch (IOException e) {
            System.out.println("Coś poszło nie tak przy wczytywaniu pliku");
            e.printStackTrace();
        }
    }
}
