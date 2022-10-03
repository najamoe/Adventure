public class Item {
    private String itemName;
    private String itemDescription;

    public Item(String itemName, String itemDescription){
        this.itemName=itemName;
        this.itemDescription=itemDescription;
    }
    public String getItem(){
        return itemName;
    }
    public String getItemDescription() {
        return itemDescription;
    }

    public String toString(){//overriding the toString() method
        return itemName + itemDescription;
    }
}
