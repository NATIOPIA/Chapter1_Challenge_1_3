import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class DungeonGameGUI extends JFrame {
    private JTextArea outputArea;
    private JButton nextRoomButton;
    private JButton guessButton;
    private JTextField guessField;

    private int health = 100;
    private int currentRoom = 0;
    private int monsterNumber = 0;
    private boolean fightingMonster = false;

    private Random rand = new Random();

    public DungeonGameGUI() {
        // Frame setup
        setTitle("🏰 Dungeon Game");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Output area
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        outputArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(outputArea);

        // Buttons
        nextRoomButton = new JButton("Enter Next Room");
        guessButton = new JButton("Guess Monster Number");
        guessField = new JTextField(5);
        guessButton.setEnabled(false);
        guessField.setEnabled(false);

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(nextRoomButton);
        bottomPanel.add(new JLabel("Guess (1-5):"));
        bottomPanel.add(guessField);
        bottomPanel.add(guessButton);

        add(scrollPane, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        // Welcome message
        outputArea.append("🏰 Welcome to the Dungeon Game!\n");
        outputArea.append("Your adventure begins with " + health + " health.\n\n");

        // Button actions
        nextRoomButton.addActionListener(e -> enterNextRoom());
        guessButton.addActionListener(e -> handleMonsterGuess());
    }

    private void enterNextRoom() {
        if (fightingMonster) {
            outputArea.append("⚠️ You must defeat the monster first!\n\n");
            return;
        }

        if (health <= 0) {
            outputArea.append("💀 You have been defeated! Game Over.\n");
            nextRoomButton.setEnabled(false);
            return;
        }

        currentRoom++;
        if (currentRoom > 5) {
            outputArea.append("🎉 You cleared all 5 rooms! Victorious with " + health + " health!\n");
            nextRoomButton.setEnabled(false);
            return;
        }

        outputArea.append("Entering room " + currentRoom + "...\n");

        int event = rand.nextInt(3) + 1;

        switch (event) {
            case 1: // Trap
                outputArea.append("💥 A trap sprung! You lose 20 health!\n");
                health -= 20;
                break;

            case 2: // Healing
                outputArea.append("🧪 You found a healing potion! +15 health.\n");
                health += 15;
                if (health > 100) {
                    health = 100;
                    outputArea.append("Your health is capped at 100.\n");
                }
                break;

            case 3: // Monster
                outputArea.append("👹 A monster appears! Guess a number (1–5) to defeat it.\n");
                fightingMonster = true;
                monsterNumber = rand.nextInt(5) + 1;
                guessButton.setEnabled(true);
                guessField.setEnabled(true);
                nextRoomButton.setEnabled(false);
                break;
        }

        outputArea.append("❤️ Current Health: " + health + "\n\n");

        if (health <= 0) {
            outputArea.append("💀 You have been defeated in room " + currentRoom + ".\n");
            nextRoomButton.setEnabled(false);
        }
    }

    private void handleMonsterGuess() {
        try {
            int guess = Integer.parseInt(guessField.getText());

            if (guess < 1 || guess > 5) {
                outputArea.append("⚠️ Guess must be between 1 and 5!\n");
                return;
            }

            if (guess == monsterNumber) {
                outputArea.append("✅ You defeated the monster!\n\n");
                fightingMonster = false;
                guessButton.setEnabled(false);
                guessField.setEnabled(false);
                nextRoomButton.setEnabled(true);
            } else {
                outputArea.append("❌ Wrong guess! Try again.\n");
            }

            guessField.setText("");
        } catch (NumberFormatException ex) {
            outputArea.append("⚠️ Please enter a valid number.\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DungeonGameGUI().setVisible(true));
    }
}
