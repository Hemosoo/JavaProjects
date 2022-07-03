import java.util.*;
import java.io.*;

public class Prob05 {

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
    }
    
    static void solve() throws IOException {
        for(int i = 0; i < n; i++) {
        	int n1 = in.nextInt();
        	pair[] a = new pair[n1];
        	double[] ans = new double[n1];
        	double[] check= new double[n1];
        	pair[] b = new pair[n1];
        	//TreeMap<pair, Double> a = new TreeMap<pair, Double>();
        	for(int j = 0; j < n1; j++) {
        		int i1 = in.nextInt();
        		int i2 = in.nextInt();
        		a[j] = new pair(i1, i2);
        		ans[j] = Math.sqrt(Math.pow(i1, 2) + Math.pow(i2, 2));
        	}
        	for(int j = 0; j < n1; j++) {
        		check[j] = ans[j];
        	}
        	Arrays.sort(check);
        	for(int j = 0; j < n1; j++) {
        		double t = check[j];
        		for(int  l = 0; l < n1; l++) {
        			if(ans[l] == t) {
        				b[j] = a[l];
        			}
        		}
        	}
        	for(int j = 0; j < n1; j++) {
        		System.out.print(b[j].toString() + "\n");
        	}
        }
    }
    	public static class pair {
    		int a, b;
    		public pair(int x, int y) {
    			a = x;
    			b = y;
    		}
    		public String toString() {
    			return a + " " + b;
    		}
    	}
    }

