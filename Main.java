import java.util.Scanner;

public class Main {

    public static String CharacterName(int choice) {
        Scanner scanner = new Scanner(System.in);
        if(choice == 1) {
            System.out.print("Warrior Name : ");
            return scanner.nextLine();
        }else if(choice == 2) {
            System.out.print("Mage Name : ");
            return scanner.nextLine();
        } else {
            return "nobody";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameApp game = new GameApp();
        Character player1 = null;
        Character player2 = null;
        String nameCharacter1;
        String nameCharacter2;

        System.out.println("=== GAME STARTED ===");
        System.out.println("Player 1, Choose your character: \n1. Warrior \n2. Mage");
        int choicePlayer1 = Integer.parseInt(scanner.nextLine());
        if(choicePlayer1 == 1) {
            System.out.println("Player 1, Enter your name: ");
            nameCharacter1 = CharacterName(1);
            player1 = new Warrior(nameCharacter1, 100);
            System.out.println("Player 2, Enter your name: ");
            nameCharacter2 = CharacterName(2);
            player2 = new Mage(nameCharacter2, 70);
            game.start(player1, player2);
        } else if(choicePlayer1 == 2) {
            System.out.println("Player 1, Enter your name: ");
            nameCharacter1 = CharacterName(2);
            player1 = new Mage(nameCharacter1, 70);
            System.out.println("Player 2, Enter your name: ");
            nameCharacter2 = CharacterName(1);
            player2 = new Warrior(nameCharacter2, 100);
            game.start(player2, player1);
        } else {
            return;
        }
    }
}
