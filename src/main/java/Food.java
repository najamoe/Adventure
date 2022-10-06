public class Food extends Item {

    private int foodHealth;

    public Food(String itemName, String itemDescription, int foodHealth){
        super(itemName, itemDescription);
        this.foodHealth=foodHealth;
    }

    public int getFoodhealth(){
        return foodHealth;
    }

}
