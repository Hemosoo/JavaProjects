import java.io.*;
import java.util.*;
/* 
Adjacency List
7 5
1 2
2 3
3 4
5 6
6 7
*/
public class buildingroads {
    
    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer st;
    
    static int n, m, ans;
    static ArrayList<Integer> a[], answer;
    static boolean v[];
    
    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));   
        init();
        solve();        
        in.close();
    }
    
    static void init() throws IOException {
            
        st = new StringTokenizer(in.readLine());        
        n = Integer.parseInt(st.nextToken());                
        m = Integer.parseInt(st.nextToken());        
       	answer = new ArrayList<Integer>();
        a = new ArrayList[n];
        
        for(int i = 0; i < n; i++) 
            a[i] = new ArrayList<Integer>();    
                
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(in.readLine());
            int x = Integer.parseInt(st.nextToken())-1;
            int y = Integer.parseInt(st.nextToken())-1;
            a[x].add(y);
            a[y].add(x);
        }            
        v = new boolean[n];
    }
    
    static void solve() throws IOException {
        ans = 0;
        for(int i=0; i<n; i++) {
            if(!v[i]) {    
                dfs(i);
                ans++;
                answer.add(i);
            }    
        }
        
        System.out.println(ans-1);
        for(int i = 0; i < ans-1; i++) {
        	System.out.println((answer.get(i)+1) + " " + (answer.get(i+1)+1));
        }
    }
    
    static void dfs(int i) {
        v[i] = true;
        
        for(int e:a[i]) {
            if(!v[e]) {                
                dfs(e);            
            }
        }
    }        
}