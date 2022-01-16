package email;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class emailval 
{
public static boolean isVal(String email1)
{
	String regex = "^(.+)@(.+)$";
	Pattern pattern = Pattern.compile(regex);
	Matcher matcher = pattern.matcher(email1);
	return matcher.matches();
}
public static void main(String[] args)
{
	List<String> emails = new ArrayList<String>();
	emails.add("priya@123.com");
	emails.add("riya@123.com");
	emails.add("bro.hdl.org");
 for (String value : emails) 
 { 
		 System.out.println("The Email address " + value + " is " +  (isVal(value) ? "valid" : "invalid")); 
	 } 
	  
	 System.out.println("Enter any email address to check");  Scanner sc = new Scanner(System.in); 
	 String input = sc.nextLine(); 
	 System.out.println("The Email address " + input + " is " +  (isVal(input) ? "valid" : "invalid")); 
	  
	 } 

}

