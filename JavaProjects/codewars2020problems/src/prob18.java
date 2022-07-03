import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class prob18 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input.txt"));
		while(in.hasNextLine()) {
			String s = in.nextLine();
			String[] nums = s.split(":");
			int h = Integer.parseInt(nums[0]);
			int m = Integer.parseInt(nums[1]);
			double d1 = (h*30) + m*0.5;
			double d2 = m*6;
			double ans = Math.max(d1, d2) - Math.min(d1, d2);
			while(ans >= 360) {
				ans-=360;
			} 
			if(ans >= 180) {
				ans = 360 - ans;
			}
			System.out.println("The angle between the Hour hand and Minute hand is " + String.format("%.2f", ans) + " degrees.");
		}
	}
}