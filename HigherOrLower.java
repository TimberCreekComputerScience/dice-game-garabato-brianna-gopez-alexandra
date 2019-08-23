import java.util.Scanner;
public class HigherOrLower {

	public static void main(String[] args) {
		
		Scanner scany = new Scanner(System.in);
		int dice1 = (int)(Math.random()*6)+1;
		int dice2 = (int)(Math.random()*6)+1;
		System.out.println("Welcome! \nDo you want to roll the dice? \n1 for yes  2 for no");
		int input = scany.nextInt();
		
		if (input == 1){
			System.out.println("You got " + dice1);
			System.out.println("Will it be higher or lower? \n1 for higher  2 for lower");
			int input2 = scany.nextInt();
			
			if (input2 == 1){
				if (dice1 > dice2){
					System.out.println("You got " + dice2 + "\nYou lose");
				} 
				if (dice1 < dice2){
					System.out.println("You got " + dice2 + "\nYou won");
				} 
				if (dice1 == dice2) {
					System.out.println("You got " + dice2 + "\nThey are equal which means you lose either way");
				}
			} 
			if (input2 == 2){
				if (dice1 > dice2){
					System.out.println("You got " + dice2 + "\nYou won");
				} 
				if (dice1 < dice2){
					System.out.println("You got " + dice2 + "\nYou lose");
				} 
				if (dice1 == dice2){
					System.out.println("You got " + dice2 + "\nThey are equal which means you lose either way");
				}
			}
			if (input >= 3 || input <= 0){
				System.out.println("Goodbye then");
			}
		} 
		if (input == 2){
			System.out.println("Goodbye then");
		} 
		if (input >= 3 || input <= 0){
			System.out.println("Goodbye then");
		}
	}

}