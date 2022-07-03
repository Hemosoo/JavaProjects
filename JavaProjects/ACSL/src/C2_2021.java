
import java.util.*;
public class C2_2021 {
	public static void main(String[] args) {
		System.out.println(rearrangeString("MHHHHJLDDHHDDD", 3));
	}
	static String ans = "";
    public static String rearrangeString(String s, int n) {
        ArrayList<Character>[] a = new ArrayList[s.length()];
        for(int i =0; i < s.length(); i++) {
            a[i] = new ArrayList<Character>();
        }
        char c[] = s.toCharArray();
        char bef = c[0];
        String temp = "" + bef;
        for(int i = 1; i < c.length; i++) {
            if(bef != c[i]) {
                a[temp.length()-1].add(bef);
                bef = c[i];
                temp = "" + c[i];
                if(i == c.length-1) {
                    a[0].add(c[i]);
                }
                continue;
            } else {
                temp+=c[i];
                bef = c[i];
                if(i == c.length-1) {
                	a[temp.length()-1].add(c[i]);
                }
            }
        }
        for(int i = s.length()-1 ; i >= 0; i--) {
            add(a[i], n, i);
        }
        char[] k = ans.toCharArray();
        char prev = k[0];
        int count = 1;
        String ans2 = "" + k[0];
        for(int i = 1; i < k.length; i++) {
        	if(prev == k[i]) count++;
        	else {
        		count = 1;
        		prev = k[i];
        	}
        	if(count <= n) {
        		ans2 += k[i];
        	}
        }
        return ans2;
    }
    public static void add(ArrayList<Character> a, int n, int index) {
        Collections.sort(a);
        Map<Character, Integer> m = new HashMap<Character, Integer>();
        for(int i = 0; i < a.size(); i++) {
            Integer t = m.get(a.get(i));
            if(t == null) m.put(a.get(i), 1);
            else m.put(a.get(i), t+1);
        }
        //System.out.println(m);
        LinkedHashSet<Character> set = new LinkedHashSet<Character>(a);
        //System.out.println(set);
        for(Character c: set) {
            int num = m.get(c);
            if(num*(index+1) <= n) {
                for(int i = 0; i < num*(index+1); i++) {
                    ans += c +"";
                }
            } else {
                for(int i = 0; i < n; i++) {
                    ans += c +"";
                }
            }
        }
    }
}
