import java.util.*;
import java.io.*;

public class weirdalg {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		System.out.print(num + " ");
		while (num != 1) {
			if (num%2 == 1) {
				num = (num*3) + 1;
				System.out.print(num + " ");
			} else {
				num = (num/2);
				System.out.print(num + " "); /*this is a comment*/
			}
		}
	}
}
