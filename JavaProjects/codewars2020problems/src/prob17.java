import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class prob17 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input.txt"));
		
		int a = in.nextInt();
		ArrayList<String>[] adj = new ArrayList[a];
		ArrayList<String> c = new ArrayList<String>();
		for(int i = 0; i < a; i++) {
			c.add(in.next());
			adj[i] = new ArrayList<String>();
		}
		in.nextLine();
		for(int i = 0; i < a; i++) {
			String s = in.nextLine();
			//System.out.println(s);
			String[] arr = s.split(" ");
			boolean y = false;
			String first = "";
			String second = "";
			for(int j = 0; j < arr.length; j++) {
				if(y == true) {
					if(first == "") {
						first = arr[j];
					} else second = arr[j];
					y = false;
				} if(arr[j].equals("City")) y = true;
			}
			//System.out.println(first + " "+ second);
			adj[c.indexOf(first)].add(second);
			adj[c.indexOf(second)].add(first);
		}
		for(int i = 0; i < adj.length; i++) {
			ArrayList<String> arr = adj[i];
			if(arr.size() == 0) {
				System.out.println("City " + c.get(i) + " is remote and has no neighbours!");
				continue;
			}
			System.out.print("City " + c.get(i) + " is neighbour to Cities ");
			boolean first = true;
			for(int j = 0; j < c.size(); j++) {
				
				if(arr.contains(c.get(j))) {
					if(first) {
						System.out.print(arr.get(arr.indexOf(c.get(j))));
						first = false;
					}
					
					else System.out.print(","+ arr.get(arr.indexOf(c.get(j))));
					
				}
				
			}
			System.out.println();
			//System.out.println(arr);
		}
	}
}