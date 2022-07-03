import java.util.*;
import java.io.*;
public class prob08 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int n3 = in.nextInt();
		if(n2 <= 0 || n2 > n1) {
			for(int i = 0; i < n1; i++) {
				System.out.println("#");
			}
		} else {
			for(int i = 0; i < n2-2; i++) {
				System.out.println("#");
			}
			String ans = "#";
			for(int i = 0; i < n3/10; i++) {
				ans+=".";
			}
			for(int i = 0; i < n1-(n2-1); i++) {
				ans+="#";
			}
			System.out.println(ans);
		}
	}
}
