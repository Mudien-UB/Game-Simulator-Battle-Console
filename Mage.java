public class Mage extends Character {
    public Mage(String name, int health) {
        super(name, health, "Mage");
    }

    @Override
    public void attack(Character target, AttackType attackType) {
        int damage = 0;

        switch (attackType) {
            case MELEE:
                damage = 2;
                break;
            case RANGED:
                damage = 7;
                break;
            case MAGE:
                damage = 17;
                break;
            default:
                return;
        }
        target.getDamage(damage);
    }
}
