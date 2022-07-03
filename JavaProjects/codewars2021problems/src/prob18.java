import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class prob18 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input.txt"));
		String s = in.nextLine();
		int npeople =in.nextInt();
		int rtime = in.nextInt()*60;
		int stime = in.nextInt();
		double power =in.nextDouble();
		int apeople = in.nextInt();
		double ans = 0;
		double rate = 0;
		if(npeople > apeople) {
			ans = 0;
		} else if(rtime <= stime){
			ans = 0;
		} else {
			rate = power/3600;
			
		}
		ans = 1.21 * Math.pow(10, 9);
		if(ans > rate) {
			rate = Math.round(rate*100)/100d;
			System.out.println(s + " can generate " + String.format("%.2f", rate) + " watts/second\nWHOA, HEAVY!");
		} else {
			rate = Math.round(rate*100)/100d;
			System.out.println(s + " can generate " + String.format("%.2f", rate) + " watts/second\nMARTY CAN MAKE IT!");
		}
		
	}
}