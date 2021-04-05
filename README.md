# Lecture Activity 11 - Instructions

In lecture activity 11, we will practice debugging in java, along with more method practice. If you run into issues, try debugging your program to see where you may be making a mistake.

**Note: You **must** use Eclipse for this Lecture Activity so you know how to use the Eclipse debugger - future courses in COSC will likely use Eclipse so it's important you get familiar with the debugger. You may also do this lecture activity again in VS Code optionally for a 10% bonus.**


## General instructions for creating Java files

For each of the following Tasks, create a separate Java file called task1.java, task2.java, task3.java etc... 

Remember, to create a new file, first navigate to this directory locally using `cd path/to/this/repo` and then type: `code task1.java`.
This will open a new file called `task1.java` in Visual Studio Code.
You can also work in Geany, or Eclipse, it's your choice.


```
public class task1 {

	public static void main(String[] args) {
	  // Enter your code
	}
  
}
```

Don't forget to change the name of the public class method for each file!

## Task 1: Java debugging

Do the Debugging tutorial from the lecture notes. Make sure you understand how the Eclipse debugging tool works. Use this tool whenever needed thereafter to identify any logic errors in your code. 

You don't have to upload a java file or add a screenshot for this task.

## Task 2: Tempurature tables

Write a class that contains two methods that convert from Celsius to Fahrenheit and vice-versa: 

```
public static double toFahrenheit(double celsius)
public static double toCelsius(double fahrenheit)
```
The formulas for the conversion are:
- fahrenheit = (9.0 / 5) * celsius + 32
- celsius = (5.0 / 9) * (fahrenheit - 32)

Write a test program that invokes these methods and displays the following result:

### Sample Run
```
Celsius    Fahrenheit  | Fahrenheit   Celsius
---------------------------------------------
20         68.00         50           10.00
21         69.80         55           12.78
22         71.60         60           15.56
23         73.40         65           18.33
24         75.20         70           21.11
25         77.00         75           23.89
26         78.80         80           26.67
27         80.60         85           29.44
28         82.40         90           32.22
29         84.20         95           35.00
```

## Task 3: Calender calculations
Write a class the has the following two methods:

```
public static boolean isLeapYear(int year) //determines whether a year is leap or not
public static int numberOfDaysInAYear(int year) // returns the number of days in a year.
```

A leap year is either (divisible by 4 but not by 100) or (divisible by 400). Use the isLeapYear method developed to implement numberOfDaysInAYear. Write a test program that displays the number of days in the years from 2000 to 2010. 

### Sample Run
```
2000 has 366
2001 has 365
2002 has 365
2003 has 365
2004 has 366
2005 has 365
2006 has 365
2007 has 365
2008 has 366
2009 has 365
2010 has 365
```

## Task 4: Creating Passwords

Some websites impose certain rules for passwords. Write a method that checks whether a string is a valid password. Suppose the password rules are as follows:
- A password must have at least eight characters.
- A password consists of only letters and digits.
- A password must contain at least two digits.

Write a program that prompts the user to enter a password and displays Valid if the rules are followed or Invalid otherwise. Your program should check the password using a method that has the following header:

```
public static boolean isValidPassword(String s)
```

### Sample Run

```
Enter a password: adf2
Invalid

Enter a password: adre32sd
Valid
```
 
## Task 5: Update your README file 

If you named your files as suggested above, you do not have to do anything in this section.
If you named your files differently, please update the links below to make sure they work.

[Task 2 Java file](./task2.java)

[Task 3 Java file](./task3.java)

[Task 4 Java file](./task4.java)
