package USACO;

import java.io.*;
import java.util.*;

public class perimeter {
	static BufferedReader in;
	static StringTokenizer st;
	static PrintWriter out;
	static char[][] a;  			
	static int row, col;			
	private static int cnt;  		
	static int n, p, fans=0, sans=0;

	public static void init() throws IOException {
		in = new BufferedReader(new FileReader("perimeter.in"));
		st = new StringTokenizer(in.readLine());
		row = Integer.parseInt(st.nextToken());
		col = Integer.parseInt(st.nextToken());

		a = new char[row][];
		
		for (int i = 0; i < row; i++)
			a[i] = in.readLine().toCharArray(); 	
	}
	
		
	static void solve() {
		for (int i = 0; i < row; i++){
			for (int j = 0; j < col; j++){
				if(a[i][j]=='#'){
					cnt = 0;
					p = 0;
					floodfill(i, j);
					if(fans == cnt) sans=Math.min(sans,p);
					else sans=Math.max(sans, p);
					fans = Math.max(fans,  cnt);
				}
			}
		}
		
		out.println(fans + " " + sans);
		
	}

	private static void floodfill(int r, int c) {
		
		if (r<0 || r>=row || c<0 || c>=col || a[r][c] == '.')  {
			p++;
			return;
		}
		

		a[r][c]='$'; 
		cnt++; 

		floodfill(r, c + 1);
		floodfill(r, c - 1);
		floodfill(r - 1, c);
		floodfill(r + 1, c);
	}
	
	
	static void printBoard(String[][] a) {
		for (int i = 0; i < a.length; i++) {
		    for (int j = 0; j < a[i].length; j++) {
		        System.out.print(a[i][j] + " ");
		    }
		     System.out.println();
		}
	}	
}
