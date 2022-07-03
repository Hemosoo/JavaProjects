package CSES;
import java.util.*;
import java.io.*;
public class countingrooms {
	static BufferedReader in;
	static StringTokenizer st;
	static PrintWriter out;
	static char[][] a;  			
	static int row, col;			
	private static boolean[][] v;  	
	private static int cnt;  		

	public static void main(String[] args) throws IOException {
		
		in = new BufferedReader(new InputStreamReader(System.in));	
		//in = new BufferedReader(new FileReader("xx.in"));	
		//out = new PrintWriter(new File("xx.out"));
		
		init();
		solve();
		in.close();
		//out.close();
	}
	
	static void init() throws IOException {
		
		st = new StringTokenizer(in.readLine());
		row = Integer.parseInt(st.nextToken());
		col = Integer.parseInt(st.nextToken());

		a = new char[row][];
		
		for (int i = 0; i < row; i++)
			a[i] = in.readLine().toCharArray(); 	
		
		v = new boolean[row][col];
	}
	
		
	static void solve() {
		
		int group = 0;
		for (int i = 0; i < row; i++){
			for (int j = 0; j < col; j++){
				if(!v[i][j] && a[i][j]=='.'){
					cnt = 0;
					floodfill(i, j);
					//System.out.println(cnt+" ");
					group++;
				}
			}
		}
		
		System.out.println(group);
	}

	private static void floodfill(int r, int c) {
		
		if (r<0 || r>=row || c<0 || c>=col || a[r][c] != '.' || v[r][c]) 
		return;

		v[r][c] = true; 
		cnt++; 

		floodfill(r, c + 1);
		floodfill(r, c - 1);
		floodfill(r - 1, c);
		floodfill(r + 1, c);
	}
	
	
	static void printBoard(String[][] a) {
		for (int i = 0; i < a.length; i++) {
		    for (int j = 0; j < a[i].length; j++) {
		        //System.out.print(a[i][j] + " ");
		    }
		     //System.out.println();
		}
	}	
}
