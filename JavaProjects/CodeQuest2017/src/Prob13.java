import java.util.*;
import java.io.*;

public class Prob13 {

    static String file = "Prob13";
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
        	double f0 = in.nextDouble();
        	double f1 = in.nextDouble();
        	double f2 = in.nextDouble();
        	int qua = in.nextInt();
        	int high = 10;
        	double low = (1000/90.0)*0.7;
        	double ex = (1000/90.0)*0.85;
        	if(f2 > high) qua= Math.max(1, qua-2);
        	else if(f2 > ex) {
        		double ex1 = f0 + ((3.0-0)/(2-0))*(f2-f0);
        		double ex2 = f1 + ((3.0-1)/(2-1))*(f2-f1);
        		//System.out.println(ex1);
        		//System.out.println(ex2);
        		if(Math.max(ex1, ex2) > high) {
        			qua= Math.max(1, qua-2);
        		} 
        	} else if(f0 < low && f1 < low && f2 < low) {
        		qua = Math.min(qua+1, 10);
        	}
        	
        	
        	out.println(qua);
        	
        }
    }
}