import java.util.*;
import java.io.*;

public class Prob09 {

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
        	double amt = in.nextDouble();
        	int amount = (int) (amt*100);
        	int[] nums = {10000, 5000, 2000, 1000, 500, 200, 100, 25, 10, 5, 1};
        	int[] ans = new int[nums.length];
        	for(int j = 0; j < 10; j++) {
        		ans[j] = (amount/nums[j]);
        		amount= amount%nums[j];
        			
        		
        	}
        	ans[10] = amount;
        	for(int j = 0; j < 11; j++) {
        		System.out.print(ans[j]);
        	}
        	System.out.println();
        }
    }
}