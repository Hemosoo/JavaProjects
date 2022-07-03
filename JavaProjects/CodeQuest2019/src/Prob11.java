import java.util.*;
import java.io.*;

public class Prob11 {

    static String file = "Prob11";
    static Scanner in;
    static PrintWriter out;
    
    static int n;
    
    public static void main(String[] args)throws IOException{
        
        in = new Scanner(new File(file+".in.txt"));
        //in = new Scanner(System.in);
        out = new PrintWriter(new File("out.txt"));
        
        init();
        solve();
        
        

        in.close();
        out.close();
        Check.check(file+".out.txt");
    }
    
    public static void init() {
		n = in.nextInt();
	}
	public static void solve() {
		for(int i = 0; i < n; i++) {
			int c = in.nextInt();
			for(int j = 0; j < Math.pow(2, c); j++) {
				String bin = Integer.toBinaryString(j);
				while(bin.length() < c) {
					bin = "0" + bin;
				}
				out.println(bin);
			}
		}
	}
}