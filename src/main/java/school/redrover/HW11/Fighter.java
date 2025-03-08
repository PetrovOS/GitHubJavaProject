package school.redrover.HW11;

public class Fighter {

    // Task 3 (11.1)
    public String name;
    public int health, damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }


    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        Fighter attacker = fighter1.name.equals(firstAttacker) ? fighter1 : fighter2;
        Fighter defender = fighter1 == attacker ? fighter2 : fighter1;

        while(fighter1.health > 0 && fighter2.health > 0) {
            defender.health -= attacker.damagePerAttack;
            if (defender.health <= 0) {
                return attacker.name;
            }
            Fighter temp = attacker;
            attacker = defender;
            defender = temp;
        }
        return attacker.name;
    }

    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Lew", 10, 2);
        Fighter fighter2 = new Fighter("Harry", 5, 4);

        System.out.println(declareWinner(fighter1, fighter2, "Lew"));
        System.out.println(declareWinner(fighter1,fighter2, "Harry"));
    }
}
