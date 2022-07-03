import java.util.*;
import java.io.*;
public class prob02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double h = in.nextDouble();
		double r = in.nextDouble();
		System.out.printf("%.2f cubic inches", Math.round(3.1415926536 * r * r * h*100)/100d);
	}
}
