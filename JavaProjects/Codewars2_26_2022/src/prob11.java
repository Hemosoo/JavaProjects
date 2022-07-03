import java.util.*;
import java.io.*;
public class prob11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.next();
		String f = in.next();
		in.next();
		String k = in.next();
		in.next();
		String x = in.next();
		
		if(f.equals("?")) {
			System.out.printf("F %.2f\n",-1.0 * Math.round(Double.parseDouble(k) * Double.parseDouble(x)*100)/100d);
			
		} else if(k.equals("?")) {
			System.out.printf("K %.2f\n",-1.0 * Math.round((Double.parseDouble(f)/Double.parseDouble(x))*100)/100d);
		} else {
			System.out.printf("X %.2f\n",-1.0 * Math.round((Double.parseDouble(f)/Double.parseDouble(k))*100)/100d);
		}
		//System.out.println(Math.round(-5.115 * 100)/100d);
	}
}
/*
F 10.23
K 2.00
X ?
*/