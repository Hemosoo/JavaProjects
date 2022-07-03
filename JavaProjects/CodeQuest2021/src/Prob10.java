import java.util.*;
import java.io.*;

public class Prob10 {

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
        	String line = in.nextLine();
        	StringTokenizer st =new StringTokenizer(line);
        	String type = st.nextToken();
        	String ans = "";
        	if(type.equals("concatenate")) {
        		while(st.hasMoreTokens()) {
        			ans += st.nextToken() + ",";
        		}
        		System.out.println(ans.substring(0, ans.length()-1));
        	} else if(type.equals("formatHeight")) {
        		ans+=st.nextToken() +"\'" + st.nextToken() + "\"";
        		System.out.println(ans);
        	} else if(type.equals("formatDate")) {
        		int year = Integer.parseInt(st.nextToken());
        		int month = Integer.parseInt(st.nextToken());
        		int day = Integer.parseInt(st.nextToken());
        		System.out.println(String.format("%04d", year) + String.format("%02d", month) + String.format("%02d", day));
        	}
        	
        	
        }
    }
}