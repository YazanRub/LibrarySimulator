import java.util.Scanner;
//This is a project about LibrarySimulator
public class LibrarySimulator {
    //Abdulrahman variables here


    //Yazzan variables here


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

boolean Running = true;
//This is loop for the main menu
while(Running){
    System.out.println("================================");
    System.out.println("Welcome to the library Simulator");
    System.out.println("================================");
    System.out.println("1-Select a user account");
    System.out.println("2-Login as Administrator ");
    System.out.println("3-Exit the program");
    int choice =input.nextInt();
    //This is the will take you to the user page
    if(choice==1) {
        System.out.println("1 ");

    }
    //This is the will take you to the Admin page

    else if(choice==2){
        System.out.println("2 ");

    }
    //this will close the loop
                else if(choice==3) {
        Running = false;
        System.out.println("Thanks for using our Library Simulator. Goodbye! ");
    }
                //if user enter an invalid choice
else{
                System.out.println("Invalid choice please try again");

            }

    }
//scanner closed
input.close();
}
    }
