import java.util.*;

import java.io.*;
public class Prob29 {
	static int T;
	static int dist[][];
	static int N;
	static int M;
	static int[] dr = {-1,1,0,0, 1,-1, -1, 1,0};
	static int[] dc= {0,0,-1,1, 1, -1, 1, -1,0};
	public static void main (String args[]) throws IOException{
	    Scanner in = new Scanner(System.in);
	    T = Integer.parseInt(in.nextLine());
	    for(int t = 0; t < T; t++){
	        StringTokenizer st= new StringTokenizer(in.nextLine());
	        N = Integer.parseInt(st.nextToken());
	        M = Integer.parseInt(st.nextToken());
	        char grid[][] = new char [N][M];
	        int a = 0;
	        int b = 0;
	        for(int i = 0; i < N; i++){
	        		String line = in.nextLine();
	            for(int j =0; j < line.length(); j++){
	                grid[i][j] = line.charAt(j);
	                if(line.charAt(j) == 'C'){
	                    a= i;
	                    b= j;
	                }
	            }
	        }
	        state start = new state(0, a, b,0,0);
	        boolean visited[][] = new boolean[N][M];
	        Queue<state> q = new LinkedList<state>();
	        q.add(start);

	        visited[start.row][start.col] = true;
	        while (!q.isEmpty()) {
	            state cur = q.poll();
	            
	            if (grid[cur.row][cur.col] == '$'){
	                System.out.println(cur.dist);
	                break;
	            }
	            for(int i = 0; i < 9; i++){
	            		int nv1 = cur.v1 + dr[i];
	            		int nv2 =  cur.v2 + dc[i];
	                int nr = cur.row + nv1;
	                int nc = cur.col + nv2;
	                if(nr >= 0 && nr < N && nc >=0 && nr < M && visited[nr][nc] == false && grid[nr][nc] != '#'){
	                    visited[nr][nc] = true;
	                    q.add(new state(cur.dist +1 ,nr, nc, nv1, nv2));
	                }
	            }
	        }
	        
	    }
	}
	static class state{
		int dist, row, col, v1, v2;
		public state (int d, int R, int C, int one, int two) {
			dist = d;
			row = R;
			col = C;
			v1 = one;
			v2 = two;
		}

	}


}
/*
2
10 10
##########
# C ######
#   ######
#   ######
#   ######
#   ######
#     $$$#
#     $$$#
#     $$$#
##########
16 20
####################
########           #
#$$$               #
#$$$     #######   #
#$$$   #########   #
################   #
################   #
###############    #
##         ###     #
#                 ##
#    ######   ######
#    ###############
#   ################
#   ################
# C ################
####################

*/