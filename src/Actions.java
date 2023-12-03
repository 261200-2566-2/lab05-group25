public class Actions {
    static void attackAndAttack(Tank t,Mage m){
        double a = t.percentOfMakeDamage();
        double b = m.percentOfMakeDamage();
        double diff = Math.abs(a-b);
        if(a > b){
            m.dmg = (m.dmg*(100-diff))/100;
            m.hp-=50;
            t.level++;
        }else{
            t.dmg = (t.dmg*(100-diff))/100;
            t.hp-=50;
            m.level++;
        }
        t.showStatus();
        m.showStatus();
    }
    static void attackAndAttack(Mage m,Tank t){
        double a = m.percentOfMakeDamage();
        double b = t.percentOfMakeDamage();
        double diff = Math.abs(a-b);
        if(a > b){
            t.dmg = (t.dmg*(100-diff))/100;
            t.hp-=50;
        }else{
            m.dmg = (m.dmg*(100-diff))/100;
            m.hp-=50;
        }
        m.showStatus();
        t.showStatus();
    }
    static void attackAndDefend(Mage m,Support p){
        double a = m.percentOfMakeDamage();
        double b = p.percentOfTakeDamage();
        double diff = Math.abs(a-b);
        if(a > b){
            p.hp = (p.hp*(100-diff))/100;
            m.level++;
        }
        m.showStatus();
        p.showStatus();
    }
    static void attackAndDefend(Mage m,Tank t){
        double a = m.percentOfMakeDamage();
        double b = t.percentOfTakeDamage();
        double diff = Math.abs(a-b);
        if(a > b){
            t.hp = (t.hp*(100-diff))/100;
            m.level++;
        }
        m.showStatus();
        t.showStatus();
    }
    static void attackAndDefend(Tank t,Support p){
        double a = t.percentOfMakeDamage();
        double b = p.percentOfTakeDamage();
        double diff = Math.abs(a-b);
        if(a > b){
            p.hp = (p.hp*(100-diff))/100;
            t.level++;
        }
    }
    static void defendAndAttack(Tank t,Mage m){
        double a = t.percentOfTakeDamage();
        double b = m.percentOfMakeDamage();
        double diff = Math.abs(a-b);
        if(a < b){
            t.hp = (t.hp*(100-diff))/100;
            m.level++;
        }
        t.showStatus();
        m.showStatus();
    }
    static void defendAndAttack(Support p,Mage m){
        double a = p.percentOfTakeDamage();
        double b = m.percentOfMakeDamage();
        double diff = Math.abs(a-b);
        if(a < b){
            p.hp = (p.hp*(100-diff))/100;
            m.level++;
        }
        p.showStatus();
        m.showStatus();
    }
    static void defendAndAttack(Support p,Tank t){
        double a = p.percentOfTakeDamage();
        double b = t.percentOfMakeDamage();
        double diff = Math.abs(a-b);
        if(a < b){
            p.hp = (p.hp*(100-diff))/100;
            t.level++;
        }
        p.showStatus();
        t.showStatus();
    }
    static void protectAndAttack(Tank t,Mage m){
        double a = t.protectRate();
        double b = m.percentOfMakeDamage();
        double diff = Math.abs(a-b);
        if(a > b){
            m.dmg = (m.dmg*(100-diff))/100;
            m.hp-=50;
            t.level++;
        }else{
            t.dfn = (t.dfn*(100-diff))/100;
            t.hp-=50;
            m.level++;
        }
        t.showStatus();
        m.showStatus();
    }
    static void protectAndAttack(Support p,Mage m){
        double a = p.protectRate();
        double b = m.percentOfMakeDamage();
        double diff = Math.abs(a-b);
        if(a > b){
            m.dmg = (m.dmg*(100-diff))/100;
            m.hp-=50;
            p.level++;
        }else{
            p.dfn = (p.dfn*(100-diff))/100;
            p.hp-=50;
            m.level++;
        }
        p.showStatus();
        m.showStatus();
    }
    static void protectAndAttack(Support p,Tank t){
        double a = p.protectRate();
        double b = t.percentOfMakeDamage();
        double diff = Math.abs(a-b);
        if(a > b){
            t.dmg = (t.dmg*(100-diff))/100;
            t.hp-=50;
            p.level++;
        }else{
            p.dfn = (p.dfn*(100-diff))/100;
            p.hp-=50;
            t.level++;
        }
        p.showStatus();
        t.showStatus();
    }
    static void attackAndProtect(Tank t,Support p){
        double a = t.percentOfMakeDamage();
        double b = p.protectRate();
        double diff = Math.abs(a-b);
        if(a < b){
            t.dmg = (t.dmg*(100-diff))/100;
            t.hp-=50;
            p.level++;
        }else{
            p.dfn = (p.dfn*(100-diff))/100;
            p.hp-=50;
            t.level++;
        }
    }
    static void attackAndProtect(Mage m,Support p){
        double a = m.percentOfMakeDamage();
        double b = p.protectRate();
        double diff = Math.abs(a-b);
        if(a < b){
            m.dmg = (m.dmg*(100-diff))/100;
            m.hp-=50;
            p.level++;
        }else{
            p.dfn = (p.dfn*(100-diff))/100;
            p.hp-=50;
            m.level++;
        }
        m.showStatus();
        p.showStatus();
    }
    static void attackAndProtect(Mage m,Tank t){
        double a = m.percentOfMakeDamage();
        double b = t.protectRate();
        double diff = Math.abs(a-b);
        if(a < b){
            m.dmg = (m.dmg*(100-diff))/100;
            m.hp-=50;
            t.level++;
        }else{
            t.dfn = (t.dfn*(100-diff))/100;
            t.hp-=50;
            m.level++;
        }
        m.showStatus();
        t.showStatus();
    }
}
