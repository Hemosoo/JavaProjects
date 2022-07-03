import java.util.*;
import java.io.*;

public class Prob11 {

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
        	double cnt = 0;
        	int[] let = new int[26];
        	int n1 = in.nextInt();
        	in.nextLine();
        	for(int j = 0; j < n1; j++) {
        		String line = in.nextLine();
        		line = line.toLowerCase();
        		//System.out.println(line);
        		for(int l = 0; l < line.length(); l++) {
        			int ind = ((int)line.charAt(l))-97;
        			if(ind < 0 || ind >= 26) {
        				continue;
        			}
        			let[ind]++;
        			cnt++;
        		}
        	}
        	double[] ans = new double[26];
        	for(int j = 0; j < 26; j++) {
        		ans[j]= (Math.round(((let[j]/cnt)*100)*100)/100d);
        	}
        	for(int j = 0; j < 26; j++) {
        		System.out.println(((char)(j + 65)) + ": " + String.format("%.2f", ans[j]) + "%");
        	}
        }
    }
}