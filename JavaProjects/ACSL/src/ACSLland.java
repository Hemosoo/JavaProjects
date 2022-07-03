import java.io.*;
import java.text.DecimalFormat;
import java.util.*;



public class ACSLland{
	static int amg;
	static double pg;
	static int spd;
	static int[] dist = {450, 140, 120, 320, 250, 80};
    static class Result {
        public static String method1(String line) {   
        	
            String ans = "";
            //System.out.println((int)'A');
            String[] let = line.split(" ");
            double tDist = 0;
            int num1 = let[0].charAt(0)-65;
            int num2 = let[1].charAt(0)-65;
            for(int i = num1; i < num2; i++) {
            	tDist += dist[i];
            }
            
            //System.out.println(tDist);
            ans+=(int)tDist;
            DecimalFormat time = new DecimalFormat("00");
            DecimalFormat mon = new DecimalFormat("$00.00");
            int min = (int)(60*(tDist/spd))%60;
            int hrs = (int) Math.floor((tDist/spd));
            ans+= ", " + time.format(hrs) + ":" + time.format(min) + ", ";
            double price = (tDist/amg)*pg;
            ans+=mon.format(price);
            return ans;
        }
    }


    // TEST FILE NAME: input.txt
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new FileReader("input.txt"));    // TEST FILE NAME: input.txt
        amg = in.nextInt();
        pg = in.nextDouble();
        spd = in.nextInt();
        in.nextLine();
        for (int i = 0; i < 5; i++) {
            String result = Result.method1(in.nextLine().trim());    //result's data type may be changed.

            System.out.println(result);
        }

        in.close();
    }
}