import java.util.*;
import java.io.*;
class measurement {
  static int n, g, ans = 0, maxmilk = 0, maxcow = 100000000, bmilk = 0, bcow = 0;
  static cow[] array;
  static HashMap<Integer, Integer> cowmap;
  static TreeMap<Integer, Integer> milkmap;
  static BufferedReader in;
  static PrintWriter out;
  public static void main(String[] args) throws IOException{
    in = new BufferedReader(new FileReader(new File("measurement.in")));
    out = new PrintWriter(new File("measurement.out"));
    init();
    solve();
    in.close();
    out.close();
  }

public static void init() throws IOException{
    StringTokenizer st = new StringTokenizer(in.readLine());
    n = Integer.parseInt(st.nextToken());
    g = Integer.parseInt(st.nextToken());
    array = new cow[n];

    cowmap = new HashMap<Integer, Integer>();
    milkmap = new TreeMap<Integer, Integer>();
    milkmap.put(g, 1000000000);

    for(int i = 0; i < n; i++){
      st = new StringTokenizer(in.readLine());
      int day = Integer.parseInt(st.nextToken());
      int id = Integer.parseInt(st.nextToken());
      int change = Integer.parseInt(st.nextToken());
      array[i] = new cow(day, id, change);
    }

    Arrays.sort(array);
  }

  public static void solve(){
    for(int i = 0; i < n; i++){
      cow cur = array[i];
      int id = cur.id, change = cur.change;
      int milk = 0;
      if(cowmap.containsKey(id))
        milk = cowmap.get(id);
      else
        milk = g;

      if(bmilk == milk){
        bmilk += change;
      }
      milkmap.put(milk, milkmap.get(milk) - 1);
      if(milkmap.get(milk) == 0)
        milkmap.remove(milk);

      milk += change;

      cowmap.put(id, milk);

      if(milkmap.containsKey(milk))
        milkmap.put(milk, milkmap.get(milk) + 1);
      else
        milkmap.put(milk, 1);

      maxmilk = milkmap.lastKey();
      maxcow = milkmap.get(milkmap.lastKey());

      if(maxmilk != bmilk || maxcow != bcow){
        ans++;
        bmilk = maxmilk;
        bcow = maxcow;
      }
    }

    out.println(ans);
  }
}
  class cow implements Comparable<cow>{
    int day, id, change;
    cow(int a, int b, int c){
      day = a;
      id = b;
      change = c;
    }

    public int compareTo(cow other){
      return this.day - other.day;
    }

    public String toString(){
      return "day: " + day + ", id: " + id + ", change: " + change;
    }
    
  }