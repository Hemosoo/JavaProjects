import java.util.*;
import java.io.*;
public class rental {
	static BufferedReader br;
	static PrintWriter out;
	static int n, m, r;
	static int[] cow, rental, temp;
	static TreeMap<Integer, Integer> shop = new TreeMap<Integer, Integer>();
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new FileReader("rental.in"));
		out = new PrintWriter(new File("rental.out"));
		init();
		solve();
		br.close();
		out.close();
	}
	public static void init() throws IOException{
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		cow = new int[n];
		rental = new int[r];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			cow[i] = Integer.parseInt(st.nextToken());
		}
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(shop.containsKey(b))
				shop.put(b, shop.get(b) + a);
			else {
				shop.put(b, a);
			}
			
		}
		for(int i = 0; i < r; i++) {
			st = new StringTokenizer(br.readLine());
			rental[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(cow);
		Arrays.sort(rental);
		
		//System.out.println(Arrays.toString(rental));
	}
	public static void solve() {
		long[] profit = new long[n];
		for(int i = 0; i < profit.length; i++) {
			profit[i] = money(cow[n-i-1]);
		}
		//System.out.println(Arrays.toString(profit));
		for(int i = n-1, j = r-1;    i >=0 && j >=0;     i--, j--) 
		    profit[i] = Math.max(profit[i], rental[j]);
		
		long ans = 0;
		for(int i = 0; i < profit.length; i++) {
			ans+=profit[i];
		}
		out.println(ans);
	}
	public static int money(int gal) {
		int total = 0;
		while(gal > 0 && !shop.isEmpty()) {
			int price = shop.lastKey();
			int num = shop.get(price);
			if(num ==0) {
				shop.remove(price);
				continue;
			}
			if(num > gal) {
				shop.put(price, num-gal);
				total += gal*price;
				gal = 0;
			}
			else {
				shop.put(price, 0);
				total+=num*price;
				gal -= num;
			}
		}
		return total;
	}
	
}
