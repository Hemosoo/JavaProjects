import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class prob15 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input.txt"));
		String[] gem = {"Lapis", "Topaz", "Tourmaline", "Sapphire", "Peridot", "Ruby", "Pearl", "Emerald", "Diamond", "Aquamarine", 
				"Amethyst", "Garnet"};
		ArrayList<String> p = new ArrayList<String>();
		while(in.hasNextLine()) {
			String line = in.nextLine();
			if(line.equals("END")) break;
			p.add(line);
		}
		ArrayList<String> sp = new ArrayList<String>();
		ArrayList<String> ans = new ArrayList<String>();
		for(int i = 0; i <p.size(); i++) {
			String pony = p.get(i);
			String[] temp = pony.split(" ");
			//System.out.println(Arrays.toString(temp));
			for(String s: temp) {
				System.out.println(s);
				for(int j = 0; j < gem.length; j++) {
					String s2 = gem[i];
					
					if(s.equals(s2)) {
						sp.add(p.get(i));
						p.remove(i);
					}
				}
			}
			
		}
		System.out.println(sp);
		System.out.println(p);
	}
}