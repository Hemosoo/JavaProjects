
public class fastgcd {
	static int gcd_e(int a, int b) {
		if(b == 0) {
			return a;
		}
		else return gcd_e(b, a%b);
	}
}
