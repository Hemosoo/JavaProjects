import java.util.*;
import java.io.*;
public class prob17 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] s1 = in.next().split(":");
		String[] s2 = in.next().split(":");
		int sec = 3600*Integer.parseInt(s1[0]) + 60*Integer.parseInt(s1[1]) + Integer.parseInt(s1[2]);
		//System.out.println(sec);
		sec = 3600*Integer.parseInt(s2[0]) + 60*Integer.parseInt(s2[1]) + Integer.parseInt(s2[2]) - sec;
		sec+=40;
		//System.out.println(sec);
		double len = 500-sec;
		len = Math.round(len);
		if(len < 0) {
			len = 0;
		}
		int num = (int) Math.floor(len/20);
		System.out.printf("%.2f\n", len/100d);
		for(int j = 0; j < 6; j++) {
			String line = "|";
			for(int i = 0; i < num; i++) {
				if(j == 5) {
					line+=".";
				} else line+=" ";
				
			}
			System.out.println(line + "|");
		}
		if(num > 1) {
			System.out.println("THE FORCE WAS WITH YOU");
		} else if(num == 1) {
			System.out.println("THIS IS SOME RESCUE!");
		} else {
			System.out.println("CURSE MY METAL BODY, I WASN'T FAST ENOUGH!");
		}
	}
		
}
