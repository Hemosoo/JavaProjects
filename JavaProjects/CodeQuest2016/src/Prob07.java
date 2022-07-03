import java.util.*;
import java.io.*;

public class Prob07 {

    static String file = "Prob07";
    static Scanner in;
    static PrintWriter out;
    
    static int n;
    
    public static void main(String[] args)throws IOException{
        
        in = new Scanner(new File(file+".in.txt"));
        out = new PrintWriter(new File("out.txt"));
        
        init();
        solve();
        
        

        in.close();
        out.close();
        Check.check(file+".out.txt");
    }
    
    static void init() {
        
        n = in.nextInt();   
    }
    
    static void solve() throws IOException {
        for(int i = 0; i < n; i++) {
        	int m = in.nextInt();
        	in.nextLine();
        	String[] lines = new String[m];
        	for(int j = 0; j < m; j++) {
        		lines[j] = in.nextLine();
        	}
        	String[] coord = in.nextLine().split(",");
        	int sec = in.nextInt();
        	in.nextLine();
        	String[] secretLines = new String[sec];
        	for(int j = 0; j < sec; j++) {
        		secretLines[j] = in.nextLine();
        	}
        	int x1, y1;
        	x1 = Integer.parseInt(coord[0]);
        	y1 = Integer.parseInt(coord[1]);
        	String ans = "";
        	for(int j = 0; j < sec; j++) {
        		for(int l = 0; l < secretLines[j].length(); l++) {
        			if(secretLines[j].charAt(l) == 'O') {
        				ans += lines[j+x1].charAt(l+y1) + "";
        			}
        		}
        	}
        	out.println(ans);
        }
    }
}