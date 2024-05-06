package sit707_tasks;

public class DateUtil {

	private static String[] MONTHS = new String[] {
			"January", "February", "March", "April", "May", "June", 
			"July", "August", "September", "October", "November", "December"
	};
	
	private int day, month, year;
	
	public DateUtil(int day, int month, int year) {
		// Is supplied day/month/year a valid date?
		if (day < 1 || day > 31)
			throw new RuntimeException("Invalid day: " + day + ", expected range 1-31");
		if (month < 1 || month > 12)
			throw new RuntimeException("Invalid month: " + month + ", expected range 1-12");
		if (year < 1700 || year > 2024)
			throw new RuntimeException("Invalid year: " + year + ", expected range 1700-2024");
		if (day > monthDuration(month, year))
			throw new RuntimeException("Invalid day: " + day + ", max day: " + monthDuration(month, year));
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}
	
	
	public void increment() {
		if (day < monthDuration(month, year)) {
			day++;
		} else if (month < 12) {
			day = 1;
			month++;
		} else {
			day = 1;
			month = 1;
			year++;
		}
	}
	

	public void decrement() {
		if (day > 1) {
			day--;
		} else if (month > 1) {
			month--;
			day = monthDuration(month, year);
		} else {
			month = 12;
			year--;
			day = monthDuration(month, year);
		}
	}
	
	
	public static int monthDuration(int month, int year) {		
		if (month == 2 && year % 4 == 0) {
			return 29;			
		} else if (month == 2) {  
			return 28;
			
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			return 30;			
		}
		return 31;
	}
	
	
	public String toString() {
		return day + " " + MONTHS[month - 1] + " " + year;
	}
	
}
