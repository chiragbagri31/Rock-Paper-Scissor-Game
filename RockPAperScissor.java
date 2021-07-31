package Exercises;
import java.util.Random;
import java.util.Scanner;

public class RockPAperScissor 
{
	public static void main(String[] args)
	{
		int computerWins = 0;
		int userWins = 0;
		int draw = 0;
		int match = 1;
		
		while(match<=5)
		{
		Scanner sc = new Scanner(System.in);
		System.out.print("0 for Rock\n1 for Paper\n2 for Scissor\nEnter your choice : ");
		int userChoice = sc.nextInt();
		
		
		Random r = new Random();
		int computerChoice = r.nextInt(2);
		
		if(userChoice == computerChoice)
		{
			System.out.println("Draw");
			draw++;
		}
		else if(userChoice==0 && computerChoice==2 
			 || userChoice==1 && computerChoice==0
			 || userChoice==2 && computerChoice==1)
		{
			System.out.println("You win!");
			userWins++;
		}
		else 
		{
			System.out.println("Computer wins");
			computerWins++;
		}
		System.out.println("Computer's choice : " + computerChoice + "\n");
		match++;
		}
		
		if(userWins > computerWins)
		{
			System.out.println("your wins : " + userWins);
			System.out.println("Computer wins : " + computerWins);
			System.out.println("You wins the 5 match series");
		}
		
		else if(userWins < computerWins)
		{
			System.out.println("your wins : " + userWins);
			System.out.println("Computer wins : " + computerWins);
			System.out.println("You loses the 5 match series");
		}
		else
		{
			System.out.println("your wins : " + userWins);
			System.out.println("Computer wins : " + computerWins);
			System.out.println("series draw");
		}
	}
}