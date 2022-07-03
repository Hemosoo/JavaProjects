import java.util.*;
import java.io.*;
public class prob17 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.next();
		double w = in.nextInt() + in.nextInt()/12.0;
		in.next();
		double l = in.nextInt() + in.nextInt()/12.0;
		in.next();
		double d = in.nextInt() + in.nextInt()/12.0;
		in.next();
		int r = in.nextInt();
		in.next();
		int p = in.nextInt();
		//System.out.println(w*l*d);
		//System.out.println(w*l*d/27);
		double R = (w*l*d/27)*0.8;
		R = Math.ceil(R*1000)/1000d;
		double P =(w*l*d/27)*0.2; 
		P = Math.ceil(P*1000)/1000d;
		System.out.printf("R %.3f cu yd\n", R);
		System.out.printf("P %.3f cu yd\n", P);
		System.out.printf("T %.2f dollars\n", Math.ceil((R*r + P*p)*100)/100d);
	}
}
