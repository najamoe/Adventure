public abstract class Weapon extends Item {

    private int damage;

    public Weapon (String itemName, String shortName, String itemDescription, int damage){
        super(itemName, shortName, itemDescription);
        this.damage = damage;
    }

    public int getDamage(){
        return damage;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
