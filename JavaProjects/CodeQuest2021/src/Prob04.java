import java.util.*;
import java.io.*;

public class Prob04 {

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
        	String num = in.next();
        	String type = in.next();
        	String s1 = num.substring(0, 3);
        	String s2 = num.substring(3, 6);
        	String s3 = num.substring(6);
        	if(type.equals("PARENTHESES")) {
        		System.out.println("(" + s1 + ") " + s2 + "-" + s3);
        	} else if(type.equals("DASHES")) {
        		System.out.println(s1 + "-" + s2 + "-" + s3);
        	} else if(type.equals("PERIODS")) {
        		System.out.println(s1 + "." + s2 + "." + s3);
        	}
        }
    }
}