public class Tank implements protectedTeam, attackedTeam,Shoes,Wings {
    protected double hp;
    protected double dmg;
    protected double dfn;
    protected int level;
    public Tank(){
        hp = 250;
        dmg = 200;
        dfn = 250;
        level = 1;
    }
    public void showStatus(){
        System.out.println("Tank level " + level + " HP: " + hp + " DMG: " + dmg + " DFN: " + dfn);
    }
    public double percentOfMakeDamage() {
        return dmg*((1+5.5*level)/100);
    }
    public double protectRate() {
        return dfn*((1+7.5*level)/100);
    }
    public double percentOfTakeDamage() {
        return dfn*((1+3.3*level)/100);
    }
    public double percentOfDamageUp(){
        return 1.2;
    }
    public double wearingShoes(){
        return dmg*=percentOfDamageUp();
    }
    public double percentOfDefendUp(){
        return 1.2;
    }
    public double wearingWings(){
        return dfn*=percentOfDefendUp();
    }
}
