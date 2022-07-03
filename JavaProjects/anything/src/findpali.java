import java.util.*;
import java.io.*;
public class findpali {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		String[][] a = new String[n][n];
		for(int i = 0; i < n; i++) {
			String line = in.nextLine();
			for(int j = 0; j < n; j++) {
				a[i][j] = line.charAt(j) + "";
			}
		}
		//System.out.println(n);
		//System.out.println(Arrays.deepToString(a));
		//System.out.println(a);
		if(n < 4) {
			System.out.println("NOT FOUND");
		} else {
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					if(a[i][j].equals("P")) {
						if(check(i-1, j , n)) {
							
						}
						
					} else if(a[i][j].equals("I")) {
						
					}
				}
			}
		}
	}
	public static boolean check(int i, int j, int n) {
		if(i < 0 || j < 0 || i >= n || j >= n) {
			return false;
		}
		return true;
	}
}
/*
2
AB
BC
*/