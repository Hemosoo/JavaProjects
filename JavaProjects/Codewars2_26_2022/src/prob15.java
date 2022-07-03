import java.util.*;
import java.io.*;
public class prob15 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		ArrayList<String> names = new ArrayList<String>();
		ArrayList[] gem = new ArrayList[12];
		for(int i = 0; i < 12; i++) {
			gem[i] = new ArrayList<String>();
		}
		String[] prior = {"Lapis", "Topaz", "Tourmaline", "Sapphire", "Peridot", "Ruby", "Pearl", "Emerald", "Diamond", "Aquamarine", "Amethyst", "Garnet"};
		List<String> p = new ArrayList<>(Arrays.asList(prior));
		names.add(s);
		while(!s.equals("END")) {
			s=in.nextLine();
			names.add(s);
		}
		names.remove(names.size()-1);
		for(int i = 0; i < names.size(); i++) {
			String[] temp = names.get(i).split(" ");
			int prev = 13;
			for(String t: temp) {
				if(p.contains(t)) {
					prev = Math.min(prev, p.indexOf(t));
				}
			}
			if(prev != 13) {
				gem[prev].add(names.get(i));
				names.remove(i);
				i--;
			}
		}
		for(ArrayList a: gem) {
			Collections.sort(a);
			if(!a.isEmpty()) {
				for(int i = 0; i < a.size(); i++) {
					System.out.println(a.get(i));
				}
			}
			System.out.println(a);
		}
		Collections.sort(names);
		for(int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		
		
	}
}
