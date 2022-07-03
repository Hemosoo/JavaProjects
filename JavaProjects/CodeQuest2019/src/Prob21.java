import java.util.*;
import java.io.*;

public class Prob21 {

    static String file = "Prob21";
    static Scanner in;
    static PrintWriter out;
    
    static int n;
    
    public static void main(String[] args)throws IOException{
        
        //in = new Scanner(new File(file+".in.txt"));
        in = new Scanner(System.in);
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
			int[] spy = new int[4];
			for(int i = 0; i < 4; i++) {
				spy[i] = in.nextInt();
			}
			int n1 = in.nextInt();
			int[][] wall = new int[n1][4];
			for(int i = 0; i < n1; i++) {
				for(int j = 0; j < 4; j++) {
					wall[i][j] = in.nextInt();
				}
				
			}
			double[] eq = new double[2];
			eq[0] = ((double)(spy[1]-spy[3]))/(spy[0]-spy[2]);
			eq[1] = spy[1]-(eq[0]*spy[0]);
			double[][] weq = new double[n1][2];
			for(int i = 0; i < n1; i++) {
				weq[i][0] = ((double)(wall[i][1]-wall[i][3]))/(wall[i][0]-wall[i][2]);
				weq[i][1] = wall[i][1]-(weq[i][0]*wall[i][0]);
			}
			//System.out.println(Arrays.toString(eq));
			for(int i = 0; i < n1; i++) {
				
			}
		}
	}
	
}
/*
2
2 2 6 4 1
2 5 5 5
2 2 6 4 2
4 1 4 5
1 5 4 5
 */
