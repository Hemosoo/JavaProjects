import java.util.*;
import java.io.*;
public class prob05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 2; i < n/2; i++) {
			if(n%i == 0) {
				System.out.println(n + " is NOT Prime");
				return;
			}
		}
		System.out.println(n + " is PRIME");
	}
}
