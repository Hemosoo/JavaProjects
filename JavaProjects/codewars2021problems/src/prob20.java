import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;

public class prob20 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input.txt"));
		TreeMap<String, Integer> tmap = 
                new TreeMap<String, Integer>();
		int n = in.nextInt();
		for(int i = 0; i < n; i++) {
			tmap.put(in.next(), in.nextInt());
		}
		System.out.println(tmap);
	}
}
