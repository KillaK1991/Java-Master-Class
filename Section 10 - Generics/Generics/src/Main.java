public class Main {

    public static void main(String[] args) {

        //Creation of different Judo teams
        Judo allJapanJudo = new Judo("All Japan Judo", 3);
        Judo kamehamehaJudo = new Judo("Kamehameha Judo",8);
        Judo hawaiiJudo = new Judo("Hawaii Judo",5);

        //Creation of different Basketball teams
        Basketball aberdeen = new Basketball("Aberdeen",10);
        Basketball riverside = new Basketball("Riverside",12);
        Basketball unf = new Basketball("UNF",8);

        //Creation of different Gaming teams
        Gaming smite = new Gaming("Smite",50);
        Gaming residentEvil = new Gaming("Resident Evil",100);
        Gaming deadByDaylight = new Gaming("Dead By Daylight",95);

        //Creating the different Leagues
        League<Judo> judoLeague = new League<>("International Judo Federation");
        League<Basketball> basketballLeague = new League<>("NBA");
        League<Gaming> gamingLeague = new League<>("MLG");


        //Checking to ensure only the correct objects can be added to that league ex. Judo teams can only be added to Judo league
        //Uncomment below code to see errors

//        judoLeague.addTeam(aberdeen);
//        basketballLeague.addTeam(smite);
//        gamingLeague.addTeam(allJapanJudo);

        judoLeague.addTeam(allJapanJudo);
        judoLeague.addTeam(kamehamehaJudo);
        judoLeague.addTeam(hawaiiJudo);
        judoLeague.addTeam(hawaiiJudo);

    }
}
