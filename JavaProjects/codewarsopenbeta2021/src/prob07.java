import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class prob07 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input.txt"));
		int lonely = 0;
		int dup = 0;
		int noC = 0;
		int a = in.nextInt();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < a; i++) {
			String name = in.next();
			int id = in.nextInt();
			if(id == 0) noC++;
			if(name.equals("Lonely")) lonely++;
			if(map.containsKey(id)) {
				map.put(id, map.get(id)+1);
			} else {
				map.put(id, 1);
			}
		}
		for(int i: map.keySet()) {
			if(i ==0 ) continue;
			if(map.get(i) > 1) {
				dup++;
			}
		}
		System.out.println("Lonely Cubes: " + lonely);
		System.out.println("Duplicate Cube Assignments: " + dup);
		System.out.print("Test Subjects without Cubes: " + noC);
	}
}