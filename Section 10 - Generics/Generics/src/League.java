import java.util.ArrayList;

public class League<T extends Sport> {

    private String leagueName;
    private ArrayList<T> listOfTeams;

    League(String leagueName){
        this.leagueName = leagueName;
        this.listOfTeams = new ArrayList<T>();
    }

    public boolean addTeam(T team){
        if(checkTeam(team)){
            System.out.println("Could not add " + team.getTeamName() + " to the " + this.leagueName + " league."
                    + "\nPlease selected a different team name" +
                    " if you wish to enter the " + this.leagueName);
        }else{
            this.listOfTeams.add(team);
            System.out.println(team.getTeamName() + " added to the " + this.leagueName);
            return true;
        }
        return false;
    }

    private boolean checkTeam(T team){
        for(T teamName: listOfTeams){
            if(teamName.getTeamName().equals(team.getTeamName())){
                return true;
            }
        }
        return false;
    }

}
