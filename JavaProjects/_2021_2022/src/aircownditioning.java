import java.io.*;
import java.util.*;
public class aircownditioning {
	static int N, dif[], nums[], ans;
	static ArrayList<Integer> neg, pos;
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
		long nextLong() {
			return Long.parseLong(next());
		}
	}
	public static void main(String[] args) throws IOException {
		s = new FastReader();
		init();
	}
	public static void init() {
		N = s.nextInt();
		dif = new int[N];
		pos = new ArrayList<Integer>();
		neg = new ArrayList<Integer>();
		nums = new int[N];
		for(int i = 0; i < N; i++) {
			nums[i] = s.nextInt();
		}
		for(int i = 0; i < N; i++) {
			int t = nums[i]-s.nextInt();
			dif[i]=t;
			if(t < 0) {
				neg.add(t);
				pos.add(0);
			}
				
			else if(t>0) {
				pos.add(t);
				neg.add(0);
			} else {
				pos.add(0);
				neg.add(0);
			}
				
			
		}
		posf(pos);
		negf(neg);
		System.out.println(ans);
	}
	public static void posf(ArrayList<Integer> pos) {
		if(pos.size() == 0) return;
		int min = Collections.min(pos);
		ans+=min;
		for(int i = 0; i < pos.size(); i++) {
			pos.set(i, pos.get(i)-min);
		}
		ArrayList<Integer> temp = new ArrayList<Integer>();
		boolean flag = false;
		
		for(int i = 0; i < pos.size(); i++) {
			if(pos.get(i) == 0 && flag) {
				posf(temp);
				flag = false;
				temp = new ArrayList<Integer>();
			}
			if(pos.get(i)!=0) {
				temp.add(pos.get(i));
				flag = true;
			}
		}
		posf(temp);
	}
	public static void negf(ArrayList<Integer> pos) {
		if(pos.size() == 0) return;
		int max = Collections.max(pos);
		ans+=Math.abs(max);
		for(int i = 0; i < pos.size(); i++) {
			pos.set(i, pos.get(i)-max);
		}
		ArrayList<Integer> temp = new ArrayList<Integer>();
		boolean flag = false;
		
		for(int i = 0; i < pos.size(); i++) {
			if(pos.get(i) == 0 && flag) {
				negf(temp);
				flag = false;
				temp = new ArrayList<Integer>();
			}
			if(pos.get(i)!=0) {
				temp.add(pos.get(i));
				flag = true;
			}
		}
		negf(temp);
	}
}
