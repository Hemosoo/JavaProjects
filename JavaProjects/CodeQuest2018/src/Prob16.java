import java.util.*;
import java.io.*;

public class Prob16 {

    static String file = "Prob16";
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
        	int x = in.nextInt();
        	int y = in.nextInt();
        	int p = in.nextInt();
        	int r1 = in.nextInt();
        	int r2 = in.nextInt();
        	double rad = Math.PI/2;
        	for(int j = 0; j < p*2; j++) {
        		double a = 0;
        		double b = 0;
        		if(j%2 == 0) {
        			a = (r1*Math.cos(rad)) + x;
        			b = (r1*Math.sin(rad)) + y;
        		} else {
        			a = (r2*Math.cos(rad)) + x;
        			b = (r2*Math.sin(rad)) + y;
        		}
        		rad += (Math.PI*2.0)/(p*2.0);
        		if(rad >= Math.PI*2.0) {
        			rad = rad-Math.PI*2.0;
        		}
        		if(j == p*2 - 1) {
        			out.printf("%.2f,%.2f", Math.round(a*100)/100d, Math.round(b*100)/100d);
        			break;
        		}
        		out.printf("%.2f,%.2f ", Math.round(a*100)/100d, Math.round(b*100)/100d);
        		//System.out.println();
        	}
        	out.println();
        }
        //out.println();
    }
}