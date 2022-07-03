import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class prob03 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input.txt"));
		String grid = "";
		int length = 0;
		while(in.hasNextLine()) {
			String line = in.nextLine();
			grid += line;
			length = line.length();
			
		}
		//System.out.println(length);
		//System.out.println(grid);
		boolean p = false;
		for(int j = 0; j < grid.length()/length; j++) {
			for(int i = 0; i < length; i++) {
				if(grid.charAt(j*length + i) == 'P') {
					System.out.println("Ace, move fast, pigeon is at (" + i + ", " + j + ")");
					p = true;
					break;
				}
			}
		}
		if(!p) System.out.println("No pigeon, try another map, Ace");
		
		
	} 
}