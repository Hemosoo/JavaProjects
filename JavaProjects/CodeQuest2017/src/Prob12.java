import java.util.*;
import java.io.*;

public class Prob12 {

    static String file = "Prob12";
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
        	int n1 = in.nextInt();
        	in.nextLine();
        	double sum = 0;
        	double bal = 0;
        	for(int j = 0; j < n1; j++) {
        		String line1 = in.nextLine();
        		String temp = "";
        		double add = 0;
        		
        		double sub = 0;
        		int index = 0;
        		for(int k = 0; k < line1.length(); k++) {
        			if(line1.charAt(k) == ',' ) {
        				
        				if(index == 1 && !temp.isEmpty()) {
        					add = Double.parseDouble(temp);

        				} 
        				index++;
        				temp = "";
        			}
        			else {
        				temp+=line1.charAt(k)+"";
        			}
        			if(index == 2 && !temp.isEmpty()) {
        				sub = Double.parseDouble(temp);
        			}
        		}
        		
        		//System.out.println(add);
        		//System.out.println(sub);
        		bal+=add-sub;
        		sum+=bal;
        		//System.out.println(bal);
        	}
        	double ans = (sum/n1) * (0.18/12);
        	String temp = String.format("$%.2f", Math.round(ans*100)/100d);
        	out.println(temp);
        	//out.println("bruh");
        	//System.out.println(sum);
        }
    }
}
/*
2
30
1,200.00,
2,,
3,,
4,350.00,
5,,
6,,
7,,
8,100.00,
9,,50.00
10,,
11,,
12,400.00,
13,,
14,,
15,,
16,,
17,,
18,,
19,,
20,,
21,75.00,
22,,
23,,
24,,100.00
25,,
26,,
27,200.00,
28,,
29,,
30,,
31
1,300.00,
2,,
3,,
4,450.00,
5,,
6,,
7,,
8,100.00,
9,,50.00
10,,
11,,
12,800.00,
13,,
14,,
15,,
16,,
17,,
18,,
19,,
20,,
21,75.00,
22,,
23,,
24,,100.00
25,,
26,,
27,200.00,
28,,
29,,
30,,
31,,



*/