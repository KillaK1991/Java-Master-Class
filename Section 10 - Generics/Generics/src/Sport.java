public abstract class Sport {
    private String sportName;

    Sport(String sportName){
        this.sportName = sportName;
    }

    public String getSportName() {
        return sportName;
    }

    abstract String getTeamName();
}
