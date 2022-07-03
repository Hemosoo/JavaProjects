import java.util.*;
import java.io.*;
public class prob10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int left = 0;
		int right = 0;
		int pair = 0;
		boolean bal = true;
		Stack<String> stack = new Stack<String>();
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ')') {
				if(!stack.isEmpty() && stack.peek().equals("(")) {
						pair++;
						stack.pop();
				} else {
						bal = false;
				}
				
				right++;
			} else if(s.charAt(i) == '(') {
				left++;
				stack.add(s.charAt(i) + "");
			}
			
		}
		System.out.println("Total left: " + left);
		System.out.println("Total right: " + right);
		System.out.println("Total pairs: " + pair);
		if(bal && stack.isEmpty()) System.out.println("Balanced");
		else System.out.println("Unbalanced");
	}
}
