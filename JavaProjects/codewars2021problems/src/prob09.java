import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class prob09 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input.txt"));
		int bob = in.nextInt();
		double r1 = in.nextDouble();
		double r2 = in.nextDouble();
		double h2 = in.nextDouble();
		double l3 = in.nextDouble();
		double w3 = in.nextDouble();
		double h3 = in.nextDouble();
		double cockpit = (4/3.0) * 3.1415926536 * r1 * r1* r1;
		cockpit -= 6.3;
		double body = h2 * Math.PI * r2 * r2;
		body -= 12.1;
		double pods = (1/3.0) * l3 * w3 * h3 * 2;
		double minions = bob*1.2;
		//System.out.println(minions);
		cockpit = Math.round(cockpit*100)/100d;
		body = Math.round(body*100)/100d;
		pods = Math.round(pods*100)/100d;
		minions = Math.round(minions*100)/100d;
		System.out.println("Cockpit " + String.format("%.2f", cockpit));
		System.out.println("Body " + String.format("%.2f", body));
		System.out.println("Pods " + String.format("%.2f", pods));
		System.out.println("Minions Need " + String.format("%.2f", minions));
		if(cockpit + body + pods >= minions) {
			System.out.println("PLAN ACCEPTED");
		} else System.out.println("PLAN REJECTED");
	}
}