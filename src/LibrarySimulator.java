import java.util.Scanner;
//This is a project about LibrarySimulator
public class LibrarySimulator {

    public static void main(String[] args) {

        //Abdulrahman variables here
        // The info first Account
        int ID_num1 = 1011223344;
        String NameAccount1 = "Omar";
        int Books_Currently_Borrowed1 = 3;


        // The info for Account number 2
        int ID_num2 = 1219235384;
        String NameAccount2 = "Laila";
        int Books_Currently_Borrowed2 = 1;
        // The info for Account number 3
        int ID_num3 = 1352226662;
        String NameAccount3 = "Adam";
        int Books_Currently_Borrowed3 = 4;

        int Number_of_books_returned = 0;



        //Yazzan variables here

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
                //Abdulrahman variables here
                boolean Running_User_Page = true;
                int Books_borrowed_count = 0;
                 Number_of_books_returned = 0;
                double system_charges_per_borrowed_book = 0.0;

                // this will make a menu for the user for all the accounts then he will select one of them
                System.out.println("Select Your Account: ");
                System.out.println("_______________________________________________");
                System.out.printf("ID\t\tName\t\tBooksCurrently Borrowed : \n");
                System.out.println("1-\t" + ID_num1 + "\t" + NameAccount1 + "\t" + Books_Currently_Borrowed1);
                System.out.println("2- \t" + ID_num2 + "\t" + NameAccount2 + "\t" + Books_Currently_Borrowed2);
                System.out.println("3-\t" + ID_num3 + "\t" + NameAccount3 + "\t" + Books_Currently_Borrowed3);
                System.out.println("_______________________________________________");

                int userChoice = input.nextInt();

                // if the user select the first account will go here
                if (userChoice == 1) {

                    //to run the user page
                    while (Running_User_Page) {

                        //The user will be shown the options that can be done
                        System.out.println("Choose form the following: ");
                        System.out.println("1- View Borrowed Books Count ");
                        System.out.println("2- Borrow Book ");
                        System.out.println("3- Return Book");
                        System.out.println("4- View Session Summary ");
                        System.out.println("5- Exit to Main Menu ");

                        // The variable is choice for user page
                        int choice_U_P = input.nextInt();


                        switch (choice_U_P) {
                            //this is the first option
                            case 1:
                                System.out.println("The number of books you have is: " + Books_Currently_Borrowed1);
                                break;

                            //this is the second option
                            case 2:
                                if (Books_Currently_Borrowed1 < 5) {
                                    System.out.println("The system charges a 0.50 credit fee per borrowed book.");
                                    System.out.println("Choose Frome The Following books to borrows: ");
                                    System.out.println("1- Rich Dad Poor Dad");
                                    System.out.println("2- The 7 Habits of Highly Effective People");
                                    System.out.println("3- The Power of Habit");
                                    System.out.println("4- The Psychology of Money");
                                    System.out.println("5- Start with Why");

                                    int choice_Books_borrowed_count = input.nextInt();

                                    ++Books_borrowed_count;
                                    ++Books_Currently_Borrowed1;

                                    system_charges_per_borrowed_book += 0.50;

                                } else {
                                    System.out.println(" cannot borrow more than 5 books ");
                                }

                                break;

                            //this third option
                            case 3:
                                if (Books_Currently_Borrowed1 >= 1) {
                                    System.out.println("There is no fee for Returning books");


                                    --Books_Currently_Borrowed1;

                                    ++Number_of_books_returned;
                                } else
                                    System.out.println("You have no book to Return");
                                break;
                            //This is the fourth option
                            case 4:
                                System.out.println("This is the Session Summary: ");

                                System.out.println("Number of books borrowed: " + Books_borrowed_count);
                                System.out.println("Number of books returned: " + Number_of_books_returned);
                                System.out.printf("Total fees incurred during the session: %.2f \n" , system_charges_per_borrowed_book);
                                break;

                            // This is the option  number 5
                            case 5:
                                Running_User_Page = false;
                                break;

                            default:
                                System.out.println("Somthing went wrong...! Pick number form the lits: ");
                        }

                    }


                }
                // this is for the second user
                else if (userChoice == 2) {
                    while (Running_User_Page) {

                        System.out.println("Choose form the following: ");
                        System.out.println("1- View Borrowed Books Count ");
                        System.out.println("2- Borrow Book ");
                        System.out.println("3- Return Book");
                        System.out.println("4- View Session Summary ");
                        System.out.println("5- Exit to Main Menu ");

                        // The variable is choice for user page
                        int choice_U_P = input.nextInt();


                        switch (choice_U_P) {
                            case 1:
                                System.out.println("The number of books you have is: " + Books_Currently_Borrowed2);
                                break;
                            case 2:
                                if (Books_Currently_Borrowed2 < 5) {
                                    System.out.println("The system charges a 0.50 credit fee per borrowed book.");
                                    System.out.println("Choose Frome The Following books to borrows: ");
                                    System.out.println("1- Rich Dad Poor Dad");
                                    System.out.println("2- The 7 Habits of Highly Effective People");
                                    System.out.println("3- The Power of Habit");
                                    System.out.println("4- The Psychology of Money");
                                    System.out.println("5- Start with Why");

                                    int choice_Books_borrowed_count = input.nextInt();

                                    ++Books_borrowed_count;
                                    ++Books_Currently_Borrowed2;

                                    system_charges_per_borrowed_book += 0.50;

                                } else {
                                    System.out.println(" cannot borrow more than 5 books ");
                                }

                                break;

                            case 3:
                                if (Books_Currently_Borrowed2 >= 1) {
                                    System.out.println("There is no fee for Returning books");

                                    --Books_Currently_Borrowed2;

                                    ++Number_of_books_returned;
                                } else
                                    System.out.println("You have no book to Return");
                                break;

                            case 4:
                                System.out.println("This is the Session Summary: ");

                                System.out.println("Number of books borrowed: " + Books_borrowed_count);
                                System.out.println("Number of books returned: " + Number_of_books_returned);
                                System.out.printf("Total fees incurred during the session: %.2f \n" , system_charges_per_borrowed_book);
                                break;

                            case 5:
                                Running_User_Page = false;
                                break;

                            default:
                                System.out.println("Somthing went wrong...! Pick number form the lits: ");
                        }

                    }
                }
                // this is for the user number 3
                else if (userChoice == 3) {
                    while (Running_User_Page) {

                        System.out.println("Choose form the following: ");
                        System.out.println("1- View Borrowed Books Count ");
                        System.out.println("2- Borrow Book ");
                        System.out.println("3- Return Book");
                        System.out.println("4- View Session Summary ");
                        System.out.println("5- Exit to Main Menu ");

                        // The variable is choice for user page
                        int choice_U_P = input.nextInt();


                        switch (choice_U_P) {
                            case 1:
                                System.out.println("The number of books you have is: " + Books_Currently_Borrowed3);
                                break;
                            case 2:
                                if (Books_Currently_Borrowed3 < 5) {
                                    System.out.println("The system charges a 0.50 credit fee per borrowed book.");
                                    System.out.println("Choose Frome The Following books to borrows: ");
                                    System.out.println("1- Rich Dad Poor Dad");
                                    System.out.println("2- The 7 Habits of Highly Effective People");
                                    System.out.println("3- The Power of Habit");
                                    System.out.println("4- The Psychology of Money");
                                    System.out.println("5- Start with Why");

                                    int choice_Books_borrowed_count = input.nextInt();

                                    ++Books_borrowed_count;
                                    ++Books_Currently_Borrowed3;

                                    system_charges_per_borrowed_book += 0.50;

                                } else {
                                    System.out.println(" cannot borrow more than 5 books ");
                                }

                                break;

                            case 3:
                                if (Books_Currently_Borrowed3 >= 1) {
                                    System.out.println("There is no fee for Returning books");

                                    --Books_Currently_Borrowed3;

                                    ++Number_of_books_returned;
                                } else
                                    System.out.println("You have no book to Return");
                                break;

                            case 4:
                                System.out.println("This is the Session Summary: ");

                                System.out.println("Number of books borrowed: " + Books_borrowed_count);
                                System.out.println("Number of books returned: " + Number_of_books_returned);
                                System.out.printf("Total fees incurred during the session: %.2f \n" , system_charges_per_borrowed_book);
                                break;

                            case 5:
                                Running_User_Page = false;
                                break;

                            default:
                                System.out.println("Somthing went wrong...! Pick number form the lits: ");
                        }

                    }

                }
                else {
                    System.out.println("Somthing went wrong...! Pick number form the lits: ");
                }
            }
            //This is the will take you to the Admin page

            else if(choice==2){
                int total_borrowed_books = Books_Currently_Borrowed1+Books_Currently_Borrowed2+Books_Currently_Borrowed3; //this will count all borrowed books
                int total_returned_books = Number_of_books_returned; //this will count all returned books
                boolean process = true;
                while (process) {
                    System.out.println("======================");
                    System.out.println("press 1 to view the total revenue");
                    System.out.println("======================");
                    System.out.println("press 2 to see the most frequent operation");
                    System.out.println("======================");
                    System.out.println("press 3 to exit to the main menu");
                    System.out.println("======================");

                    int number = input.nextInt();

                    if (number==1) {
                        System.out.print(total_borrowed_books*0.5); //will count the borrow fees for all users
                    } else if (number==2) {
                        if (total_borrowed_books>total_returned_books){
                            System.out.println("most books are borrowed");
                        }
                        else if (total_borrowed_books<total_returned_books){
                            System.out.println("most books are returned");
                        }
                        else{
                            System.out.println("books are equally borrowed and returned");
                        }

                    } else if (number==3) {
                        process = false;
                        System.out.println("3");
                    } else {
                        System.out.println("Somthing went wrong...! Pick number form the lits: ");
                    }
                }

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
