import java.util.*;
import java.io.*;
public class wordredo {
	static int n, k;
	static String[] arr;
	static class FastReader {
		BufferedReader in;
		StringTokenizer st;
		public FastReader() throws IOException {
			in = new BufferedReader(new FileReader("word.in"));
			
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
		FastReader s = new FastReader();
		PrintWriter o = new PrintWriter(new File("word.out"));
		n = s.nextInt();
		k = s.nextInt();
		arr = new String[n];
		for(int i = 0; i < n; i++) {
			arr[i] = s.next();
		}
		//System.out.println(n);
		//System.out.println(k);
		//System.out.println(Arrays.toString(arr));
		String essay = "";
		int length = arr[0].length();
		essay += arr[0];
		for(int i = 1; i < n; i++) {
			length += arr[i].length();
			if(length <= k) {
				essay += " " + arr[i];
			} else {
				essay += "\n" + arr[i];
				length = arr[i].length();
			}
		}
		o.print(essay);
		o.close();
	}
}
