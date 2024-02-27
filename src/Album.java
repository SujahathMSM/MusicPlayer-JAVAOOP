import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public Album(){

    }

    public Song findSong(String title){
        for (Song checkSong : songs){
            if(checkSong.getTitle().equals(title)){
                return checkSong;
            }
        }
        return null;
    }

    public boolean addSong(String title, double duration){
        if(findSong(title)==null){
            songs.add(new Song(title, duration));
            System.out.println(title+" Successfully added");
            return true;
        } else {
            System.out.println("Song with name: "+title+ " already exists");
            return false;
        }
    }

    public boolean addToPlayList(int trackNo, LinkedList<Song> playList){
        int  index = trackNo-1;
        if (index > 0 && index <= this.songs.size()){
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not a song with track number: "+ trackNo);
        return false;
    }
    public boolean addToPlayList(String title, LinkedList<Song> playList){
        for(Song song: this.songs){
            if (song.getTitle().equals(title)){
                playList.add(song);
                return true;
            }
        }
        System.out.println(title+  "-There is no such song in album");
        return false;
    }

    public void printSongs(){
        for (Song song: this.songs){
            System.out.println(song.getTitle());
        }
    }
}
