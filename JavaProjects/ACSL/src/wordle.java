import java.io.*;
import java.util.*;

public class wordle {
	public static void main(String[] args) {
		System.out.println(findMatch("bread", "reads breed dread reeds braid plead creed darts seeds leads arbor heads drape capes"));
		//System.out.println(findMatch("ports", "shots prank"));
	}
	public static String findMatch(String word, String guesses) {
		String[] guess = guesses.split(" ");
		HashMap<String, String> wordle = new HashMap<String, String>();
		for(int i = 0; i < guess.length; i++) {
			String t = "";
			String wordt = guess[i];
			for(int j = 0; j < wordt.length(); j++) {
				char c = wordt.charAt(j);
				char add = '-';
				
				if(c == word.charAt(j)) add = 'G';
				t += add +"";
			}
			String t2 = "";
			for(int j = 0; j < 5; j++) {
				char c = wordt.charAt(j);
				char add = t.charAt(j);
				for(int l = 0; l < 5; l++) {
					if(t.charAt(l) == 'G') continue;
					if(word.charAt(l) == c) {
						add = 'Y';
						break;
					}
				}
				t2 += add + "";
			}
			boolean d = true;
			for(int j = 0; j < t2.length(); j++) {
				if(t2.charAt(j) != '-') d = false;
			}
			if(!d) {
				wordle.put(wordt, t2);
			}
			
		}
		//System.out.println(wordle);
		String ans = "";
		if(wordle.size() < 6) {
			String ans2 = "abcdefghijklmnopqrstuvwxyz";
			for(int i = 0; i < ans2.length(); i++) {
				boolean add = true;
				for(String s: guess) {
					for(int j = 0; j < s.length(); j++) {
						if(s.charAt(j) == ans2.charAt(i)) {
							add = false;
						}
					}
				}
				if(add) ans += ans2.charAt(i) + "";
			}
			return ans;
		}
		HashMap<String, Integer> g = new HashMap<String, Integer>();
		
		for(String s: wordle.keySet()) {
			String temp = wordle.get(s);
			int c = 0;
			for(int i = 0; i < temp.length(); i++) {
				if(temp.charAt(i) == 'G') {
					c++;
				}
				
			}
			g.put(s, c);
		}
		HashMap<String, Integer> y = new HashMap<String, Integer>();
		
		for(String s: wordle.keySet()) {
			String temp = wordle.get(s);
			int c = 0;
			for(int i = 0; i < temp.length(); i++) {
				if(temp.charAt(i) == 'Y') {
					c++;
				}
				
			}
			y.put(s, c);
		}
		//System.out.println(y);
		//System.out.println(g);
		ArrayList<String> ord = new ArrayList<String>();
		for(int i = 5; i>= 0; i--) {
			ArrayList<String> tg = new ArrayList<String>();
			for(String s: g.keySet()) {
				if(g.get(s) == i) tg.add(s);
			}
				for(int l = 5; l>= 0; l--) {
					ArrayList<String> ty = new ArrayList<String>();
					for(String s: y.keySet()) {
						if(y.get(s) == l && tg.contains(s)) ty.add(s);
					}
					//System.out.println(ty);
					if(!ty.isEmpty()) {
						ArrayList<String> fir = new ArrayList<String>();
						ArrayList<String> las = new ArrayList<String>();
						HashMap<String, Integer> vow = new HashMap<String, Integer>();
						for(int k = 0; k < ty.size(); k++) {
							String s = ty.get(k);
							if(wordle.get(s).charAt(0) == 'G') fir.add(s);
							else if(wordle.get(s).charAt(s.length()-1) == 'G') las.add(s);
							int cnt = 0;
							for(int m = 0; m < s.length(); m++) {
								char c = s.charAt(m);
								if(c == 'a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'u') {
									if(wordle.get(s).charAt(m) == 'G') {
										cnt++;
									}
										
								}
							}
							vow.put(s, cnt);
							
						}
						//System.out.println(vow);
						Collections.sort(fir);
						Collections.sort(las);
						for(int k = 0; k < fir.size(); k++) {
							ord.add(fir.get(k));
							if(las.contains(fir.get(k))) {
								las.remove(fir.get(k));
							}
							if(vow.containsKey(fir.get(k))) {
								vow.remove(fir.get(k));
							}
						}
						for(int k = 0; k < las.size(); k++) {
							ord.add(las.get(k));
							if(vow.containsKey(las.get(k))) {
								vow.remove(las.get(k));
							}
						}
						
						for(int k = 5; k >= 0; k--) {
							ArrayList<String> vow2 = new ArrayList<String>();
							for(String s:vow.keySet()) {
								if(vow.get(s) == k) {
									vow2.add(s);
								}
							}
							
							Collections.sort(vow2);
							for(String s:vow2) {
								ord.add(s);
							}
							System.out.println(vow2);
						}
						//System.out.println(ord);
					}
				}
				

		}
		
		for(int i = 0; i < 6; i++) {
			ans+=ord.get(i) + " ";
		}
		
		
		
		return ans.substring(0, ans.length()-1);
    }
	
}
