import java.io.*;
import java.util.*;
public class CalculatOR {
	static Scanner in;
	static int n;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		init();
		solve();
	}
	public static void init() {
		n = in.nextInt();
		
	}
	public static void solve() {
		for(int i = 0; i < n; i++) {
			double i1 = in.nextInt();
			String op = in.next();
			double i2 = in.nextInt();
			//System.out.println(op);
			if(op.equals("+")) {
				
				System.out.println((i1+i2) + " " + (i1+i2));
			} else if(op.equals("-")) {
				System.out.println((i1 - i2) + " " + (i2-i1));
				
			} else if(op.equals("*")) {
				System.out.println((i1*i2) + " " + (i2*i1));
			} else {
				double d1 = i1;
				double d2 = i2;
				System.out.println((Math.round((d1/d2)*10)/10d) + " " + (Math.round((d2/d1)*10)/10d));
			}
		}
	}
}
