import java.util.*;
import java.io.*;
public class prob22 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<String> name = new ArrayList<String>();
		ArrayList<String> country = new ArrayList<String>();
		HashMap<String, String> names = new HashMap<String, String>();
		HashMap<String, String> countries = new HashMap<String, String>();
		while(true) {
			String s = in.nextLine();
			if(s.equals("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")) break;
			name.add(s);
			
		}
		while(in.hasNextLine()) {
			country.add(in.nextLine());
		}
		for(int i = 0; i < name.size(); i++) {
			String[] s = name.get(i).split("\\|");
			//names.put(s[0], s[1].split(""))
		}
	}
}
