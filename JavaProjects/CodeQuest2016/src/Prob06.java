import java.util.*;
import java.io.*;

public class Prob06 {

    static String file = "Prob06";
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
        	String school = in.nextLine();
        	int n1 = in.nextInt();
        	in.nextLine();
        	String pname = "";
        	double max = 0;
        	for(int j = 0; j < n1; j++) {
        		double gpa = 0;
        		int tot = 0;
        		String line = in.nextLine();
        		int grade = 0;
        		double hrs = 0;
        		String sname = "";
        		String[] val = null;
        		for(int l = 0; l < line.length(); l++) {
        			if(line.charAt(l) == ':') {
        				sname = line.substring(0, l);
        				val = line.substring(l+1).split(",");
        				break;
        			}
        		}
        		for(int l = 0; l < val.length; l++) {
        			//System.out.println(val[l]);
        			if(val[l].substring(0, 1).equals("A")) {
        				grade = 4;
        			} else if(val[l].substring(0, 1).equals("B")) {
        				grade = 3;
        			} else if(val[l].substring(0, 1).equals("C")) {
        				grade = 2;
        			} else if(val[l].substring(0, 1).equals("D")) {
        				grade = 1;
        			}
        			hrs = Integer.parseInt(val[l].substring(1));
        			tot += hrs;
        			gpa += grade*hrs;
        		}
        		gpa = gpa/tot;
        		if(Math.max(gpa, max) == gpa) {
        			pname = sname;
        			max = gpa;
        		}
        	}
        	out.println(school + " = " + pname);
        }
    }
}