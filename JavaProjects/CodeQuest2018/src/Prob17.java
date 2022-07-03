import java.io.*;
import java.util.*;

public class Prob17 {

    static String file = "Prob17";
    static Scanner in;
    static PrintWriter out;
    static String win;
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
        for(int k = 0; k < n; k++) {
        	win = "";
        	String[][] board = new String[3][3];
        	String s = in.nextLine();
        	int t = 0;
        	for(int i = 0; i < s.length(); i++) {
        		t = (i);
        		board[t/3][(t)%3] = s.charAt(i) + "";
        	}
        	//System.out.println(Arrays.deepToString(board));
        	row(board);
        	col(board);
        	diag(board);
        	if(!win.equals("")) {
        		out.println(s + " = " + win + " WINS");
        		//System.out.println(win);
        	} else {
        		out.println(s + " = TIE");
        	}
        }
    }
    static void row(String[][] b) {
    	for(int i = 0; i < 3; i++) {
    		String prev = b[i][0];
    		int cnt = 0;
    		for(int j = 1; j < 3; j++) {
    			if(prev.equals("-")) break;
    			if(prev.equals(b[i][j])) {
    				prev = b[i][j];
    				cnt++;
    			}
    		}
    		if(cnt == 2) {
    			win = prev;
    			
    		}
    	}
    }
    static void col(String[][] b) {
    	for(int i = 0; i < 3; i++) {
    		String prev = b[0][i];
    		int cnt = 0;
    		for(int j = 1; j < 3; j++) {
    			if(prev.equals("-")) break;
    			if(prev.equals(b[j][i])) {
    				prev = b[j][i];
    				cnt++;
    			}
    		}
    		if(cnt == 2) {
    			win = prev;
    			
    		}
    	}
    }
    static void diag(String[][] b) {
    	String prev = b[0][0];
    	int cnt= 0;
    	for(int i = 1; i < 3; i++) {
    		if(prev.equals("-")) break;
    		if(prev.equals(b[i][i])) {
    			cnt++;
    			prev = b[i][i];
    		}
    	}
    	if(cnt == 2) {
			win = prev;
			return;
		}
    	prev = b[2][0];
    	cnt = 0;
    	for(int i = 1; i < 3; i++) {
    		if(prev.equals("-")) break;
    		if(prev.equals(b[2-i][i])) {
    			cnt++;
    			prev = b[2-i][i];
    		}
    	}
    	if(cnt == 2) {
			win = prev;
			return;
		}
    }
    
}