import java.util.*;
import java.io.*;
public class prob14 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i1 = in.nextInt();
		String s = in.next();
		int i2 = in.nextInt();
		double size = 0;
		if(s.contains("/")) {
			size = Double.parseDouble(s.charAt(0)+"")/Integer.parseInt(s.charAt(2)+"");
		} else {
			size = Integer.parseInt(s);
		}
		double w = size*0.45;
		double f = w*7.5*i1;
		if(f <= i2) {
			System.out.printf("%.2f the Mask can eat it!", Math.round(f*100)/100d);
		} else {
			System.out.printf("%.2f the Mask should not eat it!",Math.round(f*100)/100d);
		}
		
		
	}
}
