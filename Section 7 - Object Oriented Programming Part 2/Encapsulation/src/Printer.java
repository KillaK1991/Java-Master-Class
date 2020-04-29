public class Printer {

    //Field Values
    private double tonerLevel;
    private int pagesPrinted;
    private boolean duplexPrinter;

    public Printer(boolean duplexPrinter){
        this.tonerLevel = 0;
        this.pagesPrinted = 0;
        this.duplexPrinter = duplexPrinter;
    }

    public void fillToner(double fillAmount){
        if(fillAmount < 0){
            System.out.println("Invalid Fill Amount");
        }else{
            if(this.tonerLevel + fillAmount <= 100){
                this.tonerLevel = this.tonerLevel + fillAmount;

                System.out.println("Toner level filled with " + fillAmount + " oz of toner");
                System.out.println("Current toner level is " + this.tonerLevel + "%");
            }else{
                double excess = (100 - (this.tonerLevel + fillAmount)) * -1;
                double amountUsed = fillAmount - excess;

                this.tonerLevel = this.tonerLevel + amountUsed;
                System.out.println("Toner level filled with " + amountUsed + " oz of toner");
                System.out.println(excess + " oz of toner not used from the provided " + fillAmount + " oz");
                System.out.println("Current toner level is " + this.tonerLevel + "%");
            }
        }
    }

    public void print(int pages){
        if(this.duplexPrinter == false){
            for(int i = 0; i < pages; i++){
                System.out.println("You have printed page " + (i+1) + " out of " + pages + " pages");
                useToner();
                countPagesPrinted();
            }
            System.out.println("Your toner level is at " + this.tonerLevel + " and can print " + this.tonerLevel + " pages until " +
                    "the printer toner runs out of toner");
        }else{
            int totalPagesToPrint = (pages/2) + (pages%2);
            for(int i = 0; i < totalPagesToPrint; i++){
                System.out.println("You have print page " + (i+1) + " out of " + totalPagesToPrint + " pages");
                useTonerDuplex();
                countPagesPrinted();
            }
        }
    }

    private void useToner(){
        this.tonerLevel = this.tonerLevel - 1.0;
    }

    private void useTonerDuplex(){
        this.tonerLevel = this.tonerLevel - 2.0;
    }

    private void countPagesPrinted(){
        this.pagesPrinted = this.pagesPrinted + 1;
    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(double tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public void setPagesPrinted(int pagesPrinted) {
        this.pagesPrinted = pagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }

    public void setDuplexPrinter(boolean duplexPrinter) {
        this.duplexPrinter = duplexPrinter;
    }
}
