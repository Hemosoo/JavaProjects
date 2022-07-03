import java.util.*;
import java.io.*;

public class Prob14 {

    static Scanner in;
    static PrintWriter out;
    
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
        	String s1 = in.nextLine();
        	String[] shift = in.nextLine().split(" ");
        	String[] dir = in.nextLine().split(" ");
        	int scyc = 0;
        	int dcyc = 0;
        	String ans = "";
        	s1 = s1.toLowerCase();
        	for(int j = 0; j < s1.length(); j++) {
        		
        		int ind = ((int)s1.charAt(j));
        		if(ind < 97 || ind > 122) {
        			ans+=s1.charAt(j);
        			continue;
        		}
        		int d = 0;
        		if(dir[dcyc].equals("1")) {
        			d = Integer.parseInt(shift[scyc])*-1;
        		} else {
        			d = Integer.parseInt(shift[scyc]);
        		}
        		scyc++;
        		dcyc++;
        		if(dcyc >= dir.length) {
        			dcyc = 0;
        		}
        		if(scyc >= shift.length) {
        			scyc = 0;
        		}
        		ind += d;
        		if(ind < 97) {
        			ind = 123 - (97-ind);
        			
        		} else if(ind > 122) {
        			ind = ind-123 + 97;
        		}
        		ans+=((char)ind) + "";
        		
        	}
        	System.out.println(ans);
        	
        }
    }
}