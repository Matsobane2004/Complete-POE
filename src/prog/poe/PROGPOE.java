package prog.poe;
import java.util.Scanner;

public class PROGPOE 
{

    public static void main(String[] args) 
    {
       Scanner sn = new Scanner(System.in);
      // Login lgn = new Login();
       
       Tasks tsk = new Tasks();
       /*
       String FirstName;
       String LastName;
       String username;
       String password;
      
       boolean usrn;
       boolean spChar;
       boolean passlng;
       boolean capLr;
       
       usrn = false;
       spChar = false;
       passlng = false;
       capLr = false;

       System.out.println("\tREGISTER\n");
        
       System.out.print("Enter your first name : ");
       FirstName = sn.next();
       
       System.out.print("Enter your last name : ");
       LastName = sn.next();
       
       while(usrn == false )
       {
        System.out.print("\nEnter Username : ");
        username = sn.next();
        
        usrn = lgn.CheckUsername(username);
       }
       
       while(spChar == false || passlng == false || capLr == false)
       {
        System.out.print("Enter Password : ");
        password = sn.next();
       
        spChar = lgn.CheckPassword(password);
        passlng = lgn.CheckLength(password);
        capLr = lgn.CheckCapitalLetter(password);
        
            if(spChar == false)
            {
                System.out.println("\nPASSWORD MUST CONTAIN AT LEAST ONE SPECIAL CHARACTER!!");
            }
            
            if(passlng == false)
            {
            System.out.println("PASSWORD SHOULD BE AT LEAST 7 CHARACTERS LONG!!");
            }
             
            if(capLr == false)
            {
            System.out.println("PASSWORD MUST CONTAIN AT LEAST ONE CAPITAL LETTER CHARACTER!!\n");
            }
    
       }
       if(usrn == true && spChar == true && passlng == true && capLr == true)
        {
            System.out.println("Password succefully saved!!\n");
            
            System.out.println("\tLOGIN\n");
        
            System.out.print("Enter your login Username : ");
            String logusr = sn.next();
            System.out.print("Enter your login Password : ");
            String logpass = sn.next();
            
            System.out.println("\nWelcome back "+ FirstName + " " + LastName + ","+ "it is great to see you again!");
       
            */
            
       //////////PART 2 STARTS HERE!!!!!!////////
            
        boolean KB;
        KB = tsk.EasyKanban();
       // } 
           

        
        
    }
}
