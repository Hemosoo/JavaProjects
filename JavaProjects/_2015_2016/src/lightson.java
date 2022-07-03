import java.util.*;
import java.io.*;
class lightson {
  static BufferedReader in;
  static PrintWriter out;
  static int n, m;
  static boolean[][] v, lights;
  static ArrayList<pair>[][] adjlist;
  static int ans = 0;
  public static void main(String[] args) throws IOException{
    in = new BufferedReader(new FileReader(new File("lightson.in")));
    out = new PrintWriter(new File("lightson.out"));
    init();
    solve();
    in.close();
    out.close();
  }

  static void init() throws IOException{
    StringTokenizer st = new StringTokenizer(in.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    v = new boolean[n][n];
    lights = new boolean[n][n];
    adjlist = new ArrayList[n][n];
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        adjlist[i][j] = new ArrayList<pair>();
      }
    }
    for(int i = 0; i < m; i++){
      st = new StringTokenizer(in.readLine());
      int a = Integer.parseInt(st.nextToken()) - 1;
      int b = Integer.parseInt(st.nextToken()) - 1;
      int c = Integer.parseInt(st.nextToken()) - 1;
      int d = Integer.parseInt(st.nextToken()) - 1;
      adjlist[a][b].add(new pair(c, d));
    }
    System.out.println(Arrays.deepToString(v));
    System.out.println(Arrays.deepToString(adjlist));
  }

  static void solve(){
    dfs(0, 0);

    System.out.println(ans);
    System.out.println(Arrays.deepToString(lights));
  }

  static void dfs(int row, int col){
    if(v[row][col] == true) return;

    v[row][col] = true;
    lights[row][col] = true;

    for(pair p: adjlist[row][col]){
      lights[p.a][p.b] = true;
      if(v[p.a][p.b] == false){
        dfs(p.a, p.b);
      }
    }
  }
}

class pair{
  int a, b;

  public pair(int one, int two){
    a = one;
    b = two;
  }

  public String toString(){
    return a + " " + b;
  }
}