import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    private static BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
    private static boolean continueLoop = true;
    private static boolean forward = true;
    private static Playlist disneyPlaylist = new Playlist("Disney Playlist");
    private static LinkedList<Song> playlist;
    private static ListIterator<Song> songIterator;

    public static void main(String[] args) throws IOException {

        //Creation of the Hercules Album and addition of songs
        Album herculesAlbum = new Album("Hercules", "Walt Disney Records");
        herculesAlbum.addSongToAlbum("Go the Distance", 3.13);
        herculesAlbum.addSongToAlbum("A Star Is Born", 2.03);
        herculesAlbum.addSongToAlbum("Zero to Hero", 2.20);
        herculesAlbum.addSongToAlbum("I Won't Say (I'm In Love)", 2.20);

        //Used to check that a duplicate song cannot be added to the album
        herculesAlbum.addSongToAlbum("I Won't Say (I'm In Love)", 2.20);

        //Creation of the Mulan Album and addition of songs
        Album mulanAlbum = new Album("Mulan", "Walt Disney Records");
        mulanAlbum.addSongToAlbum("I'll Make a Man Out of You", 3.22);
        mulanAlbum.addSongToAlbum("A Girl Worth Fighting For", 2.26);
        mulanAlbum.addSongToAlbum("Honor to Us All", 3.03);
        mulanAlbum.addSongToAlbum("True To Your Heart", 4.16);

        //Creation of the Lilo and Stitch Album and addition of songs
        Album liloAndStitchAlbum = new Album("Lilo and Stitch", "Walt Disney Records");
        liloAndStitchAlbum.addSongToAlbum("He Mele No Lilo", 2.28);
        liloAndStitchAlbum.addSongToAlbum("Suspicious Minds", 3.23);
        liloAndStitchAlbum.addSongToAlbum("Hawaiian Roller Coaster Ride", 3.28);
        liloAndStitchAlbum.addSongToAlbum("Burning Love", 3.10);

        //Adding songs to playlist
        disneyPlaylist.addSongToPlaylist(liloAndStitchAlbum,"He Mele No Lilo");
        disneyPlaylist.addSongToPlaylist(herculesAlbum, "Go the Distance");
        disneyPlaylist.addSongToPlaylist(herculesAlbum, "Zero to Hero");
        disneyPlaylist.addSongToPlaylist(mulanAlbum, "I'll Make a Man Out of You");
        disneyPlaylist.addSongToPlaylist(mulanAlbum, "A Girl Worth Fighting For");

        //Used to check a song that a song which is not part of an album cannot be added to the playlist
        disneyPlaylist.addSongToPlaylist(mulanAlbum, "Suspicious Minds");

        //Used to set the linked list iterator for the playlist to prevent the program from throwing a
        //Concurrent Modification Exception
        setIterator();
        System.out.println();
        playNextSong();

        System.out.println("\nPlease enter a value");

        while(continueLoop){
            printOptions();
            int userInput = Integer.parseInt(bufferReader.readLine());

            switch(userInput){
                case 1:
                    continueLoop = false;
                    break;

                case 2:
                    playNextSong();
                    break;

                case 3:
                    playPreviouSong();
                    break;

                case 4:
                    replaySong();
                    break;

                case 5:
                    removeSong();
                    break;

                case 6:
                    listSongs();
                    break;
            }
        }




    }

    public static void printOptions(){
        System.out.println("1) Quit");
        System.out.println("2) Go to the next song");
        System.out.println("3) Go to the previous song");
        System.out.println("4) Replay current song");
        System.out.println("5) Remove current song from list");
        System.out.println("6) List songs in playlist");
    }

    public static void playNextSong(){
        if(forward == false){
            if(songIterator.hasNext()){
                songIterator.next();
            }
        }

        if(songIterator.hasNext()){
            System.out.println("Playing " + songIterator.next().getSongName());
            System.out.println();
            forward = true;
        }else{
            System.out.println("You have reached the end of the playlist");
        }
    }

    public static void playPreviouSong(){
        if(forward == true){
            if(songIterator.hasPrevious()){
                songIterator.previous();
            }
        }

        if(songIterator.hasPrevious()){
            System.out.println("Playing " + songIterator.previous().getSongName());
            System.out.println();
            forward = false;
        }else{
            System.out.println("You have reached the beginning of the playlist");
        }
    }

    public static void replaySong(){
        if(forward == true) {
            if(songIterator.hasPrevious()){
                System.out.println("Playing " + songIterator.previous().getSongName());
                System.out.println();
                songIterator.next();
            }else{
                System.out.println("You are not playing a song// forward is true");
            }
        }

        if(forward == false){
            if(songIterator.hasNext()){
                System.out.println("Playing " + songIterator.next().getSongName());
                System.out.println();
                songIterator.previous();
            }else{
                System.out.println("You are not playing a song// forward is false");
            }
        }

    }

    public static void removeSong(){
        if(forward = true){
            if(songIterator.hasPrevious()){
                songIterator.previous();
                songIterator.remove();
            }
        }

        if(forward == false){
            if(songIterator.hasNext()){
                songIterator.next();
                songIterator.remove();
            }
        }else{
            System.out.println("No song playing, therefore song could not be removed");
        }
    }

    public static void listSongs(){
        LinkedList<Song> playlist = disneyPlaylist.getSongPlaylist();
        System.out.println("\nYour " + disneyPlaylist.getPlayListName() + " has the following songs");
        int list = 1;
        for(Song song: playlist){
            System.out.println(list + ". " + song.getSongName());
            list++;
        }
        System.out.println();
    }

    public static void setIterator(){
        playlist = disneyPlaylist.getSongPlaylist();
        songIterator = playlist.listIterator();

    }
}
