package com.company;
import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }
// take a random variable
    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    // take user input
    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    //guess the number
    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber==number){
            System.out.format("Jackpot! you guessed it right, it was %d\n\t You guessed it in %d attempts", number, noOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Guess a larger number");
        }
        else if(inputNumber>number){
            System.out.println("Guess a lower number");
        }
        return false;
    }

}
public class guess_the_number {
    public static void main(String[] args) {
        /*
            Create a class Game, which allows a user to play "Guess the Number"
            game once. Game should have the following methods:
            1. Constructor to generate the random number
            2. takeUserInput() to take a user input of number
            3. isCorrectNumber() to detect whether the number entered by the user is true
            4. getter and setter for noOfGuesses
            Use properties such as noOfGuesses(int), etc to get this task done!
         */

        Game g = new Game();
        boolean b= false;
        while(!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
        }

    }
}



