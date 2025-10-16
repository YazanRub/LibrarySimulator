import java.util.Scanner;
public class LibrarySimulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

boolean Running = true;
while(Running){
    System.out.println("================================");
    System.out.println("Welcome to the library Simulator");
    System.out.println("================================");
    System.out.println("1-Select a user account");
    System.out.println("2-Login as Administrator ");
    System.out.println("3-Exit the program");
    int choice =input.nextInt();
    if(choice==1) {
        System.out.println("1 ");

    } else if(choice==2){
        System.out.println("2 ");

    }
                else if(choice==3) {
        Running = false;
        System.out.println("Thanks for using our Library Simulator. Goodbye! ");
    }
else{
                System.out.println("Invalid choice please try again");

            }

    }
}
    }
