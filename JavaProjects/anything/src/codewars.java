import java.io.*;
import java.util.*;
public class codewars {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] s = {"ten", "eleven", "twelve", "thriteen", "fourteen", "fifteen", " sixteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine", "thirty"};
		System.out.println("There are " + s[(n-10)] + " K-Pop bands touring");
	}
}