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



class Result {

    /*
     * Complete the 'sumSmallestInVisitedCells' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING rows_cols
     *  2. STRING array1
     *  3. STRING array2
     *  4. STRING array3
     */

    public static int sumSmallestInVisitedCells(String rows_cols, String array1, String array2, String array3) {
    	int[][] a1 = convert(rows_cols, array1);
    	int[][] a2 = convert(rows_cols, array2);
    	int[][] a3 = convert(rows_cols, array3);
    	StringTokenizer st = new StringTokenizer(rows_cols);
    	int row = Integer.parseInt(st.nextToken());
    	int column = Integer.parseInt(st.nextToken());
    	int i = 0, j = 0;
    	int ans = Math.min(a3[i][j],Math.min(a1[i][j], a2[i][j]));
    	while(i < row && j < column) {
    		if(i+1 == row || column == j+1) break;
    		TreeMap<Integer, pair> map = new TreeMap<Integer, pair>();
    		ArrayList<Integer> nums = new ArrayList<Integer>();
    		nums.add(a1[i+1][j]);
    		nums.add(a1[i][j+1]);
    		nums.add(a2[i+1][j]);
    		nums.add(a2[i][j+1]);
    		nums.add(a3[i+1][j]);
    		nums.add(a3[i][j+1]);
    		Collections.sort(nums);
    		map.put(a1[i+1][j], new pair(i+1, j));
    		map.put(a1[i][j+1], new pair(i, j+1));
    		map.put(a2[i+1][j], new pair(i+1, j));
    		map.put(a2[i][j+1], new pair(i, j+1));
    		map.put(a3[i+1][j], new pair(i+1, j));
    		map.put(a3[i][j+1], new pair(i, j+1));
    		//System.out.println(map.size());
    		if(nums.get(nums.size()-1) == nums.get(nums.size()-2)) {
    			
    			i++;
    			j++;
    			ans += Math.min(a3[i][j],Math.min(a1[i][j], a2[i][j]));
    			
    			continue;
    		} else {
    			i = map.get(map.lastKey()).a;
        		j = map.get(map.lastKey()).b;
    			ans += Math.min(a3[i][j],Math.min(a1[i][j], a2[i][j]));
    		}
    		
    	}
        return ans;
    }
    public static int[][] convert(String rc, String s) {
    	StringTokenizer st = new StringTokenizer(rc);
    	int row = Integer.parseInt(st.nextToken());
    	int column = Integer.parseInt(st.nextToken());
    	st = new StringTokenizer(s);
    	//System.out.println(s);
    	int[][] temp =new int[row][column];
    	for(int i = 0; i < row; i++) {
    		for(int j = 0; j < column; j++) {
    			temp[i][j] = Integer.parseInt(st.nextToken());
    		}
    	}
    		//System.out.println(Arrays.deepToString(temp));
    	return temp;
    }
    public static class pair {
		int a, b;
		public pair(int x, int y) {
			a = x;
			b = y;
		}
		public String toString() {
			return a + " " + b;
		}
	}
}
/*
4 2
31 17 24 19 15 29 22 26
25 13 25 18 19 27 19 13
12 15 17 18 29 16 25 20
 */
public class C3_2021 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String rows_cols = bufferedReader.readLine();

        String array1 = bufferedReader.readLine();

        String array2 = bufferedReader.readLine();

        String array3 = bufferedReader.readLine();

        int result = Result.sumSmallestInVisitedCells(rows_cols, array1, array2, array3);

        System.out.println(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
    }
}

