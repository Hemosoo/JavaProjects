import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class apartments {
	static FastReader s;
	static class FastReader {
		BufferedReader in;
		StringTokenizer st;
		public FastReader() throws IOException {
			in = new BufferedReader(new InputStreamReader(System.in));
			
		}
		String next() { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try { 
                    st = new StringTokenizer(in.readLine()); } 
                catch (IOException  e) { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
		int nextInt() {
			return Integer.parseInt(next());
		}
	}
	public static void main(String[] args) throws IOException {
		int count = 0;
		FastReader s = new FastReader();
		int n = s.nextInt();
		int m = s.nextInt();
		int k = s.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		for(int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}

		for(int i = 0; i < m; i++) {
			b[i] = s.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		//System.out.println(Arrays.toString(a));
		//System.out.println(Arrays.toString(b));
		int i = 0;
		int j = 0;
		while(i < n && j < m) {
			if (a[i]-k <= b[j] && a[i]+k >= b[j]) {
				i++;
				j++;
				count++;
			}
			else if(b[j] < a[i]-k) {
				j++;
			}
			else {
				i++;
			}
		}
		System.out.println(count);
	}
}
