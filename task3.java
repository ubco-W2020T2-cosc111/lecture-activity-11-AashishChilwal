public class task3 {
	public static void main(String[] args) {
		for (int year = 2000; year <= 2010; year++) {
			System.out.println(year + " has " + numberOfDaysInAYear(year));
		}
	}
		public static boolean isLeapYear(int year) {
		return (year % 4 == 0&&year % 100 != 0) || (year % 400 == 0);
	}
	public static int numberOfDaysInAYear(int year){
		if (isLeapYear(year) == true)
			return 366;
		else
			return 365;
	}
}
