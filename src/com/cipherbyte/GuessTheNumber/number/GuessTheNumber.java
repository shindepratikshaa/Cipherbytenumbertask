package com.cipherbyte.GuessTheNumber.number;

import java.util.Random;

import javax.swing.JOptionPane;

public class GuessTheNumber {

	public static void main(String[] args) {
        final int MAX_ATTEMPTS = 10; // Maximum attempts allowed
        int score = 0; // Score counter
        
        JOptionPane.showMessageDialog(null, "Welcome to Guess the Number game!");

        
        while (true) {
            Random random = new Random();
            int randomNumber = random.nextInt(100) + 1; // Generates random number from 1 to 100
            int attempts = 0;

            // Guessing loop
            while (attempts < MAX_ATTEMPTS) {
                String input = JOptionPane.showInputDialog("Enter your guess (between 1 and 100):");
                int guess = Integer.parseInt(input);

                if (guess == randomNumber) {
                    JOptionPane.showMessageDialog(null, "Congratulations! You guessed the number " + randomNumber + " in " + (attempts + 1) + " attempts.");
                    score += MAX_ATTEMPTS - attempts; // Example of scoring based on attempts
                    break;
                } else if (guess < randomNumber) {
                    JOptionPane.showMessageDialog(null, "Too low. Try again.");
                } else {
                    JOptionPane.showMessageDialog(null, "Too high. Try again.");
                }

                attempts++;
            }

            // Check if user wants to play again
            int option = JOptionPane.showConfirmDialog(null, "Do you want to play again?", "Play Again", JOptionPane.YES_NO_OPTION);
            if (option != JOptionPane.YES_OPTION) {
                break; // Exit the game loop if user chooses not to play again
            }
        }

        JOptionPane.showMessageDialog(null, "Game over. Your final score is: " + score);
    }
}
