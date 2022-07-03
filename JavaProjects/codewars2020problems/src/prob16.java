import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class prob16 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input.txt"));
		while(in.hasNextLine()) {
			StringTokenizer st = new StringTokenizer(in.nextLine());
			double a = Double.parseDouble(st.nextToken());
			double b = Double.parseDouble(st.nextToken());
			String ac = st.nextToken();
			double supA = Double.parseDouble(st.nextToken());
			double ans = 0;
			if(ac.equals("POWER")) {
				ans = Math.pow(a, b);
				ans = Math.round(ans*10)/10d;
				if(ans == supA) {
					System.out.println(String.format("%.1f", ans) + " is correct for " + String.format("%.1f", a) + " ^ " + String.format("%.1f", b));
				} else {
					System.out.println(String.format("%.1f", a) + " ^ " + String.format("%.1f", b) + " = " + String.format("%.1f", ans) + ", not " + String.format("%.1f", supA));
				}
			} else if(ac.equals("MULTIPLY")) {
				ans = a * b;
				ans = Math.round(ans*10)/10d;
				if(ans == supA) {
					System.out.println(String.format("%.1f", ans) + " is correct for " + String.format("%.1f", a) + " * " + String.format("%.1f", b));
				} else {
					System.out.println(String.format("%.1f", a) + " * " + String.format("%.1f", b) + " = " + String.format("%.1f", ans) + ", not " + String.format("%.1f", supA));
				}
			} else if(ac.equals("DIVIDE")) {
				ans = a/b;
				ans = Math.round(ans*10)/10d;
				if(ans == supA) {
					System.out.println(String.format("%.1f", ans) + " is correct for " + String.format("%.1f", a) + " / " + String.format("%.1f", b));
				} else {
					System.out.println(String.format("%.1f", a) + " / " + String.format("%.1f", b) + " = " + String.format("%.1f", ans) + ", not " + String.format("%.1f", supA));
				}
			} else if(ac.equals("ADD")) {
				ans = a + b;
				ans = Math.round(ans*10)/10d;
				if(ans == supA) {
					System.out.println(String.format("%.1f", ans) + " is correct for " + String.format("%.1f", a) + " + " + String.format("%.1f", b));
				} else {
					System.out.println(String.format("%.1f", a) + " + " + String.format("%.1f", b) + " = " + String.format("%.1f", ans) + ", not " + String.format("%.1f", supA));
				}
			} else if(ac.equals("SUBTRACT")) {
				ans = a-b;
				ans = Math.round(ans*10)/10d;
				if(ans == supA) {
					System.out.println(String.format("%.1f", ans) + " is correct for " + String.format("%.1f", a) + " - " + String.format("%.1f", b));
				} else {
					System.out.println(String.format("%.1f", a) + " - " + String.format("%.1f", b) + " = " + String.format("%.1f", ans) + ", not " + String.format("%.1f", supA));
				}
			}
		}
	}
}