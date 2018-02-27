import java.util.*;
public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//creation of object
		Hangman game1 = new Hangman();

		//assigns values to data members
		game1.setDWord("hello"); //access the setDWord method from Hangman class
		
		//display the content of the disguised word
		game1.print(); //will print ????? because in accessor the value of dWord is assigned iWord.length

		//allow the user to enter a guess
		for (int i = 0; i<4; i++) {
			System.out.println("enter your guess: ");
			game1.makeGuess(input.nextLine());
			
			//display the content of the disguised word
			game1.print();

		}
	}

}
