import java.util.*;
import java.io.*;
public class prob12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 0; i < n; i++) {
			int t = in.nextInt();
			int[] te = new int[t];
			for(int j = 0; j < t; j++) {
				te[j] = in.nextInt();
			}
			int s = in.nextInt();
			int[] st = new int[s];
			for(int j = 0; j < s; j++) {
				st[j] = in.nextInt();
			}
			long ans = 0;
			for(int j = 0; j < te.length; j++) {
				for(int k = 0; k < st.length; k++) {
					if(te[j] > st[k]) ans++;
				}
			}
			System.out.println(ans);
		}
	}
}
