# Guessing Game

This is a simple number guessing game implemented in Java. The player needs to guess a randomly generated number between 1 and 100.

## How to Play

1. Run the program.
2. Select the language by entering the corresponding number:
    - 1 for Hungarian
    - 2 for English
3. Guess the number by entering your guess.
4. The program will provide feedback on whether your guess is too low or too high.
5. Keep guessing until you correctly guess the number.
6. If you happen to guess the Easter egg number, you will be notified with a special message.

## Optimizations

The game has been optimized in the following ways:

1. User Input Validation: The program validates user input to ensure that only valid values are accepted.
2. Reuse of Random Object: The `Random` object is created only once at the start of the game and reused for subsequent guesses.
3. Reusable Text Messages: The congratulatory messages and the Easter egg messages are stored in variables and reused for both languages, eliminating code duplication.
4. Simplified Loop Condition: The loop condition has been simplified by checking the guess immediately after input, avoiding redundant checks at the end of the loop.

## Language Selection

The game offers language selection at the beginning. You can choose between Hungarian and English by entering the corresponding number.

## Contributions

Contributions to the project are welcome. If you have any ideas for further improvements or new features, feel free to submit a pull request.

Have fun playing the Guessing Game!
