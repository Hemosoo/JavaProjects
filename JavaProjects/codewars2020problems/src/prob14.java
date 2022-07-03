import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class prob14 {
	public static void main(String[] args) throws IOException {
		boolean found = false;
		Scanner in = new Scanner(new File("input.txt"));
		int a = in.nextInt();
		int b = in.nextInt();
		for(int i = a+1; i < b; i++) {
			String s = i + "";
			int odd = 0;
			int even = 0;
			for(int j = 0; j < s.length(); j++) {
				if(j%2 == 0) {
					even += Integer.parseInt(s.charAt(j)+"");
				} else {
					odd += Integer.parseInt(s.charAt(j)+"");
				}
			}
			//System.out.println(odd);
			//System.out.println(even);
			if(odd == even) {
				System.out.print(i + " ");
				found = true;
			}
		}
		if(found == false) {
			System.out.println("No Numbers found with Equal Sum in the given range!!");
		}
	}
}