package prog.poe;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Validations 
{
    Scanner sn = new Scanner(System.in);
    public boolean CheckUsername(String username)
    {
        boolean CheckUsern = false;
        if(username.contains("_") && username.length()<=5)
        {
            System.out.println("Username Succecfully Captured!\n");
            CheckUsern = true;
        }
        else
        {
            System.out.println("Username is not correctly formatted, please ensure that the username contains an underscore and is no more than 5 characters in length\n");
        }
        return CheckUsern;
    }
    public boolean CheckPassword(String password)
    {
        boolean correctFormat = false;
        String SpecialChar[] = {"@","#","!","$","%","&","*","-","_",">","<","?",":",";","(",")","'",","};
        int count = 0;
        while(count < SpecialChar.length)
        {
            if (password.contains(SpecialChar[count]))
            {
                correctFormat = true;
                count = SpecialChar.length;
            }
             count++;
           
        }
        return correctFormat;
    }
    
    public boolean CheckLength(String password)
    {
        boolean lng = false;
        if (password.length()>7)
        {
            lng = true;
        }
        return lng;
        
    }
    
    public boolean CheckCapitalLetter(String password)
    {
        boolean CapLetter = false;
        String CAPITAL[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        int count = 0;
        while (count < CAPITAL.length)
            {
            if (password.contains(CAPITAL[count]))
                {
                    CapLetter = true;
                    count = CAPITAL.length;
                }
            
            count++;
            }
            return CapLetter;
    }
    
    public boolean EasyKanban(int opt )
    {
        boolean kanban = false;
    System.out.println("\nWelcome to EasyKanban\n");
        
        
        System.out.println("Option 1) Add tasks");
        
        System.out.println("Option 2) Show results");
        
        System.out.println("Option 3) Quit\n");
        
        System.out.print("Choose an option(number) : ");
        
        int option;
        option = sn.nextInt();
        
        if(option == 1)
        {

        System.out.print("How many tasks do you want : ");
        int numTasks = sn.nextInt();
        sn.nextLine();

       
        String[] taskNames = new String[numTasks];
        int[] taskNumbers = new int[numTasks];
        String[] taskDescriptions = new String[numTasks];
        String[] Developerdetails = new String[numTasks];
        int[] taskDuration = new int[numTasks];
        String[] taskStatuses = new String[numTasks];
        String[] taskIds = new String[numTasks];

        for (int i = 0; i < numTasks; i++) 
        {
            System.out.println("\nEnter details for Task " + (i + 1) + ":");
            System.out.print("Task Name: ");
            taskNames[i] = sn.nextLine();

            System.out.print("Task Number: ");
            taskNumbers[i] = sn.nextInt();
            sn.nextLine(); 

            String description;
             {
                System.out.print("Task Description (less than 50 characters): ");
                description = sn.nextLine();
                if (description.length() > 50) 
                {
                    System.out.println("Description should be less than 50 characters.");
                }
             while (description.length() > 50)
             {
            taskDescriptions[i] = description;
             }
            System.out.print("Task Status : \n(1)To do\n(2)Done\n(3)doing \n Enter status(number) : ");
            taskStatuses[i] = sn.nextLine();
            
             }
        }

        System.out.println("\nTask Details:");
        for (int i = 0; i < numTasks; i++) {
            System.out.println("Task " + (i + 1) + ":");
            System.out.println("Name: " + taskNames[i]);
            System.out.println("Number: " + taskNumbers[i]);
            System.out.println("Description: " + taskDescriptions[i]);
            System.out.println("Task ID: " + taskIds[i]);
            System.out.println();
            
           taskIds[i] = taskNames[i].substring(0, 2).toUpperCase() + "-" + taskNames[i];
        }
       
    }

        
        if(option == 2)
        {
            System.out.println("\ncoming soon ");
            
        }
        if(option == 3)
        {
            System.out.println("\nGoodbye");
            System.exit(0);
        }
        return kanban;
    }
        
}
