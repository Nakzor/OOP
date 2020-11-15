package Fighter;



public class Fighter {
    private String name;
    private int health;
    private int damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamagePerAttack() {
        return damagePerAttack;
    }

    public void setDamagePerAttack(int damagePerAttack) {
        this.damagePerAttack = damagePerAttack;
    }

    public void Attack(Fighter F1, Fighter F2) {
        int damage = F2.getDamagePerAttack();
        System.out.println(F1.getName() + " has been attacked by " + F2.getName() + " for " + damage + "damage!");
        F1.setHealth(F1.getHealth() - damage);
        System.out.println(F1.getName() + " has " + F1.getHealth() + " health left!");


    }
}
