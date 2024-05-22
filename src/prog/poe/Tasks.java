
package prog.poe;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Tasks 
{
    Scanner sn = new Scanner(System.in);
    
    public boolean EasyKanban()
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
        String[] taskDeveloper = new String[numTasks];
        String[] taskDescriptions = new String[numTasks];
        int[] taskDuration = new int[numTasks];
        String[] taskStatuses = new String[numTasks];
        String[] taskIds = new String[numTasks];

        for (int i = 0; i < numTasks; i++) 
        {
            System.out.println("\nEnter details for Task " + (i + 1) + ":");
            System.out.print("Task Name: ");
            taskNames[i] = sn.next();
            sn.nextLine();

            System.out.print("Task Number: ");
            taskNumbers[i] = sn.nextInt();
            sn.nextLine(); 

                System.out.print("Task Description (less than 50 characters): ");
                taskDescriptions[i] = sn.nextLine();
                
                if (taskDescriptions[i].length() > 50) 
                {
                    System.out.println("Description should be less than 50 characters.");
                }
                while (taskDescriptions[i].length() > 50)
                {
                   taskDescriptions[i] = taskDescriptions[i]+1;
                }
                
                System.out.print("Task Status : \t\n(1)To do\t\n(2)Done\t\n(3)doing\t\n Enter status(number) : ");
                taskStatuses[i] = sn.next();
                
                System.out.println("");
                System.out.print("Developer Details");
                System.out.println("");
                System.out.print("Enter Name : ");
                taskDeveloper[i] = sn.next();

                System.out.print("How many hours will you be doing this task for task for : ");
                taskDuration[i] = sn.nextInt();
            
            System.out.println("\t\nTask Details:");
            System.out.println("");
            
            for(int f = 0; f < numTasks; f++) 
            {

                System.out.println("Task " + (i + 1) + "'s Details :");
                System.out.println("Name: " + taskNames[i]);
                System.out.println("Number: " + taskNumbers[i]);
                System.out.println("Description: " + taskDescriptions[i]);
                System.out.println("Developer Details: " + taskDeveloper[i] );
                System.out.println("Task Duration: " + taskDuration[i] + "hour(s)");
                System.out.println("Task ID: " + taskIds[i]);
                System.out.println("Task Status: " + taskStatuses[i]);
                System.out.println();

               taskIds[i] = taskNames[i].substring(0, 2).toUpperCase() + ":" + taskNumbers[i] + ":" + taskDeveloper[i].substring(taskDeveloper[i].length() - 3).toUpperCase() ;
            }
                      
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
        System.out.println("Thanks for using EasyKanban, bye!!!");  
        
        return kanban;
    }
        
}
