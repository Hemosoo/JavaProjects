import java.util.*;
import java.io.*;
public class prob07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<String> eggs= new ArrayList<String>();
		in.nextLine(); 
		int[] egg = new int[3];
		for(int i = 0; i < n; i++) {
			String name = in.next();
			String ser = in.next();
			if(ser.equals("T1138")) {
				egg[2]++;
			} else if(ser.equals("AIMLESS")){
				egg[0]++;
			} else {
				if(eggs.contains(ser)) {
					egg[1]++;
				}
				eggs.add(ser);
			}
			
		}
		System.out.println("Need Egg: " + egg[0]);
		System.out.println("Duplicated Eggs: " + egg[1]);
		System.out.println("Lost Egg: " + egg[2]);
	}
}
