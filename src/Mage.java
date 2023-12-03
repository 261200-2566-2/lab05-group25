public class Mage implements attackedTeam,Shoes{
    protected double hp;
    protected double dmg;
    protected int level;
    public Mage(){
        hp = 200;
        dmg = 250;
        level = 1;
    }
    public void showStatus(){
        System.out.println("Mage level " + level + " HP: " + hp + " DMG: " + dmg);
    }
    public double percentOfMakeDamage() {
        return dmg*((1+6.5*level)/100);
    }
    public double percentOfDamageUp(){
        return 1.13;
    }
    public double wearingShoes(){
        return dmg*=percentOfDamageUp();
    }
}
