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
            }}
        for(int i = 0;i<password.length();i++){
        if (Character.isLetterOrDigit(password.charAt(i)))
        {

            lettandnum = true;

        }
        else{
            lettandnum = false;
        }
        }
	      if (lettandnum==true &&(number>=2&&password.length()>=length))
                return lettandnum = true;
          else
                return lettandnum = false;
	}
}
