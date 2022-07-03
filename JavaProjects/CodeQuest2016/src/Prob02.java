import java.util.*;
import java.io.*;

public class Prob02 {

    static String file = "Prob02";
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
        in.nextLine();
    }
    
    static void solve() throws IOException {
        for(int i = 0; i < n; i++) {
        	String line = in.nextLine();
        	double m = Double.parseDouble(line.substring(1));
        	long c = Math.round((m*100));
        	long q = 0;
        	long d = 0;
        	long n1 = 0;
        	long p = 0;
        	q = c/25;
        	c = c%25;
        	d = c/10;
        	c = c%10;
        	n1 = c/5;
        	c = c%5;
        	p = c;
        	out.println(line);
        	out.println("Quarters=" + q + "\n" + "Dimes=" + d + "\n" + "Nickels=" + n1 + "\n" + "Pennies=" + p);
        }
    }
}