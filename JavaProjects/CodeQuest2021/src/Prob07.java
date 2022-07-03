import java.util.*;
import java.io.*;

public class Prob07 {

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
        	double a = (double)in.nextInt();
        	double b = in.nextInt();
        	double c = in.nextInt();
        	double d = in.nextInt();
        	double f1 = in.nextInt();
        	double f2 = in.nextInt();
        	double a2 = d/((a*d)-(b*c));
        	double b2 = -b/((a*d)-(b*c));
        	double c2 = -c/((a*d) - (b*c));
        	double d2 = a/((a*d-b*c));
        	double e1 = f1*a2 + f2*c2;
        	double e2 = f1*b2 + f2*d2;
        	System.out.println(Math.round(e1) + " " + Math.round(e2));
        }
    }
}