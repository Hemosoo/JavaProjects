import java.util.*;
import java.io.*;

public class Prob16 {

    static Scanner in;
    
    static int n;
    static String[] ans;
    
    public static void main(String[] args)throws IOException{
        
        in = new Scanner(System.in);
        
        init();
        solve();
        for(int i = 0; i < ans.length; i++) {
        	System.out.println(ans[i]);
        }
        
        in.close();
    }
    
    static void init() throws IOException {
        
        n = in.nextInt();  
        in.nextLine();
        ans = new String[n];
        
    }
    
    static void solve() {
    	for(int i = 0; i < n; i++) {

        	String[] temp1 = in.nextLine().split(" ");
        	String[] temp2 = in.nextLine().split(" ");
        	
        	HashMap<Integer, Integer> dict = new HashMap<Integer, Integer>();
	    	
	    	for(int k = 0; k < temp1.length; k++) {
	    		for(int j = 0; j < temp2.length; j++) {
	    			if(temp1[k].equals("0") || temp2[j].equals("0")) {
	    				continue;
	    			}
	    			else {
	    				
	    				if(dict.containsKey(k+j)) {
	    					dict.put(k+j, dict.get(k+j) + Integer.parseInt(temp1[k])*Integer.parseInt(temp2[j]));
	    				}
	    				else {
		    				dict.put(k+j, Integer.parseInt(temp1[k])*Integer.parseInt(temp2[j]));
	    				}
	    				
	    			}
	    			
	    		}
	    	}
	    	String str = "";
	    	for(int key : dict.keySet()) {
	    		if(key == 0) {
	    			if(dict.get(key) < 0 && !str.equals("")) {
	    				str = str.substring(0, str.length()-1);
	    				str += dict.get(key) + "+";
	    			}
	    			else str += dict.get(key) + "+";
	    		}
	    		else if(key <= 1) {
	    			if(dict.get(key) < 0 && !str.equals("")) {
	    				str = str.substring(0, str.length()-1);
	    				str += dict.get(key) + "x" + "+";
	    			}
	    			else str += dict.get(key) + "x" + "+"; 
	    		}
	    		else {
	    			if(dict.get(key) < 0 && !str.equals("")) {
	    				str = str.substring(0, str.length()-1);
	    				str += dict.get(key) + "x^" + key + "+";
	    			}
	    			else str += dict.get(key) + "x^" + key + "+"; 
	    		}
	    	}
	    	str = str.substring(0, str.length()-1);
	    	
	    	ans[i] = str;
	    	
	        
    	}
    	
    }
}