import java.util.*;
import java.io.*;
public class prob10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		
		for(int i = 0; i < n; i++) {
			String line = in.nextLine();
			palindrome(line);
		}
	}
	static void palindrome(String line) {
		ArrayList<String> p = new ArrayList<String>();
		ArrayList<String> sh = new ArrayList<String>();
		int max = 0;
		for(int i = 0; i < line.length(); i++) {
			for(int j = i; j < line.length()+1; j++) {
				//System.out.println(line.substring(i, j));
				String s = line.substring(i, j);
				
				String t = ""; 
				for(int k = 0; k < s.length(); k++) {
					if(Character.isAlphabetic(s.charAt(k)) || Character.isDigit(s.charAt(k))) {
						t += (s.charAt(k) +"");
					}
				}
				if(t.length() <= 1) continue;
				if(!Character.isAlphabetic(s.charAt(0)) && !Character.isDigit(s.charAt(0))) continue;
				if(isPalindrome(t.toLowerCase()) && max < t.strip().length()) {
					
					boolean there = false;
					for(int k = 0; k < p.size(); k++) {
						if(sh.get(k).equals(t)) {
							there = true;
						}
					}
					if(!there) {
						p.add(s);
						sh.add(t);
						max = s.length();
					}
					//.System.out.println(sh);
				}
			}
		}
		if(p.size() == 0) {
			System.out.println("NO PALINDROME");
		} else {
			System.out.println(p.get(p.size()-1).strip());
		}
		
	}
	static boolean isPalindrome(String str)
    {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }
}
/*


4
HANNAH's RADAR LASER NAAN GRILL
PALINDROMES ARE FUN
A NUT? FOR A JAR OF TUNA!
A ham a yam a can of spam bananama



*/