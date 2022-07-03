import java.util.*;
import java.io.*;
public class Prob17 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int l = 0; l < n; l++) {
			int b = in.nextInt();
			int c = in.nextInt();
			in.nextLine();
			int count = 0;
			HashMap<String, Integer> candidates = new HashMap<String, Integer>();
			//System.out.println(3/2);
			String winner = "";
			boolean first = true;
			String lines[] = new String[b];
			for(int i = 0; i < b; i++) {
				lines[i] = in.nextLine();
			}
			//System.out.println(Arrays.toString(lines));
			while((winner.equals(""))) {
				count++;
				if(first) {
					for(int j = 0; j < lines[0].length(); j++) {
						if(j==0) {
							candidates.put(lines[0].charAt(j)+"", 1);
						} else candidates.put(lines[0].charAt(j)+"", 0);
						
					}
					for(int i = 1; i < b; i++) {
						for(int j = 0; j < lines[i].length(); j++) {
							String v = lines[i].charAt(j)+"";
							if(candidates.containsKey(v)) {
								candidates.put(v, candidates.get(v)+1);
								break;
							}
						}
						
						
					}
					first = false;
				} else {
					for(int i = 0; i < b; i++) {
						for(int j = 0; j < lines[i].length(); j++) {
							String v = lines[i].charAt(j)+"";
							if(candidates.containsKey(v)) {
								candidates.put(v, candidates.get(v)+1);
								break;
							}
						}
						
						
					}
				}
				
				int min = b;
				int max = 0;
				ArrayList<String> a = new ArrayList<String>();
				for(String s: candidates.keySet()) {
					min = Math.min(min, candidates.get(s));
					max = Math.max(max, candidates.get(s));
				}
				if(max >= (b/2)+1) {
					for(String s: candidates.keySet()) {
						if(candidates.get(s) == max) {
							winner = s;
							break;
						}
					}
				} else {
					for(String s: candidates.keySet()) {
						if(candidates.get(s) == min) {
							a.add(s);
							
						}
					}
					for(String s: a) {
						candidates.remove(s);
					}
				}
				if(!winner.equals("")) break;
				//System.out.println(candidates);
				for(String s: candidates.keySet()) {
					candidates.put(s, 0);
				}
				
			}
			//System.out.println(candidates.get(winner));
			System.out.printf("Candidate " + winner + " won with %.1f%%" + " of the vote after " +  count + " tallies", Math.round(((double)candidates.get(winner)/(double)b)*1000)/10d);
			System.out.println();
		}
	}
}