package Assignment_problems;

class Playlist {
    private String[] songs;
    private int songCount;

    Playlist(int maxSize) {
        songs = new String[maxSize];
        songCount = 0;
    }

    public void addSong(String song) {
        if (songCount < songs.length) {
            songs[songCount] = song;
            songCount++;
        }
    }

    public String[] getSongs() {
        String[] copy = new String[songCount];

        for (int i = 0; i < songCount; i++) {
            copy[i] = songs[i];
        }

        return copy;
    }

    public int getSongCount() {
        return songCount;
    }

    public static void main(String[] args) {
        Playlist p = new Playlist(10);

        p.addSong("Song A");
        p.addSong("Song B");

        String[] copy = p.getSongs();

        copy[0] = "Hacked";

        System.out.println("Songs in playlist:");
        String[] actualSongs = p.getSongs();

        for (int i = 0; i < actualSongs.length; i++) {
            System.out.println(actualSongs[i]);
        }

        System.out.println("Song count: " + p.getSongCount());
    }
}