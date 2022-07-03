import java.util.*;
import java.io.*;

public class Prob18 {

    static String file = "Prob18";
    static Scanner in;
    static PrintWriter out;
    
    static int n;
    
    public static void main(String[] args)throws IOException{
        
        //in = new Scanner(new File(file+".in.txt"));
        in = new Scanner(System.in);
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
        	String[] line = in.nextLine().split(" ");
        	String name = "";
        	for(int j = 0; j < line.length; j++) {
        		
        	}
        	
        }
    }
}