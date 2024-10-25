import java.util.Scanner;

public class GameApp {
    public void start(Character warrior, Character mage) {
        Scanner scanner = new Scanner(System.in);

        Character attacker = warrior;
        Character defender = mage;
        while (mage.isAlive() && warrior.isAlive()) {
            attacker.info();
            System.out.println("\n" + attacker.getName() + " attacks " + defender.getName());
            System.out.println("Pilih tipe serangan: \n1. MELEE\n2. RANGED\n3. MAGE");
            char choice = scanner.nextLine().charAt(0);
            AttackType attackType;

            switch (choice) {
                case '1':
                    attackType = AttackType.MELEE;
                    break;
                case '2':
                    attackType = AttackType.RANGED;
                    break;
                case '3':
                    attackType = AttackType.MAGE;
                    break;
                case 'X', 'x':
                    return;
                default:
                    System.out.println("Invalid choice.");
                    attackType = AttackType.NONE;
                    break;
            }

            attacker.attack(defender, attackType);

            if (!defender.isAlive()) {
                System.out.println(defender.getName() + " is dead." + " " + attacker.getName() + " wins!");
                break;
            }

            Character temp = attacker;
            attacker = defender;
            defender = temp;

        }
        if (mage.isAlive()) {
            System.out.println("Mage wins!");
        } else {
            System.out.println("Warrior wins!");
        }
    }
}
