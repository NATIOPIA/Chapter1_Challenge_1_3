import java.util.Random;
import java.util.Scanner;

public class DungeonGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int health = 100;

        System.out.println("🏰 Welcome to the Dungeon Game!");
        System.out.println("Your adventure begins with " + health + " health.\n");

        for (int room = 1; room <= 5; room++) {
            System.out.println("Entering room " + room + "...");

            int event = rand.nextInt(3) + 1; // random number 1–3

            switch (event) {
                case 1:
                    // Trap event
                    System.out.println("💥 A trap sprung! You lose 20 health!");
                    health -= 20;
                    break;

                case 2:
                    // Healing potion event
                    System.out.println("🧪 You found a healing potion! +15 health.");
                    health += 15;
                    if (health > 100) {
                        health = 100;
                        System.out.println("Your health is capped at 100.");
                    }
                    break;

                case 3:
                    // Monster event
                    System.out.println("👹 A monster appears!");
                    int monsterNumber = rand.nextInt(5) + 1;
                    int guess;
                    do {
                        System.out.print("Guess a number (1-5) to defeat it: ");
                        guess = input.nextInt();

                        if (guess != monsterNumber) {
                            System.out.println("❌ Wrong! Try again.");
                        }
                    } while (guess != monsterNumber);

                    System.out.println("✅ You defeated the monster!");
                    break;
            }

            // Show current health
            System.out.println("Your health is now: " + health + "\n");

            // Check if player died
            if (health <= 0) {
                System.out.println("💀 You have been defeated in room " + room + ".");
                break;
            }
        }

        // End result
        if (health > 0) {
            System.out.println("🎉 You cleared the dungeon! Victorious with " + health + " health!");
        }

        input.close();
    }
}
