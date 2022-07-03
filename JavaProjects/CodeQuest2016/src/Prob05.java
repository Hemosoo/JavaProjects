import java.util.*;
import java.io.*;
import java.math.BigDecimal;

public class Prob05 {

    static String file = "Prob05";
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
        	double fift = m*0.15*100;
        	double eight = m*0.18*100;
        	double twenty = m*0.2*100;
        	fift = Math.round(fift)/100d;
        	eight = Math.round(eight)/100d;
        	twenty = Math.round(twenty)/100d;
        	out.println("Total of the bill: " + line);
        	out.println("15% = $" + String.format("%.2f", fift));
        	out.println("18% = $" + String.format("%.2f", eight));
        	out.println("20% = $" + String.format("%.2f", twenty));
        }
    }
}