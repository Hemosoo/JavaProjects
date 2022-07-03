import java.util.*;
import java.io.*;
class shuffle {
  static BufferedReader in;
  static PrintWriter out;
  static int[] v, d;
  static int n, ans; 
  public static void main(String[] args) throws IOException{
    in = new BufferedReader(new FileReader(new File("shuffle.in")));
    out = new PrintWriter(new File("shuffle.out"));
    init();
    solve();
    in.close();
    out.close();
  }

  static void init() throws IOException{
    StringTokenizer st = new StringTokenizer(in.readLine());
    n = Integer.parseInt(st.nextToken());
    v = new int[n];
    d = new int[n];
    st = new StringTokenizer(in.readLine());
    for(int i = 0; i < n; i++){
      d[i] = Integer.parseInt(st.nextToken()) - 1;
      v[d[i]]++;
    }
  }

  static void solve(){
    ans = n;
    Queue<Integer> q = new LinkedList<Integer>();
    for(int i = 0; i < n; i++){
      if(v[i] == 0){
        q.add(i);
        ans--;
      }
    }

    while(!q.isEmpty()){
      int curr = q.poll();
      v[d[curr]]--;
      if(v[d[curr]] == 0){
        q.add(d[curr]);
        ans--;
      }
    }
    System.out.println(ans);
  }
}