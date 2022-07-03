import java.util.*;
import java.io.*;

public class Prob04 {

    static String file = "Prob04";
    static Scanner in;
    static PrintWriter out;
    
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
        for(int i = 0; i < n; i++) {
        	String line = in.nextLine();
        	String s1 = "";
        	String s2 = "";
        	for(int j = 0; j < line.length(); j++) {
        		if(line.charAt(j) == '|') {
        			s1 = line.substring(0, j);
        			s2 = line.substring(j+1);
        			break;
        		}
        	}
        	if(s1.length() != s2.length() || s1.equals(s2)) {
        		out.println(line + " = NOT AN ANAGRAM");
        		continue;
        	}
        	char[] c1 = s1.toCharArray();
        	char[] c2 = s2.toCharArray();
        	Arrays.sort(c1);
        	Arrays.sort(c2);
        	boolean not = false;
        	for(int j = 0; j < c1.length; j++) {
        		if(c1[j] != c2[j]) {
        			out.println(line + " = NOT AN ANAGRAM");
        			not = true;
        			break;
        		}
        	}
        	if(!not) {
        		out.println(line + " = ANAGRAM");
        	}
        }
    }
}