public abstract class Character {
    protected int health;
    protected String name;
    protected String role;

    public Character(String name, int health, String role) {
        this.health = health;
        this.name = name;
        this.role = role;
    }

    public abstract void attack(Character target, AttackType attackType);

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public void info(){
        System.out.print("\nName : " + this.name + "| Role : " + this.role + "| Health : " + this.health);
    }

    public void getDamage(int damage) {
        this.health -= damage;
        System.out.println(this.name + " | "+ this.role + " took damage");
    }
    public boolean isAlive() {
        return health > 0;
    }
}



