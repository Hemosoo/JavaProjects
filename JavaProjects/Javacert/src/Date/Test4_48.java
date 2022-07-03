package Date;

import java.time.LocalDate;
public class Test4_48 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.parse("2018-06-06");
		date = date.minusDays(10);
		System.out.println(date);
	}
}
