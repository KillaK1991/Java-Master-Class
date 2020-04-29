public class Song {

    private String songName;
    private double songDuration;

    Song(String songName, double songDuration){
        this.songName =  songName;
        this.songDuration = songDuration;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public double getSongDuration() {
        return this.songDuration;
    }

    public void setSongDuration(double songDuration) {
        this.songDuration = songDuration;
    }
}
