public class Main {

    public static void main(String[] args){
        Wall firstwall = new Wall(10,25, "white");
        Wall secondWall = new Wall(10, 25, "white");
        Wall thirdWall = new Wall(10, 25, "white");
        Wall fourthWall = new Wall(10, 25, "white");

        Ceiling ceiling = new Ceiling(10,25, false);

        Room myRoom = new Room(firstwall, secondWall, thirdWall, fourthWall, ceiling);
        System.out.println(myRoom.getCeiling().getLength()); //Accessing the field values in a class via getters
        System.out.println(myRoom.colorOfFirstWall()); //Accessing the field values in a class via a public method
    }
}
