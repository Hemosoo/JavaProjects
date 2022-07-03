import java.io.*;
import java.util.*;

public class commonfactor {
	static FastReader s;
	static long n, k;
	static HashSet<Long> a;
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
		long nextint() {
			return Integer.parseInt(next());
		}
		long nextlong() {
			return Long.parseLong(next());
		}
	}
	public static void main(String[] args) throws IOException{
		
		s = new FastReader();
		n = s.nextlong();
		double ans = 0;
		long a1 = 1, a2 = 1;

		for(double k = 2; k <= n; k++) {
			ArrayList<Long> shared_factors = new ArrayList<Long>();
			/*for(long i = 2; i<n+1; i++) {
				for(long j = 2; j<i+1;j++) {
					if(i%j==0) {
						if(j!=i&&j!=1) {
						shared_factors.add(j);
						shared_factors.add(i/j);
						for(long p=0;p<j+1;p++) {				
							
						}
					}
				}
				//stored_fractions[i-2]=(num_common_factors + "/" + i);
				//num_common_factors = 0;
			}
			}*/
			a = new HashSet<Long>();
			shared_factors.add((long)k);
			split(shared_factors);
			//System.out.prlongln(shared_factors);
			for(int i = 0; i < shared_factors.size(); i++) {
				long t =  shared_factors.get(i);
				for(long j = 1; j <= k/t; j++) {
					a.add(j*t);
				}
			}
			//System.out.prlongln(a);
			if(a.size() == 1) {
				
			}
			double temp = a.size()/k;
			if(ans < temp) {
				
				a1 = a.size();
				a2 = (long)k;
			}
			ans = Math.max(ans, temp);
			//System.out.println(a);
			
		}
		
		System.out.println(a1/gcd(a1, a2) + "/" + a2/gcd(a1, a2));
	}
	public static long gcd(long a, long b)
	{
	 if (a == 0)
	 return b;

	 return gcd(b%a, a);
	}
		public static ArrayList<Long> split(ArrayList<Long> a) {
			for(int i = 0; i < a.size(); i++) {
				long t = a.get(i);
				for(long j = 2; j <= t; j++) {
					if(t%j == 0) {
						if(j == t) {
							return a;
						}
						a.add(j);
						a.add(t/j);
						a.remove(a.indexOf(t));
						break;
					}
				}
			}
			
			return split(a);
		}
			
		
}
