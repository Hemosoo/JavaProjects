public class StringAPI {

	public static void main(String[] args) {


		String s = "HELLO HELLO HELLO";  
		
		s = s.replace("HE", "");	//LLO LLO LLO
		
		s = "abc123%%.$.hfgdh";
		
		s = s.replaceAll("[^a-z^0-9]", "");	//abc123hfgdh
		
		System.out.println(s);
		
		
		String a = "ZZZ";
		String b = "ZZZ";
		
		if(a.compareTo(b) < 0) System.out.println(a +" is smaller than "+ b);
		else if(a.compareTo(b) > 0) System.out.println(b +" is smaller than "+ a);
		else System.out.println(a +" is same as "+b);
		
		System.out.println(a.compareTo(b));		
	}
}