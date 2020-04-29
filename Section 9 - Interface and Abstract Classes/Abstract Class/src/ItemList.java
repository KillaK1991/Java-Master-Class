public interface ItemList {
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean remove(ListItem item);
    void tranverse(ListItem root);
}
