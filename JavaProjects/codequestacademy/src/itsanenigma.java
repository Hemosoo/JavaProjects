import java.util.*;
import java.io.*;
public class itsanenigma {
	static int rotors[][][], reflector[], T;
	static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		init();
	}
	static void init() {
        rotors = new int[][][]{
                {{1, 3, 6, 0, 5, 4, 8, 7, 9, 2}, {3, 0, 9, 1, 5, 4, 2, 7, 6, 8}}, 
                {{0, 3, 5, 2, 6, 9, 1, 4, 8, 7}, {0, 6, 3, 1, 7, 2, 4, 9, 8, 5}}, 
                {{5, 9, 1, 7, 3, 8, 0, 2, 4, 6}, {6, 2, 7, 4, 8, 0, 9, 3, 5, 1}}, 
                {{1, 6, 5, 2, 9, 0, 7, 4, 3, 8}, {5, 0, 3, 8, 7, 2, 1, 6, 9, 4}}
                };
        
        reflector = new int[]{3, 5, 6, -3, 1, -1, -5, 2, -6, -2};
        
        T = in.nextInt();
        
        while (T-- > 0) solve();
}
	public static void solve() {
		int[] r = new int[3];
		int[] s = new int[3];
		
		for(int i = 0; i < 3; i++) {
			r[i] = in.nextInt();
			s[i] = in.nextInt();
			
		}
		int[] cur = new int[3];
		for(int i = 0; i < 3; i++) {
			cur[i] = s[i];
			
		}
		int shift = 2;
		
		String enc = in.next();
		for(int k = 0; k < enc.length(); k++) {
			int num = Integer.parseInt(enc.charAt(k)+"");
			
			int prev = num;
			System.out.println("sh: "+cur[shift]);
			for(int i = 0; i < 3; i++) {
				if(shift == i) {
					int temp = prev+(10-cur[shift])%10;
					if(temp>9) {
						temp = temp%10;
					} 
					prev = rotors[r[i]-1][0][temp] - (10-cur[shift])%10;
					if(prev < 0) {
						prev = 10+prev;
					} else if(prev>9) {
						prev = prev%10;
					}
				} else {
					prev = rotors[r[i]-1][0][prev];
				}
				
			}
			
			
			
			prev += reflector[prev];
			for(int i = 2; i >= 0; i--) {
				if(shift == i) {
					int temp = prev+(10-cur[shift])%10;
					if(temp>9) {
						temp = temp%10;
					} 
					prev = rotors[r[i]-1][1][temp] - (10-cur[shift])%10;
					if(prev < 0) {
						prev = 10+prev;
					} else if(prev>9) {
						prev = prev%10;
					}
				} else {
					prev = rotors[r[i]-1][1][prev];
				}
			}
			
			cur[shift]--;
			if(cur[shift] == -1) {
				cur[shift]=9;
			}
			if(cur[shift] == s[shift]) {
				shift--;
				
			}
			System.out.println(prev);
		}
		
		
	}
}
/*
1
1 0
2 0
3 0
1234567890
 */
