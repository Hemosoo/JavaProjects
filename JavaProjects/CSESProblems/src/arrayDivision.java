import java.util.*;
import java.io.*;
public class arrayDivision {
	static int n, k, nums[];
	static long T;
	static class FastReader {
		BufferedReader in;
		StringTokenizer st;
		public FastReader() {
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
	public static void main(String[] args) {
		FastReader s = new FastReader();
		n = s.nextInt();
		k = s.nextInt();
		nums = new int[n];
		for(int i = 0; i < n; i++) {
			nums[i] = s.nextInt();
			T+=nums[i];
		}
		long low = 0;
		long high = T;
		long ans = 0;
		long mid =0;
		//System.out.println(low);
		//System.out.println(Arrays.toString(nums));
		while(low <= high) {
			mid = (low+high)/2;
			if(check(mid)) {
				ans = mid;
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		System.out.println(ans);
	}
	public static boolean check(long a) {
		int g = 0;
		long s = 0;
		for(int i = 0; i < n; i++) {
			if(nums[i] > a) return false;
			if(s+nums[i] > a) {
				g++;
				s = 0;
			}
			s+=nums[i];
		}
		if(s>0) g++;
		return g <= k;
	}
}
/*
5 3
2 4 7 3 5 
 
 */
