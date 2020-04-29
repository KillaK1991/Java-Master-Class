import java.util.ArrayList;

public class Album {

    private String albumName;
    private String albumArtist;
    private ArrayList<Song> albumSongList;

    Album(String albumName, String albumArtist){
        this.albumName = albumName;
        this.albumArtist = albumArtist;
        this.albumSongList = new ArrayList<Song>();
    }

    public boolean addSongToAlbum(String songName, double songDuration){
        if(checkSong(songName) == null){
            this.albumSongList.add(new Song(songName, songDuration));
            System.out.println(songName + " song added to " + this.albumName + " album");
            return true;
        }
        System.out.println(songName + " song cannot be added to album because it already exists");
        return false;
    }

    private Song checkSong(String songName){
        for(Song song:this.albumSongList){
            if(song.getSongName().equals(songName)){
                return song;
            }
        }
        return null;
    }

    public Song findSong(String songName){
        for(Song findSong:this.albumSongList){
            if(findSong.getSongName().equals(songName)){
                return findSong;
            }
        }
        return null;
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getAlbumArtist() {
        return albumArtist;
    }
}
