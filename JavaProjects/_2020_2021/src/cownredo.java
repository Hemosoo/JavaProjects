import java.io.*;
import java.util.*;
public class cownredo {
	static BufferedReader in;
	static int[] nums = new int[Integer.MAX_VALUE];
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		int ans = N-1;
		ans += (int)(Math.ceil(Math.log(nums[0]+1)/Math.log(2)));
		
		in.close();
	}
}
