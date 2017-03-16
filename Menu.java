import java.util.ArrayList;
import java.util.Scanner;

public class Menu 
{
    public static void main(String[] args) 
    {   
        ArrayList<Customer> customers = new ArrayList<Customer>();  
        boolean turnedOn = true;
        while (turnedOn)
        {
            switch(showMainMenu())
            {
                case 1: 
                    showCustomerMenuFor(insertCardNr());
                    break;
                case 2:
                    showRegisterMenu();
                    break;
                case 3:
                    turnedOn = false;
                    break;
            }
        }
    }



    public static int showMainMenu()
    {
        int choice = 0;
        
        while(choice != 1 && choice != 2 && choice != 3)
        {
            System.out.println("-----------Main Menu----------");
            System.out.println("--- Please insert washcard ---");
            System.out.println("1. [insert washcard]");
            System.out.println("2. Register new account.");
            System.out.println("3. Shutdown system");
            choice = getInput();
        }
        return choice;
    }

    private static void showRegisterMenu()
    {
        System.out.println("Registered yo!!");
        waitForEnter();
    }

    private static int insertCardNr()
    {
        System.out.println("Du valgte kort 1");
        waitForEnter();    
        return 1;
    }

    private static void showCustomerMenuFor(int cardNr)
    {
        System.out.println("hej bruger med card number " + cardNr);
        waitForEnter();
    }

    private static int getInput()
    {
        Scanner input = new Scanner(System.in);                     
        int numberToReturn = input.nextInt();
        input.nextLine(); //fanger den nye linie der kommer ved et entertryk
        return numberToReturn;
    }
    private static void waitForEnter()
    {
        Scanner input = new Scanner(System.in);                     
        input.nextLine(); //fanger den nye linie der kommer ved et entertryk
        
    }
}
