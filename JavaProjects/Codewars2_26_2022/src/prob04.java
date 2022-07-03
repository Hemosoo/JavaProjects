import java.util.*;
import java.io.*;
public class prob04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine(); 
		String[] l = new String[n];
		for(int i = 0; i < n; i++) {
			l[i] = in.nextLine();
		}
		for(int i = l.length-1; i >= 0; i--) {
			System.out.println(l[i]);
		}
	}
}
