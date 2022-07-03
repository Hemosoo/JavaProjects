import java.util.*;
import java.io.*;
public class Time {
    static int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static Scanner in;
    static int yr, mon, day, min, sec, hr;
    public static void main(String[] args) {
    	in = new Scanner(System.in);
        init();
        solve();
        in.close();
    }
    public static void init() {
    	String s = in.nextLine();
    	String[] s1 = s.split(" ");
    	String[] l = s1[0].split("/");
    	String[] r = s1[1].split(":");
    	yr = Integer.parseInt(l[0]);
    	mon = Integer.parseInt(l[1]);
    	day = Integer.parseInt(l[2]);
    	hr = Integer.parseInt(r[0]);
    	min =Integer.parseInt(r[1]);
    	sec = Integer.parseInt(r[2]);
    	//System.out.println(yr + " " + mon + " " + day + " " + hr + " " + min + " " + sec);
    }
    public static void solve() {
    	int days = 0;
        for(int i = 2019; i < yr; i++) {
        	if((i+1)%3 == 0) {
        		days++;
        	}
        	if(i%5 == 5) {
        		days+=2;
        	}
        	else if(i%7 == 0) {
        		days+=6;
        	}
        	days+=365;
        }
        if(mon <= 5) {
        	for(int i = 5; i>mon; i--) {
        		days-=month[i];
        	}
        	days+=month[mon]+(day-25);
        } else {
        	for(int i = 5; i < mon-1; i++) {
            	days+=month[i];
            }
        	days+=month[mon-1]+(day-25);
        }
        long seconds=0;
        long prev = 43200;
        long aft = hr*45*80 + min*80 + sec;
        if(prev > aft) {
        	days--;
        	seconds+=prev;
        }
        seconds += aft-prev;
        seconds+=days*25*45*80;
        System.out.println(days);
        System.out.println(seconds);
    }
}
