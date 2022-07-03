import java.util.*;
import java.io.*;
public class prob15 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int n2 = in.nextInt();
		long ans = 0;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n2; j++) {
				ans+=j*i;
			}
		}
		System.out.println(ans);
	}
}
