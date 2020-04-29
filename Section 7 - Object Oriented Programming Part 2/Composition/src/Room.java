public class Room {

    //Field Values
    private Wall firstWall;
    private Wall secondWall;
    private Wall thirdWall;
    private Wall fourthWall;
    private Ceiling ceiling;

    public Room(Wall firstWall, Wall secondWall, Wall thirdWall, Wall fourthWall, Ceiling ceiling) {
        this.firstWall = firstWall;
        this.secondWall = secondWall;
        this.thirdWall = thirdWall;
        this.fourthWall = fourthWall;
        this.ceiling = ceiling;
    }

    public String colorOfFirstWall(){
        return this.firstWall.getColor();
    }

    public String colorOfSecondWall(){
        return this.secondWall.getColor();
    }

    public String colorOfThirdWall(){
        return this.thirdWall.getColor();
    }

    public String colorOfFourthWall(){
        return this.fourthWall.getColor();
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public void setCeiling(Ceiling ceiling) {
        this.ceiling = ceiling;
    }
}
