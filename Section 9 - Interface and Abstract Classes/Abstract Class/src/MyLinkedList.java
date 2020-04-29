public class MyLinkedList implements ItemList {

    private ListItem root = null;

    MyLinkedList(ListItem root){
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        //The List is empty
        if(this.root == null){
            this.root = item;
            return true;
        }
        ListItem firstItem = this.root;

        while(firstItem != null){
            int comparison = firstItem.compareItem(item);
            if(comparison < 0){
                //Add value to the right
                if(firstItem.nextValue() != null){
                    firstItem = firstItem.nextValue();
                }else{
                    //End of the list
                    firstItem.setNextValue(item);
                    item.setPreviousValue(firstItem);
                    return true;
                }
            }else if(comparison > 0 ){
                if(firstItem.previousValue != null){
                    firstItem.previousValue().setNextValue(item);
                    item.setPreviousValue(firstItem.previousValue());
                    item.setNextValue(firstItem);
                    firstItem.setPreviousValue(item);
                }else{
                    item.setNextValue(this.root);
                    this.root.setPreviousValue(item);
                    this.root = item;
                }
                return true;
            }else{
                System.out.println(item.getValue() + " is alreayd present, not added");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean remove(ListItem item) {
        if(item != null){
            System.out.println("Deleting item " + item.getValue());
        }

        ListItem currentItem = this.root;
        while(currentItem != null){
            int comparison = currentItem.compareItem(item);
            if(comparison == 0){
                if(currentItem == this.root){
                    this.root = currentItem.nextValue();
                }else{
                    currentItem.previousValue().setNextValue(currentItem);
                    if(currentItem.nextValue() != null){
                        currentItem.nextValue().setPreviousValue(currentItem.previousValue());
                    }
                }
                return true;
            }else if(comparison < 0){
                currentItem = currentItem.nextValue();
            }else{
                return false;
            }
        }

        return false;
    }

    @Override
    public void tranverse(ListItem root) {
        if(root == null){
            System.out.println("The list is empty");
        }else{
            while(root != null){
                System.out.println(root.toString());
                root = root.nextValue();
            }
        }
    }
}
