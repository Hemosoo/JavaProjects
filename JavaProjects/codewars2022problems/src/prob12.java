import java.util.*;
import java.io.*;
public class prob12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] need = new int[n];
		double[] have = new double[n];
		double[] ans = new double[n];
		for(int i = 0; i < n; i++) {
			need[i] = in.nextInt();
		}
		for(int i = 0; i < n; i++) {
			have[i] = in.nextInt();
		}
		double max = 0;
		for(int i = 0; i < n; i++) {
			ans[i] = have[i]/need[i];
			max = Math.max(ans[i], max);
		}
		if(max != (int)max) {
			max = Math.floor(max)+1;
		}
		//System.out.println(max);
		for(int i = 0; i < n; i++) {
			ans[i] = need[i] * max - have[i];
		}
		String answer = "";
		for(int i = 0; i < n; i++) {
			answer+=(int)ans[i] + " ";
		}
		System.out.println(answer.substring(0, answer.length()-1));
	}
}
