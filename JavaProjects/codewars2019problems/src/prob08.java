import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class prob08 {
	static int[] alph;
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input.txt"));
		String[] nums = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX",
				"SEVEN", "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE"};
		alph = new int[26];
		HashSet<String> h = new HashSet<String>();
		String ans = "";
		while(true) {
			
			int a = in.nextInt();
			
			if(a == 999) {
				ans = ans.substring(0, ans.length()-1);
				ans += ". ";
				break;
			}
			ans += a + " ";
			h.add(nums[a]);
		}
		for(String i:h) {
			aCount(i);
			
		}
		
		for(int i = 0; i < alph.length; i++) {
			for(int j = 0; j < alph[i]; j++) {
				ans += ((char)(i+65)) + " ";
			}
		} System.out.println(ans.substring(0, ans.length()-1));
	}
	public static void aCount(String s) {
		int[] alph2 = new int[26];
		for(int i = 0; i < s.length(); i++) {
			int j = s.charAt(i) - 65;
			alph2[j]++;
		}
		for(int  i = 0; i < alph2.length; i++) {
			alph[i] = Math.max(alph2[i], alph[i]);
		}
	}
}