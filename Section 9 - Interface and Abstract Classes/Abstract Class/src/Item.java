public class Item extends ListItem {

    Item(Object value){
        super(value);
    }

    @Override
    public ListItem nextValue() {
        return this.nextValue;
    }

    @Override
    public ListItem previousValue() {
        return this.previousValue;
    }

    @Override
    public ListItem setNextValue(ListItem listItem) {
        this.nextValue = listItem;
        return this.nextValue;
    }

    @Override
    public ListItem setPreviousValue(ListItem listItem) {
        this.previousValue = listItem;
        return this.previousValue;
    }

    @Override
    public int compareItem(ListItem listItem) {
       //if first value should be first return -1
        if(this.toString().compareTo(listItem.toString()) < 0){
            return -1;
        }
      //if second value should be first return 1
        if(this.toString().compareTo(listItem.toString()) > 0){
            return 1;
        }

      //Zero will be returned if both strings match
        return 0;
    }
}
