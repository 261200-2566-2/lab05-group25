public class Support implements rescuedTeam,protectedTeam,Wings{
    protected double hp;
    protected double dfn;
    protected int level;
    public Support(){
        hp = 230;
        dfn = 250;
        level = 1;
    }
    public void showStatus(){
        System.out.println("Sup level " + level + " HP: " + hp + " DFN: " + dfn);
    }
    public double protectRate() {
        return dfn*((1+4.5*level)/100);
    }
    public double percentOfTakeDamage() {
        return dfn*((1+4.3*level)/100);
    }
    public double healRate() {
        return hp*=1.25;
    }
    public double percentOfDefendUp(){
        return 1.2;
    }
    public double wearingWings(){
        return dfn*=percentOfDefendUp();
    }
}
