import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class prob09 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input.txt"));
		String s1 = in.next();
		String s2 = in.next();
		if(s1.equals(s2)) System.out.println("TIE, " + s1.toUpperCase() + " does not affect " + s2.toUpperCase());
		if((s1.equals("Scissors") && s2.equals("Paper"))) {
			System.out.println("SCISSORS WINS, Scissors cuts Paper");
		} else if((s2.equals("Rock") && s1.equals("Paper"))) {
			System.out.println("PAPER WINS, Paper covers Rock");
		} else if((s1.equals("Rock") && s2.equals("Lizard"))) {
			System.out.println("ROCK WINS, Rock crushes Lizard");
		} else if((s2.equals("Spock") && s1.equals("Lizard"))) {
			System.out.println("LIZARD WINS, Lizard poisons Spock");
		} else if((s1.equals("Spock") && s2.equals("Scissors"))) {
			System.out.println("SPOCK WINS, Spock smashes Scissors");
		} else if((s2.equals("Lizard") && s1.equals("Scissors"))) {
			System.out.println("SCISSORS WINS, Scissors decapitates Lizard");
		} else if((s1.equals("Lizard") && s2.equals("Paper"))) {
			System.out.println("LIZARD WINS, Lizard eats Paper");
		} else if((s2.equals("Spock") && s1.equals("Paper"))) {
			System.out.println("PAPER WINS, Paper disproves Spock");
		} else if((s1.equals("Spock") && s2.equals("Rock"))) {
			System.out.println("SPOCK WINS, Spock vaporizes Rock");
		} else if((s2.equals("Scissors") && s1.equals("Rock"))) {
			System.out.println("ROCK WINS, Rock crushes Scissors");
		} 
		
		
		
		else if((s2.equals("Scissors") && s1.equals("Paper"))) {
			System.out.println("PAPER LOSES, Scissors cuts Paper");
		} else if((s1.equals("Rock") && s2.equals("Paper"))) {
			System.out.println("ROCK LOSES, Paper covers Rock");
		} else if((s2.equals("Rock") && s1.equals("Lizard"))) {
			System.out.println("LIZARD LOSES, Rock crushes Lizard");
		} else if((s1.equals("Spock") && s2.equals("Lizard"))) {
			System.out.println("SPOCK LOSES, Lizard poisons Spock");
		} else if((s2.equals("Spock") && s1.equals("Scissors"))) {
			System.out.println("SCISSORS LOSES, Spock smashes Scissors");
		} else if((s1.equals("Lizard") && s2.equals("Scissors"))) {
			System.out.println("LIZARD LOSES, Scissors decapitates Lizard");
		} else if((s2.equals("Lizard") && s1.equals("Paper"))) {
			System.out.println("PAPER LOSES, Lizard eats Paper");
		} else if((s1.equals("Spock") && s2.equals("Paper"))) {
			System.out.println("SPOCK LOSES, Paper disproves Spock");
		} else if((s2.equals("Spock") && s1.equals("Rock"))) {
			System.out.println("ROCK LOSES, Spock vaporizes Rock");
		} else if((s1.equals("Scissors") && s2.equals("Rock"))) {
			System.out.println("SCISSORS LOSES, Rock crushes Scissors");
		} 
	}
}