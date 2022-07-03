import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class prob21 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input.txt"));
		ArrayList<String> a = new ArrayList<String>();
		while(in.hasNextLine()) {
			a.add(in.nextLine());
		}
		//System.out.println(a.get(0).length());
		String[][] grid = new String[a.size()][a.get(0).length()];
		for(int i = 0; i < a.get(0).length()-1; i++) {
			for(int j = 0; j < a.size()-1; j++) {
				System.out.println(i + " " + j);
				grid[i][j] = a.get(j).charAt(i) + "";
				System.out.println(grid[i][j]);
			}
		}
		
	}
}