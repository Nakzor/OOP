package Fighter;

import java.sql.SQLOutput;

public class FightingArena {
    public static void main(String[] args) {
        Fighter Ryu = new Fighter("Ryu", 210, 20);
        Fighter Ken = new Fighter("Ken", 100, 30);
        while (Ken.getHealth() > 0 && Ryu.getHealth() > 0) {
            Ryu.Attack(Ryu, Ken);
            if (Ryu.getHealth() > 0 ) {
                Ken.Attack(Ken, Ryu);

                if (Ken.getHealth() > 0) {

                }else
                    System.out.println("Winner is " + Ryu.getName());



            }else
                System.out.println("Winner is " + Ken.getName());
        }
    }
}
