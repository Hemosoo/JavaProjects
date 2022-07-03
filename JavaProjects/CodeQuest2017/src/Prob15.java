import java.util.*;
import java.io.*;

public class Prob15 {

    static String file = "Prob15";
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
        	char[] line = in.nextLine().toCharArray();
        	int[] arr = new int[10];
        	for(int j = 0; j < line.length; j++) {
        		arr[Character.getNumericValue(line[j])]++;
        	}
        	//System.out.println(Arrays.toString(arr));
        	ArrayList<Integer> q = new ArrayList<Integer>();
        	for(int j = 1; j < arr.length; j++) {
        		q.add(arr[j]);
        	}
        	Collections.sort(q);
        	//System.out.println(q);
        	String ans = "";
        	if(q.get(q.size()-1) >= 5) {
        		ans = "FIVE OF A KIND";
        	} else if(q.get(q.size()-1) == 4) {
        		ans = "FOUR OF A KIND";
        	} else if(q.get(q.size()-1) >= 3 && q.get(q.size()-2) >= 2) {
        		ans = "FULL HOUSE";
        	} else if(straight(arr)) {
        		ans = "STRAIGHT";
        	} else if(q.contains(3)) {
        		ans = "THREE OF A KIND";
        	} else if(q.get(q.size()-1) >= 2 && q.get(q.size()-2) >= 2) {
        		ans = "TWO PAIR";
        	} else if(q.get(q.size()-1) == 2) {
        		ans = "PAIR";
        	} else {
        		int max = 0;
        		for(int k = 1; k < arr.length; k++) {
        			if(arr[k] >= 1) max = Math.max(max, k);
        		}
        		ans = max +"";
        	}
        	String temp = "";
        	for(int j = 0; j < line.length; j++) {
        		temp += line[j] + "";
        	}
        	out.println(temp + " = " + ans);
        	//System.out.println(temp + " = " + ans);
        }
    }
    static boolean straight(int[] arr) {
    	boolean w = true;
    	for(int i = 1; i < 6; i++) {
    		w = true;
    		for(int j = i; j < 5+i; j++) {
    			if(!(arr[j] >= 1)) {
    				w = false;
    			}
    		}
    		if(w) return true;
    	}
    	return false;
    }
    
}
/*
11
14912276
99027737
39217860
59977643
58276501
77437751
03999299
12145671
12340076
98764115
11223344
*/