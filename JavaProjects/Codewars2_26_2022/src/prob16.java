import java.util.*;
import java.io.*;
public class prob16 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] type = {"B", "K", "M", "G", "T", "P", "E", "Z"};
		List<String> p = new ArrayList<>(Arrays.asList(type));
		double n = in.nextInt();
		String unit = in.next();
		int index = 0;
		
		
		double ans = 0;
		for(int i = 0; i < type.length; i++) {
			if(type[i].equals(unit.charAt(0)+"")) {
				if(n == 1) {
					ans = Math.pow((1000.0/1024), i-1) * n;
				} else if(n > 1000) {
					ans = Math.pow((1000.0/1024), i+1) * n;
				}
				else {
					ans = Math.pow((1000.0/1024), i) * n;
				}
				index = i;
			}
		}
		if(ans < 1.024) {
			System.out.printf("%.2f " + type[index-1]+"iB", Math.round(ans*1000*100)/100d);
		} else if(ans > 1024) {
			System.out.printf("%.2f " + type[index+1]+"iB", Math.round((ans/1000)*100)/100d);
		}
		
		else {
			System.out.printf("%.2f " + type[index]+"iB", Math.round(ans*100)/100d);
		}
		
	}
}
