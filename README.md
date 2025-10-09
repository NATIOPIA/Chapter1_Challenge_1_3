# ⚔️ Chapter1_Challenge_1_3: The Dungeon Game (Console + GUI Version)

## 🏫 Personal Information
- **University/College:** Dilla University  
- **Department:** Computer Science  
- **Course Name:** Java Programming  
- **Instructor:** Mr. Yared  
- **Student Name:** Natnael Tsedeke  
- **Student ID:** RMNS/7783-/23  

---

## 🧩 Challenge Overview
This project is part of **Chapter 1 Programming Challenges**, focusing on **Decision Making** and **Repetition (Loops)**.  
The goal is to build a simple **text-based Dungeon Game**, where the player moves through 5 rooms, encountering random events — and a **GUI version** using Java Swing for interaction.

---

## 🎯 Objectives
1. Set the player's starting health to **100**.  
2. Use a **for loop** to simulate 5 rooms.  
3. In each room, a random event occurs:
   - **1:** A trap reduces health by 20.  
   - **2:** A healing potion adds 15 (up to 100 max).  
   - **3:** A monster appears — player must guess a random number (1–5) until correct.  
4. Use a **switch statement** to handle events.  
5. Use a **do-while loop** for monster guessing.  
6. If health ≤ 0, the game ends early.  
7. If all 5 rooms are cleared, display victory and final health.  

---

## 🧠 Concepts Practiced
- Conditional logic (`if`, `switch`)
- Loops (`for`, `do-while`)
- Random number generation (`Random`)
- User input handling (`Scanner`, GUI input fields)
- GUI design using **Java Swing**
- Event-driven programming (ActionListener)

---

## 🖥️ Console Version Example Output

Entering room 1...
💥 A trap sprung! You lose 20 health.
❤️ Health is now 80.

Entering room 2...
🧪 You found a healing potion! Health is now 95.

Entering room 3...
👹 A monster appears! Guess a number (1-5):

3
Wrong! Try again:
2
Correct! You defeated the monster!

🎉 You cleared the dungeon! Victorious with 75 health!


---

## 🪟 GUI Version Features
- Built using **Java Swing**.
- Buttons to control progression through rooms.  
- Text area displays real-time game messages.  
- Guess input box and button for defeating monsters.  
- Health tracking and victory/defeat display.  
- Emoji-based feedback for engagement.

---

## 🧾 Example GUI Flow
1. Click **Enter Next Room** → random event occurs.  
2. If a monster appears:
   - Enter a number (1–5) and click **Guess Monster Number**.
   - Continue until you defeat it.  
3. The game automatically ends when health ≤ 0 or after 5 rooms.  

---

## 🏁 Output Example (GUI)
🏰 Welcome to the Dungeon Game!
Your adventure begins with 100 health.

Entering room 1...
🧪 You found a healing potion! +15 health.
❤️ Current Health: 100

Entering room 2...
👹 A monster appears! Guess a number (1–5) to defeat it.
❌ Wrong guess! Try again.
✅ You defeated the monster!

🎉 You cleared all 5 rooms! Victorious with 85 health!


---

## 🪶 Reflection
This challenge helped me strengthen my understanding of:
- Control flow using **loops** and **switch statements**.  
- Implementing **randomized events** and dynamic behavior.  
- Designing **user interfaces** and handling button actions.  
- Managing **state and user feedback** in a game setting.  

The **most challenging part** was ensuring the game logic worked correctly inside the GUI without breaking the flow — especially synchronizing the monster guessing logic with button clicks.  
However, completing it improved my confidence with **event-driven GUI programming** in Java.

---

## 🧰 Technologies Used
- Java 8+
- NetBeans IDE
- Swing GUI Toolkit
- Git & GitHub

---

## 📁 Project Structure
Chapter1_Challenge_1_3/
│
├── DungeonGameConsole/ # Console version
│ └── DungeonGame.java
│
├── DungeonGameGUI/ # GUI version
│ └── DungeonGameGUI.java
│
└── README.md


---

## 🚀 How to Run
1. Open the project in **NetBeans**.  
2. Run either version:
   - **Console version:** `DungeonGame.java`
   - **GUI version:** `DungeonGameGUI.java`  
3. Play and enjoy!

---

## 🏆 GitHub Repository
🔗 [https://github.com/NATIOPIA/Chapter1_Challenge_1_3](https://github.com/NATIOPIA/Chapter1_Challenge_1_3)

---

### 💡 “Courage and logic conquer all dungeons.”
