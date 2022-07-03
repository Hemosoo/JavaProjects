import java.util.*;
import java.io.*;

public class Prob01 {

    static String file = "Prob01";
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
        	int n1 = in.nextInt();
        	for(int j = 0; j < n1; j++) {
        		String line = "";
        		for(int l = 0; l < n1; l++) {
        			line+="# ";
        		}
        		out.println(line.substring(0, line.length()-1));
        	}
        }
    }
}