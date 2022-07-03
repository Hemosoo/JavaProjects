import java.util.*;
import java.io.*;
public class prob18 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String n = in.nextLine();
		int pn = in.nextInt();
		int tm = in.nextInt()*60;
		int sec = in.nextInt();
		double pow = in.nextDouble()/(60*60);
		int hr = in.nextInt();
		double ans = 0;
		if(pn > hr) {
			ans = 0;
		} else {
			double left = tm-sec;
			if(left >= 1) {
				ans = pow;
			}
		}
		System.out.printf(n + " can generate " + "%.2f watts/second", ans);
        System.out.println();
        if(ans > 1210000) {
        	System.out.println("MARTY CAN MAKE IT!");
        } else {
        	System.out.println("WHOA, HEAVY!");
        }
        
	}
}
