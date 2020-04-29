public class X {
    private int x;

    X(int x){
        this.x = x;
    }

    public void printMultiplication(){
        for(int x = 0; x < 13; x++){
            System.out.println(this.x +" times " + x + " is = " + this.x*x);
        }
    }
}
