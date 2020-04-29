import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Tekken tekkenOne = new Tekken("Law", "Wing Chun", "One Inch Punch", 1);
        System.out.println(tekkenOne);
        save(tekkenOne);
        write(tekkenOne);
        save(tekkenOne);
        System.out.println(tekkenOne);
    }

    public static void save(ISaveable saveableObject){
        for(int i = 0; i < saveableObject.write().size(); i++){
            System.out.println("Saving " + saveableObject.write().get(i));
        }
    }

    public static void write(ISaveable saveableObject){
        saveableObject.read(readValues());
    }


    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while(!quit){
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    quit = true;
                    break;

                case 1:
                    System.out.print("Enter a String: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
}
