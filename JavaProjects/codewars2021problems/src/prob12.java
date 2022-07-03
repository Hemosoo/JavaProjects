import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class prob12 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input.txt"));
		String item = in.next();
		//System.out.println(item);
		double n = in.nextDouble();
		String dtype = in.next();
		in.next();
		String ttype = in.next();
		if(ttype.equals("HOUR")) {
			n = n/3600;
		} else if(ttype.equals("MINUTE")) {
			n = n/60;
		}
		if(dtype.equals("MILES")) n = (n*5280)/3.28;
		else if(dtype.equals("KILOMETERS")) n = n*1000;
		else if(dtype.equals("YARDS")) n = (n*3)/3.28;
		else if(dtype.equals("FEET")) n = n/3.28;
		else if(dtype.equals("INCHES")) n = n/(3.28*12);
		else if(dtype.equals("CENTIMETERS")) n = n/(100);
		double ans = 0;
		ans = Math.pow(n, 2);
		ans = ans/(2*9.805);
		//System.out.println(ans);
		ans = Math.round(ans*100)/100d;
		String status = "";
		if(ans >= 25 && ans <= 50) {
			status = "SUCCESS!";
		} else if(ans < 25) {
			status = "SPLAT!";
		} else {
			status = "OUCH!";
		}
		
		System.out.println(item + " will launch the messenger " + String.format("%.2f", ans) + " meters high, " + status);
	}
}