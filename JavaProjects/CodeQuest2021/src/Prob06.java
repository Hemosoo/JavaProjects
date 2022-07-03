import java.util.*;
import java.io.*;

public class Prob06 {

    static Scanner in;
    
    static int n;
    
    public static void main(String[] args)throws IOException{
        
        in = new Scanner(System.in);
        
        init();
        solve();
        
        

        in.close();
    }
    
    static void init() {
        
        n = in.nextInt();
        in.nextLine();
    }
    
    static void solve() throws IOException {
        for(int i = 0; i < n; i++) {
        	String s = in.nextLine();
        	char[] c = s.toCharArray();
        	int ans = 0;
        	for(char c1:c) {
        		ans += ((int)c1)-96;
        	}
        	System.out.println(ans);
        }
    }
}