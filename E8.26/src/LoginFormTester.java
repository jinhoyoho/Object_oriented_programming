
/**
   A class to test the LoginForm class.
*/
public class LoginFormTester
{
   /**
      Tests the methods of the LoginForm class.
      @param args not used
   */
   public static void main(String[] args)
   {
      LoginForm login = new LoginForm("admin", "admin123");

      login.input("test");
      login.input("test123");
      login.click("Submit");


      // Add your code to solve the problem here 
      
      login.click("Reset");

      login.input("admin");
      login.input("admin123");
      login.click("Submit");

       // Add your code to solve the problem here 
   }
}






