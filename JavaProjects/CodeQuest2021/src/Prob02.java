import java.util.*;
import java.io.*;

public class Prob02 {

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
        	String[] a = in.nextLine().split(" ");
        	int[] b = new int[a.length];
        	for(int j = 0; j < a.length; j++) {
        		b[j] = Integer.parseInt(a[j]);
        	}
        	Arrays.sort(b);
        	System.out.println(b[b.length-1]);
        }
    }
}