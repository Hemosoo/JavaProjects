import java.util.*;
import java.io.*;
public class noTimeToPaint {
	static BufferedReader in;
	static int n, m;
	static int[] prefix, suffix;
	static HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	static String str;
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		in = new BufferedReader(new InputStreamReader(System.in));
		init();
		solve();
	}
	
	static void init() throws IOException{
		StringTokenizer st = new StringTokenizer(in.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		str = in.readLine();
		for(int i = 0; i < 26; i++)
			map.put((char)('A'+i), -1);
		prefix = new int[n+1];
		char cur = str.charAt(0);
		for(int i = 1; i <= n; i++) {
			cur = str.charAt(i-1);
			prefix[i] = prefix[i-1];
			if(map.get(cur) == -1)
				prefix[i]++;
			else {
				for(char c: map.keySet()) {
					if(c < cur && map.get(c) > map.get(cur)) {
						prefix[i]++;
						break;
					}
				}
			}
			map.put(cur, i);
		}
		//System.out.println(Arrays.toString(prefix));
		suffix = new int[n+1];
		for(int i = 0; i < 26; i++)
			map.put((char)('A'+i), n);
		for(int i = n-1; i >= 0; i--) {
			cur = str.charAt(i);
			suffix[i] = suffix[i+1];
			if(map.get(cur) == n)
				suffix[i]++;
			else {
				for(char c: map.keySet()) {
					if(c < cur && map.get(c) < map.get(cur)) {
						suffix[i]++;
						break;
					}
				}
			}
			map.put(cur, i);
		}
		//System.out.println(Arrays.toString(suffix));
	}
	
	static void solve() throws IOException{
		StringBuilder sb = new StringBuilder();
		for(int z = 0; z < m; z++) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int ans = prefix[a-1] + suffix[b];
			sb.append(ans).append("\n");	
		}
		System.out.print(sb.toString());
	}
	
}

