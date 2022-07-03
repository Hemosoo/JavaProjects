import java.util.*;
import java.io.*;
public class fibpascal {
	public static void main(String[] args) {
		System.out.println(findOddEvenMax(8));
	}
	public static String findOddEvenMax(int fibNumber) {
		String ans = "";
		ArrayList<Integer> fib = new ArrayList<Integer>();
		fib.add(1);
		fib.add(1);
		int index = 0;
		int sum = 0;
		while(sum < Math.pow(2, 31)) {
			sum = fib.get(index) + fib.get(++index);
			if(sum != Math.abs(sum)) break;
			if(fibNumber == sum) {
				index = index+1;
				break;
			}
			fib.add(sum);
			
		}
		//System.out.println(fib);
 		ArrayList[] a = new ArrayList[index];
 		ArrayList<Integer> b = new ArrayList<Integer>();
 		for(int i = 0; i < index; i++) {
 			a[i] = new ArrayList<Integer>();
 		}
 		a[0].add(1);
 		a[0].add(1);
 		for(int i = 1; i < index; i++) {
 			a[i].add(1);
 			a[i].add(1);
 			for(int j = 0; j < a[i-1].size()-1; j++) {
 				int temp = (int) a[i-1].get(j) + (int) a[i-1].get(j+1);
 				a[i].add(1, temp);
 			}
 		}
 		for(int i = 0; i < index; i++) {
 			//System.out.println(a[i]);
 		}
 		for(int i = 0; i < index; i++) {
 			if(i>=a[index-i-1].size()) {
 				
 				break;
 			}
 			b.add((Integer) a[index-i-1].get(i));
 			//System.out.println((Integer) a[index-i-1].get(i));
 			if(b.get(b.size()-1) == 1 && i != 0) {
 				break;
 			}
 		}
 		//System.out.println(b);
 		int even = 0;
 		int odd = 0;
 		int max = 0;
 		for(int i = 0; i < b.size(); i++) {
 			if(b.get(i)%2 == 0) {
 				even++;
 			} else odd++;
 			max = Math.max(max, b.get(i));
 		}
 		ans += odd + " " + even + " " + max;
        return ans;
    }
}
