package Laboratorium15.music;

abstract public class MusicPlayer implements Player {
    private Song[] library;
    private int current;

    public MusicPlayer(Song[] library) {
        this.library = library;
    }

    public Song getCurrentSong() {
        return library[current];
    }

    @Override
    public void next() {
        if (++current >= library.length) {
            current = 0;
        }
        play();
        /*System.out.println("następny utwór");*/
    }

    @Override
    public void previous() {
        if (--current < 0) {
            current = library.length - 1;
        }
        play();
        /*System.out.println("poprzedni utwór");*/
    }
}
