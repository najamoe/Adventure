public class Item {
    private String itemName;
    private String itemDescription;
    private String shortName;

    public Item(String itemName, String itemDescription, String shortName) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.shortName=shortName;
    }

    public String getItemName() {
        return itemName;
    }
    @Override
    public String toString() {
        return itemName + itemDescription ;
    }
}
