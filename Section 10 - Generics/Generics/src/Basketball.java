public class Basketball extends Sport {

    private String teamName;
    private int totalWins;

    Basketball(String teamName, int totalWins){
        super("Basketball");
        this.teamName = teamName;
        this.totalWins = totalWins;
    }

    public String getTeamName(){
        return this.teamName;
    }

}
