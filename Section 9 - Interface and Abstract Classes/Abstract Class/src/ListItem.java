public abstract class ListItem {
    protected ListItem nextValue = null;
    protected ListItem previousValue = null;
    protected Object value;

    ListItem(Object value){
        this.value = value;
    }

    public abstract ListItem nextValue();

    public abstract ListItem previousValue();

    public abstract ListItem setNextValue(ListItem listItem);

    public abstract ListItem setPreviousValue(ListItem listItem);

    public abstract int compareItem(ListItem listItem);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return (String.valueOf(this.value));
    }
}
