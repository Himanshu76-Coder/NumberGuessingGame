# 🎮 Number Guessing Game (Java)

# 📌 Project Overview :
1. This is a simple Java console-based Number Guessing Game.
2. The game randomly selects a number between 1 and 100.
3. The player tries to guess the correct number using hints.
4. The project contains two different game modes, implemented in two Java files.

# 🧩 Game Modes :

<b>🔹 Game 1 – Unlimited Attempts Mode : </b>
1. File Name: Game1.java
2. Description : <br>
• The player can guess the number unlimited times. <br>
• The game continues until the correct number is guessed. <br>
• The total number of attempts is counted and displayed at the end.
3. Features : <br>
• Random number generation (1–100) <br>
• Unlimited guesses <br>
• Hints for every guess (higher / lower) <br>
• Tracks total attempts <br>
• Simple console interaction

<b>🔹 Game 2 – Limited Attempts Mode : </b>
1. File Name: Game2.java
2. Description : <br>
• The player has only 10 attempts to guess the number. <br>
• Each guess provides a hint. <br>
• The game ends when: <br>
• The player guesses correctly, or <br>
• All attempts are used.
3. Features : <br>
• Random number generation (1—100) <br>
• Maximum IO attempts <br>
• Attempt counter shown for each guess <br>
• Hints for every guess <br>
• Displays correct number if player loses <br>

# 🛠️ Technologies Used :

1. Java
2. OOP Concepts
3. Scanner Class (User Input)
4. Random Class (Number Generation)

# 📁 Project Structure :

NumberGuessingGame/ <br>
│ <br>
├── src/ <br>
│   └── numberGuessingGame/ <br>
│       ├── Game1.java <br>
│       ├── Game2.java <br>
│       └── module-info.java <br>
│ <br>
├── .settings <br>
├── .classpath <br>
├── .project <br>
└── README.md

# ▶️ How to Run the Project using Command Line :

1. Open terminal in project folder.
2. Compile : <br>
  javac src/numberGuessingGame/Game1.java <br>
  javac src/numberGuessingGame/Game2.java
3. Run : <br>
  java numberGuessingGame.Game1
4. or : <br>
  java numberGuessingGame.Game2

# 🎯 How the Game Works :

1. The program generates a random number between 1 and 100.
2. The player enters a guess.
3. The game provides a hint : <br>
  Number is greater than your guess <br>
  Number is less than your guess
4. The game continues until : <br>
  Correct number is guessed, or <br>
  Attempts are finished (Game 2)

# Author :

Himanshu Kumavat <br>
Java Beginner Project
