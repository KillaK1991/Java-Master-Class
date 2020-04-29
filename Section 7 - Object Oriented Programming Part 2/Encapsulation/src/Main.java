public class Main {
    public static void main(String[] args){
        Printer officePrinter = new Printer(false);

        officePrinter.fillToner(30.0);
        officePrinter.print(4);
        officePrinter.fillToner(40.0);
        officePrinter.print(15);
        officePrinter.fillToner(56.0);

        Printer kitchenPrinter = new Printer(true);

        kitchenPrinter.fillToner(30.0);
        kitchenPrinter.print(4);
        kitchenPrinter.fillToner(40.0);
        kitchenPrinter.print(15);
        kitchenPrinter.fillToner(56.0);

        System.out.println("The office printer has printed a total of " + officePrinter.getPagesPrinted() + " pages");
        System.out.println("The kitchen printer has printed a total of " + kitchenPrinter.getPagesPrinted() + " pages");

    }
}
