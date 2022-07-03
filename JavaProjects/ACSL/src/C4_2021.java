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



class C4_2021 {

    /*
     * Complete the 'sumPathsOfLength2' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING edges as parameter.
     */

    public static int sumPathsOfLength2(String edges) {
    	StringTokenizer st = new StringTokenizer(edges);
    	HashSet<Integer> ans = new HashSet<Integer>();
    	ArrayList<Integer>[] a = new ArrayList[9];
    	for(int i = 0; i < 9; i++) {
    		a[i] = new ArrayList<Integer>();
    	}
    	while(st.hasMoreTokens()) {
    		String t = st.nextToken();
    		a[Integer.parseInt(t.substring(0, 1))-1].add(Integer.parseInt(t.substring(1))-1);
    	}
    	for(int i = 0; i < a.length; i++) {

    		for(int j = 0; j < a[i].size(); j++) {
    			String temp = "";
    			temp += (i+1);
    			temp+= (a[i].get(j)+1);
    			if(temp.charAt(0) == temp.charAt(1)) continue;
    			for(int l = 0; l < a[a[i].get(j)].size(); l++) {
    				if(Integer.parseInt(temp.charAt(0)+"") == (a[a[i].get(j)].get(l)+1) || Integer.parseInt(temp.charAt(1)+"") == (a[a[i].get(j)].get(l)+1)) {
    					continue;
    				}
    				ans.add(Integer.parseInt((temp+(a[a[i].get(j)].get(l)+1))));
    			}
    			
    		}
    	}
    	/*for(int i = 0; i < 9; i++) {
    		System.out.println(a[i]);
    	}*/
    	int ans2 = 0;
    	for(int i: ans) {
    		ans2+=i;
    	}
    	//System.out.println(ans);
    	//System.out.println();
    	
    	return ans2;
    }




    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String edges = bufferedReader.readLine();

        int result = sumPathsOfLength2(edges);

        System.out.println((String.valueOf(result)));
    }
}
