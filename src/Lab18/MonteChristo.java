package Lab18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class MonteChristo {
    public static void main(String[] args) {
        MonteChristo mc = new MonteChristo();
        List<String> allines = mc.loadTextFile("src/crsto10.txt");

        if (allines != null && !allines.isEmpty()) {
            System.out.println("Wczytany plik zawiera " + mc.countLines(allines) + " linii");
            mc.showEveryHundredLine(allines);
            mc.showTheLongestVerse(allines);
        }

    }

    List<String> loadTextFile(String fileName) {
        try {
            return Files.readAllLines(Paths.get(fileName));
        } catch (IOException e) {
            System.out.println("Coś poszło nie tak przy ładowaniu pliku");
            e.printStackTrace();
        }
        return null;
    }

    int countLines(List list) {
        return list.size();
    }

    void showEveryHundredLine(List list) {
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            if (i % 100 == 0) {
                System.out.println(i + " " + list.get(i));
            }
        }
    }


    void showTheLongestVerse (List<String> list) {
        String longestLine = "";
        for (String line : list) {
            if (line.length() > longestLine.length()) {
                longestLine = line;
            }
        }
        System.out.println("\nNajdłuższy wiersz w książce zawiera " + longestLine.length() + " znaki/ów - " + longestLine.toUpperCase());
    }
}
