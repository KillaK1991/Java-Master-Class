public class Main {

    public static void main(String[] args){
        MyLinkedList myList = new MyLinkedList(null);
        String itemsOnList = "Milk Eggs Cheese Cookies Cookies";
        String[] listArray = itemsOnList.split(" ");

        for(String list: listArray){
            myList.addItem(new Item(list));
        }
        myList.tranverse(myList.getRoot());
    }
}