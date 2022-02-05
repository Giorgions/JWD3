package Laboratorium15.music;

public class MP3Player extends MusicPlayer {
    public MP3Player(Song[] library) {
        super(library);
    }

    @Override
    public void play() {
        System.out.println("MP3 odtwarza " + getCurrentSong());
    }

    @Override
    public void pause() {
        System.out.println("MP3 pauza ...");
    }

    @Override
    public void stop() {
        System.out.println("MP3 stop ...");
    }
}
