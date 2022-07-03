import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class prob07 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input.txt"));
	while(in.hasNextLine()) {
		String line = in.nextLine();
		if(line.equals("0")) break;
		String[] s = line.split(" ");
		int[] n = new int[s.length-1];
		for(int i = 1; i < s.length; i++) {
			n[i-1] = Integer.parseInt(s[i]);
		}
		Arrays.sort(n);
		int a1 = 1;
		int a2 = 1;
		for(int i = 0; i < 3; i++) {
			a1 *= n[n.length-1-i];
		}
		a2 *= n[n.length-1];
		for(int i = 0; i <2; i++) {
			a2 *= n[i];
		}
		System.out.println(Math.max(a1, a2));
		/*
		int i = n.length-1;
		int count = 0;
		int[] ans = new int[3];
		boolean zero = false;
		while(count < 3) {
			if(n[i] == 0) {
				zero = true;
				i--;
				continue;
			} else if(zero == true) {
				if(count%2 == 0) {
					ans = new int[3];
				} else {
					for(int j = 1; j < 3; j++) {
						ans[count] = n[j-count];
					}
				}
				
				break;
			}
			ans[count] = n[i];
			count++;
			i--;
		}
		System.out.println(ans[0] * ans[1] * ans[2]);
		*/
	}
	}
}