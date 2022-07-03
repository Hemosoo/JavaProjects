import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class _2146 {
	static BufferedReader in;
	static int[][] a, b;
	static Queue<Integer> q1, q2;
	static int flag, n;
	static int[] dx = {0, 0, -1, 1}, dy = {1, -1, 0, 0};
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		init();
		solve();
	}
	public static void init() throws IOException {
		StringTokenizer st;
		n = Integer.parseInt(in.readLine());
		a = new int[5][5];
		b = new int[n][n];
		q1 = new LinkedList<Integer>();
		q2 = new LinkedList<Integer>();
		for(int i = 0; i < 5; i++) {
			st = new StringTokenizer(in.readLine());
			for(int j = 0; j < 5; j++) {
				a[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		//System.out.println(Arrays.deepToString(a));
	}
	public static void solve() {
		flag = 2;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(a[i][j] == 1) {
					bfs(i, j);
					flag++;
				}
			}
		}
		print(a);
		
		bfs2();
		bfs3();
		
		print(a);
		print(b);
	}
	static void bfs(int i, int j){
	    q1.add(i);
	    q1.add(j);

	    while(!q1.isEmpty()){
	      int x = q1.poll();
	      int y = q1.poll();

	      for(int k = 0; k < 4; k++){
	        int nx = x + dx[k];
	        int ny = y + dy[k];
	        if(nx < 0 || nx >= n || ny < 0 || ny >= n)
	          continue;
	        if(a[nx][ny] == 1) {
	          a[nx][ny] = flag;
	          q1.add(nx);
	          q1.add(ny);
	        }
	      }         
	    }
	  }

	  static void bfs2(){
	    while(!q2.isEmpty()){
	      int x = q2.poll();
	      int y = q2.poll();
	      for(int i = 0; i < 4; i++){
	        int nx = x + dx[i];
	        int ny = y + dy[i];
	        if(nx < 0 || nx >= n || ny < 0 || ny >= n)
	          continue;
	        if(a[nx][ny] == 0){
	          a[nx][ny] = a[x][y];
	          q2.add(nx);
	          q2.add(ny);
	        }
	      }
	    }
	  }

	  static void bfs3(){
	    while(!q2.isEmpty()){
	      int x = q2.poll();
	      int y = q2.poll();
	      for(int i = 0; i < 4; i++){
	        int nx = x + dx[i];
	        int ny = y + dy[i];
	        if(nx < 0 || nx >= n || ny < 0 || ny >= n)
	          continue;
	        if(b[nx][ny] == -1){
	          b[nx][ny] = b[x][y] + 1;
	          q2.add(nx);
	          q2.add(ny);
	        }
	      }
	    }
	  }

	  static void print(int[][] grid){
		  System.out.println();
			for(int i = 0; i < 5; i++) {
				for(int j = 0; j < 5; j++) {
					System.out.print(a[i][j] +  " ");
				}
				System.out.println();
			}
	  }
	}
/*
5 
1 1 0 0 1
1 0 0 0 1
1 0 0 0 0
0 0 0 0 0
0 1 1 1 1 
*/