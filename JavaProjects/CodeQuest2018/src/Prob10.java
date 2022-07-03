import java.util.*;
import java.io.*;

public class Prob10 {

    static String file = "Prob10";
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
        for(int l = 0; l < n; l++) {
        	String[] s1 = in.nextLine().split(",");
        	String[] s2 = in.nextLine().split(",");
        	String[] s3 = in.nextLine().split(",");
        	boolean[][] b = new boolean[Integer.parseInt(s1[0])][Integer.parseInt(s1[1])];
        	
        }
    }
}