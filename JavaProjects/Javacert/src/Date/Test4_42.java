package Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
public class Test4_42 {
	public static void main(String[] args) {
		String date = LocalDate .parse("2014-05-04") .format(DateTimeFormatter.ISO_DATE_TIME);         System.out.println(date);
}
}
