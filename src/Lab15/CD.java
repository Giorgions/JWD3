package Lab15;

public class CD extends MusicPlayer {
    static String type = "CD";
    static int counter;

    public CD() {
        counter++;
    }

    @Override
    public String getPlay() {
        return "Gra odtwarzacz CD";
    }

    @Override
    public String getPause() {
        return "Spauzowano odtwarzacz CD";
    }

    @Override
    public String getStop() {
        return "Zastopowano odtwarzacz CD";
    }

    @Override
    public String getNext() {
        return "Następna piosenka na odtwarzaczu CD";
    }

    @Override
    public String getPrevious() {
        return "Poprzednia piosenka na odtwarzaczu CD";
    }
}
