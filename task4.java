import java.util.Scanner;

public class task4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter a password: ");
		String password = input.nextLine();

	   if (isValidPassword(password) == true)
	    System.out.println("Valid Password");
	   else
	    System.out.println("Invalid Password");
	}

	public static boolean isValidPassword(String password) {
		int length = 8;	
	    int number = 0;
	    boolean lettandnum = true ;
        for(int i = 0;i<password.length();i++){
            if (Character.isDigit(password.charAt(i))){
                number ++;
            }
            else 
            {
            }
        if ((password.charAt(i) >= 48 && password.charAt(i) <= 57) && (password.charAt(i) >= 97 && password.charAt(i) <= 122))
        {
            if (number== 0) {
            lettandnum = true;
            }
        }
        else{
            lettandnum = false;
        }
        }
          return lettandnum;
	}
}

