import java.util.*;
import java.io.*;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class prob21 {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String[] sp = s.split("-");
		int y = Integer.parseInt(sp[0]);
		int m = Integer.parseInt(sp[1]);
		int day = Integer.parseInt(sp[2]);
		//System.out.println(y);
		//System.out.println(m);
		DateFormatSymbols dfs = new DateFormatSymbols();
		String[] months = dfs.getMonths();
		
		String z = "";
		HashMap<Integer, String> zod = new HashMap<Integer, String>();
		zod.put(1, "Capricorn Aquarius");
		zod.put(2, "Aquarius Pisces");
		zod.put(3, "Pisces Aries");
		zod.put(4, "Aries Taurus");
		zod.put(5, "Taurus Gemini");
		zod.put(6, "Gemini Cancer");
		zod.put(7, "Cancer Leo");
		zod.put(8, "Leo Virgo");
		zod.put(9, "Virgo Libra");
		zod.put(10, "Libra Scorpio");
		zod.put(11, "Scorpio Sagittarius");
		zod.put(12, "Sagittarius Capricorn");
		int[] nums = {19, 18, 20, 19, 20, 20, 22, 22, 22, 22, 21, 21};
		if(day<=nums[m-1]) {
			z = zod.get(m).split(" ")[0];
		} else {
			z = zod.get(m).split(" ")[1];
		}
				
		HashMap<Integer, String> ch = new HashMap<Integer, String>();
		ch.put(2008, "Rat");
		ch.put(2009, "Ox");
		ch.put(2010, "Tiger");
		ch.put(2011, "Rabbit");
		ch.put(2012, "Dragon");
		ch.put(2013, "Snake");
		ch.put(2014, "Horse");
		ch.put(2015, "Sheep");
		ch.put(2016, "Monkey");
		ch.put(2017, "Rooster");
		ch.put(2018, "Dog");
		ch.put(2019, "Pig");
		String chinese = "";
		for(int i: ch.keySet()) {
			if(i%12 == y%12) {
				chinese = ch.get(i);
			}
		}
		System.out.println("If you were born on " + months[m-1] + " " + day + ", your sign is " + z + ".");
		System.out.println(y + " is the year of the " + chinese);
	}
}
