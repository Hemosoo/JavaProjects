import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class prob09 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input.txt"));
		while(in.hasNextLine()) {
			String l = in.nextLine();
			if(l.equals("0")) break;
			String s = Integer.toBinaryString(Integer.parseInt(l));
			int[] ans = new int[2];
			for(int i = 0; i < s.length(); i++) {
				ans[Character.getNumericValue(s.charAt(i))]++;
			}
			if(ans[0] > ans[1]) System.out.println(l + " LIGHT");
			else if(ans[0] < ans[1]) System.out.println(l + " HEAVY");
			else System.out.println(l + " BALANCED");
		}
	}
}