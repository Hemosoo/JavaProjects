import java.util.*;
import java.io.*;
public class prob05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		System.out.println(String.format("(%s * %s) * (%s * %s) = %s * (%s * %s) * %s", a, b, c, d, a, b, d, c));
		System.out.println(String.format("%s * %s = %s * %s * %s", a*b, c*d, a, b*d, c));
		System.out.println(String.format("%s = %s", a*b*c*d, a*b*c*d));
	}
}
