import java.util.*;
import java.io.*;
public class lemonade {
	static int array[], n;
	static PrintWriter out;
	static BufferedReader in;
	public static void main(String[] args) throws Exception {
		in = new BufferedReader(new FileReader("lemonade.in"));
		out = new PrintWriter(new File("lemonade.out"));
		init();
		solve();
		in.close();
		out.close();
	}
	public static void init() throws Exception, IOException {
		n = Integer.parseInt(in.readLine());
		array = new int[n];
		StringTokenizer st = new StringTokenizer(in.readLine());
		for(int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(array);
		for (int i = 0; i < array.length / 2; i++) {
		      int temp = array[i];
		      array[i] = array[array.length - 1 - i];
		      array[array.length - 1 - i] = temp;
		    }
	}
	static void solve(){
	    int ans = 0;
	    for(int i = 0; i < array.length; i++){
	      if(i > array[i])
	        break;
	      ans++;
	    }
	    out.println(ans);
	  }
}
