/*
 * Group Members:
 * 1. [Saif Almajel] - [446100046]
 * 2. [Abdulrahman Aldawood] - [446102850]
 * 3. [Yazan Alrubian] - [446102223]
 *
 * GitHub Repository: [https://github.com/YazanRub/LibrarySimulator.git]
 */

public class Member {


    private int id;
    private String name;
    private int borrowedCount;
    private int numViewBorrowed;
    private int numBorrows;
    private int numReturns;
    private double sessionFees;


    public static double TotalRevenue = 0.0;
    public static int TotalViewBorrowed = 0;
    public static int TotalBorrows = 0;
    public static int TotalReturns = 0;

    // Constructor
    public Member(int id, String name, int borrowedCount) {
        this.id = id;
        this.name = name;
        this.borrowedCount = borrowedCount;
        this.numViewBorrowed = 0;
        this.numBorrows = 0;
        this.numReturns = 0;
        this.sessionFees = 0.0;
    }

    // Private helper method to check if user can borrow
    private boolean canBorrow() {
        if (borrowedCount < 5) {
            return true;
        } else {
            return false;
        }
    }

    // Private helper method to check if user can return
    private boolean canReturn() {
        if (borrowedCount >= 1) {
            return true;
        } else {
            return false;
        }
    }

    // Prints the current borrowed count and updates stats
    public void viewBorrowedCount() {
        System.out.println("The number of books you have is: " + borrowedCount);
        numViewBorrowed++;
        TotalViewBorrowed++;
    }

    // Simulates borrowing a book
    public boolean borrowOne() {
        if (canBorrow()) {
            borrowedCount++;
            numBorrows++;
            TotalBorrows++;
            sessionFees += 0.50;
            TotalRevenue += 0.50;
            return true;
        } else {
            return false;
        }
    }

    // Simulates returning a book
    public boolean returnOne() {
        if (canReturn()) {
            borrowedCount--;
            numReturns++;
            TotalReturns++;
            return true;
        } else {
            return false;
        }
    }

    // Prints statistics for the specific member
    public void displayStatistics() {
        System.out.println("This is the Session Summary: ");
        System.out.println("Number of books borrowed: " + numBorrows);
        System.out.println("Number of books returned: " + numReturns);
        System.out.printf("Total fees incurred during the session: %.2f \n", sessionFees);
    }

    // Resets the statistics to zero
    public void reset() {
        numViewBorrowed = 0;
        numBorrows = 0;
        numReturns = 0;
        sessionFees = 0.0;
    }

    // Getters needed for the Main class menu
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBorrowedCount() {
        return borrowedCount;
    }
}
