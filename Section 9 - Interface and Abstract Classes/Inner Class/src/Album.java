import java.util.ArrayList;

public class Album {

    private String albumName;
    private String albumArtist;
    private songList albumSongList;

    Album(String albumName, String albumArtist){
        this.albumName = albumName;
        this.albumArtist = albumArtist;
        this.albumSongList = new songList();
    }

    public boolean addSongToAlbum(String songName, double songDuration){
        return this.albumSongList.addSong(songName, songDuration);
    }

    public Song findSong(String songName){
        for(Song findSong:this.albumSongList.songArrayList){
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

    private class songList {
        private ArrayList<Song> songArrayList;

        songList(){
            this.songArrayList = new ArrayList<Song>();
        }

        public boolean addSong(String songName, double songDuration){
            if(checkSong(songName) == null){
                this.songArrayList.add(new Song(songName, songDuration));
                System.out.println(songName + " song added to " + getAlbumName() + " album");
                return true;
            }
            System.out.println(songName + " song cannot be added to album because it already exists");
            return false;
        }

        private Song checkSong(String songName){
            for(Song song:this.songArrayList){
                if(song.getSongName().equals(songName)){
                    return song;
                }
            }
            return null;
        }
    }
}
