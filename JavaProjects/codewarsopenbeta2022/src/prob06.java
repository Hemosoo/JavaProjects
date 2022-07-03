import java.util.*;
import java.io.*;
public class prob06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextDouble()) {
			double d = in.nextDouble();
			double ans= 0;
			if(d == 0) {
				break;
			}
			//System.out.println(d);
			ans = Math.pow(d, 2);
			ans = Math.cbrt(ans);
			System.out.println(Math.round(ans*10000)/10000d);
		}
	}
}
