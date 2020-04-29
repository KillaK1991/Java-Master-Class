public class MegaBytesConverter {

    public static void main(String[] args){

        //Test Cases used to test the printMegaByteAndKiloBytes method
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if(kiloBytes < 0 ){
            System.out.println("Invalid Value");
        }else{
            //Dividing by 1024 KB to determine the total number of MB
            int megaBytes = kiloBytes/1024;

            //Using modules to determine remainding KB
            int remainderKiloBytes = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainderKiloBytes + " KB");
        }
    }
}
