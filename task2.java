public class Main
{
	public static void main(String[] args) {
	    double c,f ;
	    System.out.println( 
			"Celsius    Fahrenheit     |     Fahrenheit     Celsius\n" +
			"----------------------------------------------------------");
		for (c = 20.0, f = 50.0; 
			  c <= 29.0; c++, f += 5) {
			System.out.printf("%.2f",c);
            System.out.printf("       %.2f",toFahrenheit(c));
            System.out.printf("               %.2f",f);
            System.out.printf("          %.2f\n",toCelsius(f));
		}
	}
		public static double toFahrenheit(double celsius) {
		return (9.0 / 5) * celsius + 32;
	}
	
	public static double toCelsius(double fahrenheit) {
		return (5.0 / 9) * (fahrenheit - 32);
	}
}
