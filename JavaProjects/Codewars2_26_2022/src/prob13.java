import java.util.*;
import java.io.*;
public class prob13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = in.next();
		int l = in.nextInt();
		double a = in.nextDouble();
		double w = in.nextDouble();
		double t = Math.sqrt(2*l/a);
		double sp = t*a;
		double d = Math.pow(sp, 2)/9.805;
		System.out.printf(name + " will reach a speed of %.2f m/s on a " + l + " meter ramp, crossing %.1f of " + w + " meters, ", Math.round(sp*100)/100d ,Math.round(d*10)/10d);
		if(Math.round(d*10)/10d < w-5) {
			System.out.println("SPLASH!");
		} else if (Math.round(d*10)/10d >= w-5 && Math.round(d*10)/10d <= w) {
			System.out.println("BARELY MADE IT!");
		} else {
			System.out.println("LIKE A BOSS!");
		}
	}
}
