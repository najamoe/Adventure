public class Item {
    private String item;

    public Item(String item){
        this.item=item;
    }
    public static String getItem(){
        return Item.getItem();
    }

    public String toString(){//overriding the toString() method
        return item;
    }
}
