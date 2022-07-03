import java.util.*;
public class C1_2021 {
	static int s, d, r;
	static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		s =Integer.parseInt(in.next() ,8);
		d =Integer.parseInt(in.next() ,8);
		r =in.nextInt();
		int sum = 0;
        int last = s;
        System.out.println(last);
        for(int i = 1; i < r; i++) {
            last += d*i;
        }
       System.out.println(last);
        String a = Integer.toOctalString(last);
        System.out.println(a);
        for(int i = 1; i < r; i++) {
        	last += d;
        	a += Integer.toOctalString(last);
        }
        System.out.println(a);
        for(int i = 0; i < a.length(); i++) {
        	sum += Integer.parseInt(a.substring(i, i+1));
        }
        System.out.println(sum);
       }
}

