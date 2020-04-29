public class Ceiling {

    //Field Values
    private double width;
    private double length;
    private boolean openRoof;

    public Ceiling(double width, double legnth, boolean openRoof){
        this.width = width;
        this.length = legnth;
        this.openRoof = openRoof;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public boolean isOpenRoof() {
        return openRoof;
    }

    public void setOpenRoof(boolean openRoof) {
        this.openRoof = openRoof;
    }
}
