// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    //สาธิต 2 ตัวละครคือ Tank กับ Support
    static String[] actions = new String[2];
    static void playConsoleForTP(Scanner s){
        System.out.println("Press number for your actions : [1]Attack [2]Shoes [3]Wings");
        System.out.print("Tank: ");
        actions[0] = s.nextLine();
        System.out.println("Press number for your actions : [1]Defend [2]Protect [3]Wings");
        System.out.print("Sup: ");
        actions[1] = s.nextLine();
    }
    static void pickActionsForTP(Tank t,String a,Support p,String b){
        if(a.equalsIgnoreCase("1") && b.equalsIgnoreCase("1")){
            Actions.attackAndDefend(t,p);
        }else if(a.equalsIgnoreCase("1") && b.equalsIgnoreCase("2")){
            Actions.attackAndProtect(t,p);
        }else if(a.equalsIgnoreCase("2")){
            t.wearingShoes();
        }else if(a.equalsIgnoreCase("3")){
            t.wearingWings();
        }else if(b.equalsIgnoreCase("3")){
            p.wearingWings();
        }
    }
    static boolean victory = true;

    public static void main(String[] args) {
        System.out.println("สาธิต 2 ตัวละครคือ Tank กับ Support");
        Scanner s = new Scanner(System.in);
        Tank t = new Tank();
        Support p = new Support();
        while (victory) {
            playConsoleForTP(s);
            pickActionsForTP(t, actions[0], p, actions[1]);
            if(t.hp < 1|| p.hp < 1) victory = false;
        }
        if(t.hp > 1) System.out.println("The winner is TANK!!!");
        else if(p.hp > 1) System.out.println("The winner is Support!!!");
    }
}