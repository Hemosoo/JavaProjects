import java.io.*;
import java.util.*;

public class moocast {
    static FastReader s;
    static int[][] nums;
    static int N, cnt;
    static boolean v[];
    static PrintWriter out;
    static class FastReader {
        BufferedReader in;
        StringTokenizer st;
        public FastReader() throws IOException {
            in = new BufferedReader(new FileReader("moocast.in"));
            
        }
        String next() { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try { 
                    st = new StringTokenizer(in.readLine()); } 
                catch (IOException  e) { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
        int nextInt() {
            return Integer.parseInt(next());
        }
    }
    public static void main(String[] args) throws IOException {
        s = new FastReader();
        out = new PrintWriter(new BufferedWriter(new FileWriter("moocast.out")));
        init();
        solve();
        out.close();
    }
    public static void init() {
        N = s.nextInt();
        nums = new int[N][3];
        
        for(int i = 0; i < N; i++) {
            nums[i][0] = s.nextInt();
            nums[i][1] = s.nextInt();
            nums[i][2] = s.nextInt();
        }
    }
    public static void solve() {
        int res = 0;
        for(int i = 0; i < N; i++) {
            v = new boolean[N];
            cnt = 1;
            dfs(i);
            
            res = Math.max(res, cnt);
        }
        
        //System.out.println(res);
        out.println(res);
    }
    static void dfs(int i) {
        v[i] = true;
        for(int j = 0; j < N; j++) {
            if(v[j]) continue;
            if(i == j) continue;
            double d = Math.pow((nums[i][0] - nums[j][0]), 2) + Math.pow((nums[i][1] - nums[j][1]), 2);
            if(d < Math.pow(nums[i][2], 2) && !v[j]) {
                dfs(j);
                cnt++;
            }
            
        }
    }
}