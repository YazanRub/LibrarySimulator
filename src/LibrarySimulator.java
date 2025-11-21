/*
 * Group Members:
 * 1. [Saif Almajel] - [446100046]
 * 2. [Abdulrahman Aldawood] - [446102850]
 * 3. [Yazan Alrubian] - [446102223]
 *
 * GitHub Repository: [https://github.com/YazanRub/LibrarySimulator.git]
 */

import java.util.Scanner;

public class LibrarySimulator {

    public static void main(String[] args) {

        // Create Member objects using the Constructor
        Member member1 = new Member(1011223344, "Omar", 3);
        Member member2 = new Member(1219235384, "Laila", 1);
        Member member3 = new Member(1352226662, "Adam", 4);

        Scanner input = new Scanner(System.in);
        boolean Running = true;

        // Main Menu Loop
        while (Running) {
            System.out.println("================================");
            System.out.println("Welcome to the library Simulator");
            System.out.println("================================");
            System.out.println("1- Select a user account");
            System.out.println("2- Login as Administrator ");
            System.out.println("3- Exit the program");
            int choice = input.nextInt();

            if (choice == 1) {
                boolean Running_User_Page = true;

                // Display list of users
                System.out.println("Select Your Account: ");
                System.out.println("_________________");
                System.out.printf("ID\t\tName\t\tBooks Currently Borrowed : \n");
                System.out.println("1-\t" + member1.getId() + "\t" + member1.getName() + "\t" + member1.getBorrowedCount());
                System.out.println("2-\t" + member2.getId() + "\t" + member2.getName() + "\t" + member2.getBorrowedCount());
                System.out.println("3-\t" + member3.getId() + "\t" + member3.getName() + "\t" + member3.getBorrowedCount());
                System.out.println("_________________");

                int userChoice = input.nextInt();



                // === ACCOUNT 1 ===
                if (userChoice == 1) {
                    while (Running_User_Page) {
                        System.out.println("Choose from the following: ");
                        System.out.println("1- View Borrowed Books Count ");
                        System.out.println("2- Borrow Book ");
                        System.out.println("3- Return Book");
                        System.out.println("4- View Session Summary ");
                        System.out.println("5- Exit to Main Menu ");

                        int choice_U_P = input.nextInt();

                        switch (choice_U_P) {
                            case 1:
                                member1.viewBorrowedCount();
                                break;
                            case 2:
                                // Try to borrow using the class method
                                if (member1.borrowOne()) {
                                    System.out.println("The system charges a 0.50 credit fee per borrowed book.");
                                    System.out.println("Choose From The Following books to borrow: ");
                                    System.out.println("1- Rich Dad Poor Dad");
                                    System.out.println("2- The 7 Habits of Highly Effective People");
                                    System.out.println("3- The Power of Habit");
                                    System.out.println("4- The Psychology of Money");
                                    System.out.println("5- Start with Why");
                                    int bookChoice = input.nextInt();
                                    System.out.println("Book Borrowed Successfully.");
                                } else {
                                    System.out.println("Cannot borrow more than 5 books.");
                                }
                                break;
                            case 3:
                                if (member1.returnOne()) {
                                    System.out.println("There is no fee for Returning books. Book Returned.");
                                } else {
                                    System.out.println("You have no books to Return.");
                                }
                                break;
                            case 4:
                                member1.displayStatistics();
                                break;
                            case 5:
                                member1.reset(); // Reset session stats on exit
                                Running_User_Page = false;
                                break;
                            default:
                                System.out.println("Invalid option.");
                        }
                    }
                }
                // === ACCOUNT 2 ===
                else if (userChoice == 2) {
                    while (Running_User_Page) {
                        System.out.println("Choose from the following: ");
                        System.out.println("1- View Borrowed Books Count ");
                        System.out.println("2- Borrow Book ");
                        System.out.println("3- Return Book");
                        System.out.println("4- View Session Summary ");
                        System.out.println("5- Exit to Main Menu ");

                        int choice_U_P = input.nextInt();

                        switch (choice_U_P) {
                            case 1:
                                member2.viewBorrowedCount();
                                break;
                            case 2:
                                if (member2.borrowOne()) {
                                    System.out.println("The system charges a 0.50 credit fee per borrowed book.");
                                    System.out.println("Choose From The Following books to borrow: ");
                                    System.out.println("1- Rich Dad Poor Dad");
                                    System.out.println("2- The 7 Habits of Highly Effective People");
                                    System.out.println("3- The Power of Habit");
                                    System.out.println("4- The Psychology of Money");
                                    System.out.println("5- Start with Why");
                                    int bookChoice = input.nextInt();
                                    System.out.println("Book Borrowed Successfully.");
                                } else {
                                    System.out.println("Cannot borrow more than 5 books.");
                                }
                                break;
                            case 3:
                                if (member2.returnOne()) {
                                    System.out.println("There is no fee for Returning books. Book Returned.");
                                } else {
                                    System.out.println("You have no books to Return.");
                                }
                                break;
                            case 4:
                                member2.displayStatistics();
                                break;
                            case 5:
                                member2.reset();
                                Running_User_Page = false;
                                break;
                            default:
                                System.out.println("Invalid option.");
                        }
                    }
                }
                // === ACCOUNT 3 ===
                else if (userChoice == 3) {
                    while (Running_User_Page) {
                        System.out.println("Choose from the following: ");
                        System.out.println("1- View Borrowed Books Count ");
                        System.out.println("2- Borrow Book ");
                        System.out.println("3- Return Book");
                        System.out.println("4- View Session Summary ");
                        System.out.println("5- Exit to Main Menu ");

                        int choice_U_P = input.nextInt();

                        switch (choice_U_P) {
                            case 1:
                                member3.viewBorrowedCount();
                                break;
                            case 2:
                                if (member3.borrowOne()) {
                                    System.out.println("The system charges a 0.50 credit fee per borrowed book.");
                                    System.out.println("Choose From The Following books to borrow: ");
                                    System.out.println("1- Rich Dad Poor Dad");
                                    System.out.println("2- The 7 Habits of Highly Effective People");
                                    System.out.println("3- The Power of Habit");
                                    System.out.println("4- The Psychology of Money");
                                    System.out.println("5- Start with Why");
                                    int bookChoice = input.nextInt();
                                    System.out.println("Book Borrowed Successfully.");
                                } else {
                                    System.out.println("Cannot borrow more than 5 books.");
                                }
                                break;
                            case 3:
                                if (member3.returnOne()) {
                                    System.out.println("There is no fee for Returning books. Book Returned.");
                                } else {
                                    System.out.println("You have no books to Return.");
                                }
                                break;
                            case 4:
                                member3.displayStatistics();
                                break;
                            case 5:
                                member3.reset();
                                Running_User_Page = false;
                                break;
                            default:
                                System.out.println("Invalid option.");
                        }
                    }
                } else {
                    System.out.println("Something went wrong! Pick a number from the list.");
                }
            }
            // === ADMIN PAGE ===
            else if (choice == 2) {
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

                    if (number == 1) {
                        // Use Static variable from Member class
                        System.out.printf("Total Revenue: %.2f\n", Member.TotalRevenue);
                    } else if (number == 2) {
                        // Compare static counters
                        int borrows = Member.TotalBorrows;
                        int returns = Member.TotalReturns;
                        int views = Member.TotalViewBorrowed;

                        if (borrows >= returns && borrows >= views) {
                            System.out.println("Most frequent operation: Borrow Book (" + borrows + ")");
                        } else if (returns >= borrows && returns >= views) {
                            System.out.println("Most frequent operation: Return Book (" + returns + ")");
                        } else {
                            System.out.println("Most frequent operation: View Borrowed Count (" + views + ")");
                        }

                    } else if (number == 3) {
                        process = false;
                    } else {
                        System.out.println("Invalid choice.");
                    }
                }
            }
            else if (choice == 3) {
                Running = false;
                System.out.println("Thanks for using our Library Simulator. Goodbye!");
            } else {
                System.out.println("Invalid choice please try again");
            }
        }
        input.close();
    }
}
