import java.util.*;
import java.io.*;
public class Prob10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		
		for(int l = 0; l < n1; l++) {
			int o = in.nextInt();
			int n = in.nextInt();
			in.nextLine();
			HashMap<String, pair> map = new HashMap<String, pair>();
			ArrayList<String> del = new ArrayList<String>();
			ArrayList<String> upd = new ArrayList<String>();
			ArrayList<String> cre = new ArrayList<String>();
			ArrayList<String> men = new ArrayList<String>();
			for(int i = 0; i < o; i++) {
				String[] line = in.nextLine().split(",");
				map.put(line[0], new pair(line[1], line[2]));
			}
			for(int i = 0; i < n; i++) {
				String[] line = in.nextLine().split(",");
				String name = line[0];
				String phone = line[1];
				String add = line[2];
				if(!map.containsKey(name)) {
					
				}
				men.add(name);
			}
		}
	
	}
	public static class pair {
		String a, b;
		public pair(String x, String y) {
			a = x;
			b = y;
		}
		public String toString() {
			return a + " " + b;
		}
	}
}