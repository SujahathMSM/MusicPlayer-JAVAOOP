import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("==== Welcome to Our Music Player");

        Album album1 = new Album("Paiyya", "Yuvan Shankar Raja");
        album1.addSong("En kadhal", 4.5);
        album1.addSong("Adada Mazhai", 5);
        album1.addSong("Poongatre", 4.4);
        album1.addSong("Etho onru", 3.9);
        albums.add(album1);

        album1 = new Album("Album2", "Eminem");
        album1.addSong("Rap god", 4.5);
        album1.addSong("You Forewer", 5);
        album1.addSong("Jill Juck", 4.4);
        album1.addSong("Oh Baby", 3.9);
        albums.add(album1);

        LinkedList<Song> playList1 = new LinkedList<>();
        albums.get(0).addToPlayList("En Kadhal", playList1);
        albums.get(0).addToPlayList("Etho onru", playList1);
        albums.get(1).addToPlayList("Rap god", playList1);
        albums.get(1).addToPlayList("oh Baby", playList1);

    }
}