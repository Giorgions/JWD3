package Laboratorium15.music;

public class StereoSystem {
    public static void main(String[] args) {
        Song[] library = new Song[3];
        library[0] = new Song("Michael Jackson","Beat It", "Thriller");
        library[1] = new Song("Pearl Jam","Even Flow","Ten");
        library[2] = new Song("Portishead","Over","Nyc live");


        Player[] players = {new MP3Player(library), new CDPlayer(library)};

        players[0].play();
        players[0].stop();
        players[0].play();
        players[0].next();

        System.out.println();

        players[1].play();
        players[1].pause();
        players[1].play();
        players[1].stop();
        players[1].previous();
    }
}
