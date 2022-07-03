import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class prob06 {
	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(new File("input.txt"));
		while(in.hasNextLine()) {
			String ans = "";
			String s = in.nextLine();
			char[] c1 = s.toCharArray();
			String[] c = new String[4];
			for(int i = s.length()-1; i >= 0 ; i--) {
				c[4-s.length()+i] = String.valueOf(c1[i]);
			}
			for(int i = 0; i < c.length ; i++) {
				if(c[i] == null) continue;
				int a = Integer.parseInt(c[i]);
				if(i == 3) {
					if(a < 4) {
						for(int j = 0; j < a; j++) {
							ans+= "B";
						}
					}
					else if(a == 4) {
						ans += "BW";
					} else if(a == 9) {
						ans+="BK";
					}
						else {
					
						ans += "W";
						for(int j = 1; j <= a-5; j++) {
							ans += "B";
						}
					}
				} else if(i == 2) {
					if(a < 4) {
						for(int j = 0; j < a; j++) {
							ans+= "Z";
						}
					}
					else if(a == 4) {
						ans += "ZP";
					} else if(a == 9) {
						ans+="ZB";
					}else {
						ans += "P";
						for(int j = 1; j <= a-5; j++) {
							ans += "Z";
						}
					}
				} else if(i == 1) {
					if(a < 4) {
						for(int j = 0; j < a; j++) {
							ans+= "B";
						}
					}
					else if(a == 4) {
						ans += "BG";
					} else if(a == 9) {
						ans+="BR";
					} else {
						ans += "G";
						for(int j = 1; j <= a-5; j++) {
							ans += "B";
						}
					}
				} else if(i == 0) {
					ans += "R";
				}
			}
			System.out.println(ans);
		}
	}
	
}
