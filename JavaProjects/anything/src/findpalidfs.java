import java.util.*;
import java.io.*;
public class findpalidfs {
	static String[][] a;
	static int n;
	static String[] s1 = {"P", "A", "L", "I"};
	static String[] s2 = {"I", "L", "A", "P"};
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
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
					if(column(i, j) || row(i, j) || lr(i, j) || rl(i, j)) {
						System.out.println("FOUND");
						System.exit(0);
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
	public static boolean lr(int i, int j) {
		for(int l = 0; l < 4; l++) {
			if(!check(i+l,j+l)) {
				return false;
			}
			if(!a[i+l][j+l].equals(s1[l]) && !a[i+l][j+l].equals(s2[l])) {
				return false;
			}
		}
		return true;
	}
	public static boolean rl(int i, int j) {
		for(int l = 0; l < 4; l++) {
			if(!check(i+l,j-l)) {
				return false;
			}
			if(!a[i+l][j-l].equals(s1[l]) && !a[i+l][j-l].equals(s2[l])) {
				return false;
			}
		}
		return true;
	}
}
/*
2
AB
BC

4
PJRK
AKFL
LOWJ
IWJF

5
JIFLP
FIOPS
FCLTA
AAPAG
DGOJP

9
JWITJOLJJ
KWGNFJKLO
JFLKIOWKL
JIIUFIPKN
JILFBUWBN
FHWAOFINN
HFKSAFHUW
FUBWOJNFG
FHNWOGNKK
*/