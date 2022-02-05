package Lab15;

public class Mp3 extends MusicPlayer {
    static String type = "Mp3";
    static int counter;

    public Mp3() {
        counter++;
    }

    @Override
    public String getPlay() {
        return "Gra odtwarzacz Mp3";
    }

    @Override
    public String getPause() {
        return "Spauzowano odtwarzacz Mp3";
    }

    @Override
    public String getStop() {
        return "Zastopowano odtwarzacz Mp3";
    }

    @Override
    public String getNext() {
        return "Następna piosenka na odtwarzaczu Mp3";
    }

    @Override
    public String getPrevious() {
        return "Poprzednia piosenka na odtwarzaczu Mp3";
    }
}
