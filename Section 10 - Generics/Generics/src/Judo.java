public class Judo extends Sport {

    private String teamName;
    private int totalWins;

    Judo(String teamName, int totalWins){
        super("Judo");
        this.teamName = teamName;
        this.totalWins = totalWins;
    }

    public String getTeamName(){
        return this.teamName;
    }
}
