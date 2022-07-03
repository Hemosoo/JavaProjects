import java.util.*;
import java.io.*;
public class SieveofEratosthenes {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int ch = (int) Math.sqrt(in.nextInt());
		 
		int n = ch+1;
		boolean isPrime[] = new boolean[n];
		isPrime[0] = isPrime[1] = false;
		 for (int i = 2; i < n; i++)
		 isPrime[i] = true;

		 for (int p = 2; p * p <= n; p++)
		 {
		 // If isPrime[p] is not changed,
		 // then it is a prime
		 if (isPrime[p] == true)
		 {
		 // Update all multiples of p
		 for (int i = p * p; i < n; i += p)
		 isPrime[i] = false;
		 }
		 }
		 
	}
	static boolean SieveOfEratosthenes(int n, boolean isPrime[])
	{
	 // Initialize all entries of boolean
	 // array as true. A value in isPrime[i]
	 // will finally be false if i is Not a prime, else true bool isPrime[n+1];
	 isPrime[0] = isPrime[1] = false;
	 for (int i = 2; i <= n; i++)
	 isPrime[i] = true;

	 for (int p = 2; p * p <= n; p++)
	 {
	 // If isPrime[p] is not changed,
	 // then it is a prime
	 if (isPrime[p] == true)
	 {
	 // Update all multiples of p
	 for (int i = p * p; i <= n; i += p)
	 isPrime[i] = false;
	 }
	 }
	 return false;
	}
}
