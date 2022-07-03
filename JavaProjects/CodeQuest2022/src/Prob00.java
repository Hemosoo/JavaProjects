import java.util.*;
import java.io.*;
public class Prob00 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 0; i < n; i++) {
			String[] s = in.next().split(":");
			double a = Double.parseDouble(s[0]);
			double b = Double.parseDouble(s[1]);
			double ans = b/a;
			if(ans <= 1) {
				System.out.println("SWERVE");
			} else if(ans <= 5) {
				System.out.println("BRAKE");
			} else {
				System.out.println("SAFE");
			}
		}
	
	}
}