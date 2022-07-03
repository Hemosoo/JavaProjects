import java.util.*;
import java.io.*;
public class cereal {
	static int n;
	static BufferedReader in;
	static PrintWriter out;
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new FileReader("cereal.in"));
		out = new PrintWriter(new File("cereal.out"));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] choices = new int[n][2];
		int[] answers = new int[n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(in.readLine());
			choices[i][0] = Integer.parseInt(st.nextToken());
			choices[i][1] = Integer.parseInt(st.nextToken());
			
		}
		int[] occupy = new int[m+1];
		int count = 0;
		for(int i = n-1; i>=0; i--) {
			int cow = i;
			int type = choices[i][0];
			while(true) {
				if(occupy[type] == 0) {
					
				}
			}
		}
		in.close();
		out.close();
	}
}