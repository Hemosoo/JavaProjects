import java.util.*;
import java.io.*;
public class fibonacciSeq {
	public static void main(String[] args) {
		System.out.println(fibCypher(3, 7, 'h', "ACSL c2"));
	}
	public static String fibCypher(int num1, int num2, char key, String msg) {
		ArrayList<Integer> seq = new ArrayList<Integer>();
		seq.add(num1);
		seq.add(num2);
		while(seq.size() < 21) {
			seq.add(seq.get(seq.size()-2) + seq.get(seq.size()-1));
		}
		//System.out.println(seq);
		String ans = "";
		for(int i = 0; i < msg.length(); i++) {
			int a = 0;
			if((key + seq.get(i)-96)%26 == 0) {
				a = 122*3 + msg.charAt(i);
			} else {
				a = (((key + seq.get(i%20)-96)%26) + 96)*3 + msg.charAt(i);
			}
			
			ans += a + " ";
			
		}
		return ans;
    }
}
