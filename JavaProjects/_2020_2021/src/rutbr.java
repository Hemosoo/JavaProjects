import java.util.*;
import java.io.*;
public class rutbr {
	static BufferedReader in;
	static int n;
	static xy nums[];
	static String[] d;
	static int answers[];
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		init();
		solve();
		in.close();
	}
	public static void init() throws IOException {
		n = Integer.parseInt(in.readLine());
		d = new String[n];
		nums = new xy[n];
		answers = new int[n];
		Arrays.fill(answers, Integer.MAX_VALUE);
		StringTokenizer st;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(in.readLine());
			d[i] = st.nextToken();
			nums[i] = new xy(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		/*for(int i = 0; i < n; i++) {
			System.out.println(d[i]);
			System.out.println(nums[i].toString());
		}
		*/
	}
	public static void solve() {
		for(int i = 0; i < n; i++) {
			int ans = 0;
			for(int j = i+1; j < n; j++) {
				if(d[i].equals(d[j])) {
					continue;
				}
				int x = nums[i].x;
				int y = nums[i].y;
				int dx = nums[j].x;
				int dy = nums[j].y;
				int xdif = Math.abs(x - dx);
				int ydif = Math.abs(y - dy);
				
				if(xdif == ydif) {
					continue;
				}
				if(xdif > ydif) {
					if(d[i].equals("E")) {
						if(nums[j].y + xdif > nums[i].y) {
							if(nums[i].x <= nums[j].x) {
								if(xdif < answers[j]) {
									answers[i] = Math.min(xdif, answers[i]);
								}
							}
						}
					} else {
						if(nums[i].y + xdif > nums[j].y) {
							if(nums[i].x >= nums[j].x) {
								if(xdif < answers[i]) {
									answers[j] = Math.min(xdif, answers[j]);
								}
							}
						}
					}
				} else {
					if(d[i].equals("E")) {
						if(nums[j].x + ydif > nums[i].x) {
							if(nums[i].x <= nums[j].x) {
								if(xdif < answers[i]) {
									answers[j] = Math.min(ydif, answers[j]);
								}
							}
						}
					} else {
						if(nums[j].x + ydif > nums[i].x) {
							if(nums[i].x >= nums[j].x) {
								if(xdif < answers[j]) {
									answers[i] = Math.min(ydif, answers[i]);
								}
							}
						}
					}
				}
				//System.out.println(d[i] + " " + nums[i].toString());
				//System.out.println(d[j] + " " + nums[j].toString());
			}
		}
		for(int i = 0; i < n; i++) {
			if(answers[i] == Integer.MAX_VALUE) 
				System.out.println("Infinity");
			 else
				System.out.println(answers[i]);
		}
	}
	static class xy {
		  int x, y;

		  public xy(int a, int b){
		    x = a;
		    y = b;
		  }

		  public String toString(){
		    return x + " " + y;
		  }
	}
}

