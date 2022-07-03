package Date;

import java.time.LocalDate;
public class Test4_52 {
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.parse("1980-03-16");
		LocalDate date2 = LocalDate.parse("1980-03-16");
		date1.withDayOfYear(29);
		System.out.println(date1.equals(date2) + " " + date1.isEqual(date2));
	}
}
