import java.util.LinkedList;

public class Playlist {

    private String playListName;
    private LinkedList<Song> songPlaylist;

    Playlist(String playListName){
        this.playListName = playListName;
        songPlaylist = new LinkedList<Song>();
    }

    public boolean addSongToPlaylist(Album albumName, String songName){
        Song checkedSong = findSongOnAlbum(albumName, songName);
        if(checkedSong != null){
            this.songPlaylist.add(checkedSong);
            System.out.println(songName + " song from the " + albumName.getAlbumName() + " album added to the " + this.playListName);
            return true;
        }
        System.out.println(songName + " song is not on the " + albumName.getAlbumName() + " album and could not be added to the " + this.playListName);
        return false;
    }

    private Song findSongOnAlbum(Album albumName, String songName){
        Song findSong = albumName.findSong(songName);
        if(findSong != null){
            return findSong;
        }
        return null;
    }

    public String getPlayListName() {
        return playListName;
    }

    public LinkedList<Song> getSongPlaylist() {
        return songPlaylist;
    }
}
