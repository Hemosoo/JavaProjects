import java.util.*;
import java.io.*;
public class prob03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.printf("%.2f", Math.round((n*n*3.14159 * 3 / 4)*100)/100d);
		System.out.println();
	}
}
