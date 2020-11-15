package Fighter;

public class FightingArena {
    public static void main(String[] args) {
        Fighter Ryu = new Fighter("Ryu", 200, 20);
        Fighter Ken = new Fighter("Ken", 150, 30);
        while (Ryu.getHealth() >= 0 && Ken.getHealth() >= 0) {
            Ryu.Attack(Ryu, Ken);
            if (Ryu.getHealth() > 0) {
                Ken.Attack(Ken, Ryu);
            }else
                System.out.println("Winner is " + Ken.getName());
        }


    }
}
