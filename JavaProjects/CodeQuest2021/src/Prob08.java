import java.util.*;
import java.io.*;

public class Prob08 {

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
        	int m = in.nextInt();
        	int n = in.nextInt();
        	int[][] mat = new int[m][n];
        	for(int j = 0; j < m; j++) {
        		for(int l = 0; l < n; l++) {
        			mat[j][l] = in.nextInt();
        		}
        	}
        	double sum = 0;
        	for(int j = 0; j < m; j++) {
        		for(int l = 0; l < n; l++) {
        			mat[j][l] = Math.abs(mat[j][l]);
        			mat[j][l] = (int) Math.pow(mat[j][l], 2);
        			
        		}
        	}
        	for(int j = 0; j < m; j++) {
        		for(int l = 0; l < n; l++) {
        			sum+=mat[j][l];
        		}
        	}
        	sum = Math.sqrt(sum);
        	sum = Math.round(sum*100)/100d;
        	System.out.println(String.format("%.2f", sum));
        	
        }
    }
}