import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class prob07 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input.txt"));
		while(true) {
			int a = in.nextInt();
			int b = in.nextInt();
			if(a == 0 && b ==0 ) break;
			a++;
			if(b == 0) {
				while(true) {
					if(a%2 == 0) {
						System.out.println(a);
						break;
					}
					a++;
				}
			} else if(b == 1) {
				while(true) {
					for(int i = 2; i < a/2; i++) {
						if(a%i == 0) {
							System.out.println(a);
							break;
						}
					}
					a++;
				}
			} else if(b == 2) {
				while(true) {
					double sqrt = Math.sqrt(a);
					if(sqrt == Math.floor(sqrt)) {
						System.out.println(a);
						break;
					}
					a++;
				}
			} else if(b == 3) {
				while(true) {
					double sqrt = Math.cbrt(a);
					if(sqrt == Math.floor(sqrt)) {
						System.out.println(a);
						break;
					}
					a++;
				}
			} 
		}
		
	}
}