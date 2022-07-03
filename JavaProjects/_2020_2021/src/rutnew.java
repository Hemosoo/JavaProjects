import java.util.*;
import java.io.*;
class rutnew {
  static BufferedReader in;
  static int n;
  static int[] x, y;
  static char[] d;
  static int MAX = Integer.MAX_VALUE;
  public static void main(String[] args) throws IOException{
    in = new BufferedReader(new InputStreamReader(System.in));
    init();
    solve();
    in.close();
  }

  static void init() throws IOException{
    StringTokenizer st = new StringTokenizer(in.readLine());
    n = Integer.parseInt(st.nextToken());
    x = new int[n];
    y = new int[n];
    d = new char[n];
    for(int i = 0; i < n; i++){
      st = new StringTokenizer(in.readLine());
      d[i] = st.nextToken().charAt(0);
      x[i] = Integer.parseInt(st.nextToken());
      y[i] = Integer.parseInt(st.nextToken());
    }
  }

public static void solve(){
    for(int i = 0; i < n; i++){
      int temp = check(i);
      if(temp == MAX){
        System.out.println("Infinity");
      }else{
        System.out.println(temp);
      }
    }
  }

 public static int check(int i){
    int min = MAX;
    
    if(d[i] == 'N') { 
      for(int j = 0; j < n; j++){
        if(i == j || d[j] == 'N' || x[i] < x[j] || y[i] > y[j])
          continue;
        
        else{
          int dx = x[i] - x[j];
          int dy = y[j] - y[i];
          
          if(dx < dy && check(j) >= dx){
            min = Math.min(min, dy);
          }
        }
      }
    }
    else {
      for(int j = 0; j < n; j++){
        if(i == j || d[j] == 'E' || x[i] > x[j] || y[i] < y[j])
          continue;

        else{
          int dx = x[j] - x[i];
          int dy = y[i] - y[j];

          if(dx > dy && check(j) >= dy){
            min = Math.min(min, dx);
          }
        }
      }
    }
    return min;
  }
}