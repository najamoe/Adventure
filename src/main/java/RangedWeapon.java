public class RangedWeapon extends Weapon { //limited weapons

    private int ammo;

    public RangedWeapon (String itemName, String shortName, String itemDescription, int damage, int ammo){
        super(itemName, shortName, itemDescription, damage);
        this.ammo = ammo;
    }

    public int getAmmo(){
        return ammo;
}

}
