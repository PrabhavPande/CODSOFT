package task;
import java.util.Random;
import java.util.Scanner;


class Game
{
	int number;
	int inputNumber;
	int guess =0;
	//getter
	public int getGuess()
	{
		return guess;
	}
	//setter
	public void setGuess(int guess)
	{
		this.guess = guess;
	}
	//constructer
	Game()
	{
		Random rand = new Random();
		this.number=rand.nextInt(100);
	}
	//taking user input
	int takeUserInput()
	{
		System.out.println("Guess the number!");
		Scanner s = new Scanner(System.in);
		inputNumber = s.nextInt();
		return inputNumber;
	}
	//checking for correct number
	boolean isCorrectNumber()
	{
		guess++;
		if (inputNumber == number) 
		{
			System.err.println("yes you guessed it right, it is |"+number+"| you guessed it in |"+guess+"| attempts");
			return true;
		}
		else if (inputNumber< number) 
		{
			System.out.println("too low! Guess again");
			return false;
		}
		else if (inputNumber>number) 
		{
			System.out.println("too high! Guess Again");
			return false;
		}
		return false;
		
	}
}

public class NumberGame 
{
	public static void main(String[] args)
	{
		Game g = new Game();
		boolean b = false;
		 while (!b) {
		g.takeUserInput();
		 b = g.isCorrectNumber();
		System.out.println(b);
		 }
	}

}
