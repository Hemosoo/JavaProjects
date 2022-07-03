import java.util.*;
import java.io.*;

public class Prob14 {

    static String file = "Prob14";
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
    
    public static void init() {
		n = in.nextInt();
		
	}
	public static void solve() {
		for(int k = 0; k < n; k++) {
			int n1 = in.nextInt();
			ArrayList<String> a1 = new ArrayList<String>();
			ArrayList<String> a2 = new ArrayList<String>();
			for(int j = 0; j < n1; j++) {
				a1.add(in.next());
				a2.add(in.next());
			}
			String start = "";
			for(int j = 0; j < n1; j++) {
				if(!a2.contains(a1.get(j))){
					start = a1.get(j);
					break;
				}
			}
			ArrayList<String> ans = new ArrayList<String>();
			String end = a2.get(a1.indexOf(start));
			ans.add(start);
			ans.add(end);
			while(a1.contains(end)) {
				end = a2.get(a1.indexOf(end));
				ans.add(end);
			}
			//System.out.println(ans);
			for(int i = ans.size()-1; i>=0; i--) {
				out.println(ans.get(i));
			}
		}
	}
}