import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;




public class C1_2022 {
	public static String findTime(char c1, char c2, char c3, char c4, char c5) {
        DecimalFormat time = new DecimalFormat("00");
        int[] fib = {1, 1, 2, 3, 5};
        int hr = 0;
        int min = 0;
        char[] col = {c1, c2, c3, c4, c5};
        for(int i = 0; i < 5; i++) {
        	if(col[i] == 'B') {
        		hr+=fib[i];
        		min+=fib[i];
        	}
        	else if(col[i] == 'G') {
        		min+=fib[i];
        	} else if(col[i] == 'R') {
        		hr+=fib[i];
        	}
        	
        }
        min *= 5;
        
        //System.out.println(hr + ":" + min);
        if(Math.floor((min/60)) >= 1) {
        	hr += Math.floor(min/60);
        	min = min%60;
        }
        if(hr >= 13) {
        	hr = hr%12;
        }
        return time.format(hr) + ":" + time.format(min);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        

        char c1 = bufferedReader.readLine().charAt(0);

        char c2 = bufferedReader.readLine().charAt(0);

        char c3 = bufferedReader.readLine().charAt(0);

        char c4 = bufferedReader.readLine().charAt(0);

        char c5 = bufferedReader.readLine().charAt(0);

        String result = findTime(c1, c2, c3, c4, c5);

        System.out.println(result);

        bufferedReader.close();
    }
}
