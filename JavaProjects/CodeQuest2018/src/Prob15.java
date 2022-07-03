import java.util.*;
import java.io.*;

public class Prob15 {

    static String file = "Prob15";
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
    
    static void init() {
        
        n = in.nextInt();   
        in.nextLine();
    }
    
    static void solve() throws IOException {
        for(int i = 0; i < n; i++) {
        	String line = in.nextLine();
        	String ans = "";
        	for(int j = 0; j < line.length(); j++) {
        		int c = ((int)line.charAt(j))-64;
        		if(c >= 1 && c <= 5) {
        			c+=6;
        		} else if(c >= 6 && c <= 10) {
        			c = c*c;
        		} else if(c >= 11 && c <= 15) {
        			c = c%3 * 5 + 1;
        		} else if(c >= 16 && c <= 20) {
        			String s = c+"";
        			int temp = 0;
        			for(int k = 0; k < s.length(); k++) {
        				temp += Integer.parseInt(s.charAt(k)+"");
        			}
        			c = temp * 8;
        		} else {
        			int max = 1;
        			for(int k = 2; k < c; k++) {
        				if(c%k == 0) {
        					max = Math.max(k, max);
        				}
        			}
        			c = max*2;
        		}
        		c = ((c-1)%26)+1;
        		ans+=((char)(c+64)) + "";
        	}
        	out.println(ans);
        }
    }
}