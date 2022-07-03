import java.util.*;
import java.io.*;
public class prob03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>();
		//String line = in.nextLine();
		while(in.hasNextLine()) {
			//System.out.println("y");
			arr.add(in.nextLine());
		}
		for(int i = 0; i < arr.size(); i++) {
			for(int j = 0; j < arr.get(i).length(); j++) {
				if(arr.get(i).charAt(j) == 'P') {
					System.out.println("Ace, move fast, pigeon is at (" + j +", " + i + ")" );
					return;
				}
			}
		}
		System.out.println("No pigeon, try another map, Ace");
		in.close();
	}
}
