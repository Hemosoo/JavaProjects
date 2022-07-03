import java.util.*;
import java.io.*;
public class prob21 {
	static String[][] a;
	static int n;
	static String[] s1 = {"M", "O", "J", "O"};
	static String[] s2 = {"O", "J", "O", "M"};
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.nextLine();
		a = new String[n][n];
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
					if(column(i, j) || row(i, j)) {
						System.out.println("FOUND");
						return;
					}
				}
			}
		}
		System.out.println("NOT FOUND");
	}
	public static boolean check(int i, int j) {
		if(i < 0 || j < 0 || i >= n || j >= n) {
			return false;
		}
		
		return true;
	}
	public static boolean column(int i, int j) {
		for(int l = 0; l < 4; l++) {
			if(!check(i+l,j)) {
				return false;
			}
			if(!a[i+l][j].equals(s1[l]) && !a[i+l][j].equals(s2[l])) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean row(int i, int j) {
		for(int l = 0; l < 4; l++) {
			if(!check(i,j+l)) {
				return false;
			}
			if(!a[i][j+l].equals(s1[l]) && !a[i][j+l].equals(s2[l])) {
				return false;
			}
		}
		return true;
	}
	
}
