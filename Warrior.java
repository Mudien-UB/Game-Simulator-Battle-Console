public class Warrior extends Character {


    public Warrior(String name, int health) {
        super(name, health, "Warrior");
    }
    @Override
    public void attack(Character target, AttackType attackType) {
        int damage = 0;

        switch (attackType) {
            case MELEE:
                damage = 10;
                break;
            case RANGED:
                damage = 5;
                break;
            case MAGE:
                damage = 3;
                break;
            default:
                return;
        }
        target.getDamage(damage);
    }
}
