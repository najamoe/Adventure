public class Food extends Item {

    private int healthStatus;

    public Food(String itemName, String itemDescription, int healthStatus, String shortName) {
        super(itemName, itemDescription, shortName);
        this.healthStatus = healthStatus;
    }
    public int getFoodhealth() {
        return healthStatus;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
