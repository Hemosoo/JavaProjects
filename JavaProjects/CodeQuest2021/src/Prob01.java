import java.util.*;
import java.io.*;

public class Prob01 {

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
    }
    
    static void solve() throws IOException {
        for(int i = 0; i < n; i++) {
        	int n1 = in.nextInt();
        	if(n1%2 ==0) {
        		System.out.println("EVEN");
        	} else {
        		System.out.println("ODD");
        	}
        }
    }
}