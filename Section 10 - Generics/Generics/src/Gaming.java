public class Gaming extends Sport {

    private String teamName;
    private int totalWins;

    Gaming(String teamName, int totalWins){
        super("Gaming");
        this.teamName = teamName;
        this.totalWins = totalWins;
    }

    public String getTeamName(){
        return this.teamName;
    }

}
