/*
 * Group Members:
 * 1. [Saif Almajel] - [446100046]
 * 2. [Abdulrahman Aldawood] - [446102850]
 * 3. [Yazan Alrubian] - [446102223]
 *
 * 
 */

public class Member {

    // Private Attributes (Instance Variables)
    private int id;
    private String name;
    private int borrowedCount;
    private int numViewBorrowed;
    private int numBorrows;
    private int numReturns;
    private double sessionFees;

    // Public Static Attributes (Global/Shared Variables)
    public static double TotalRevenue = 0.0;
    public static int TotalViewBorrowed = 0;
    public static int TotalBorrows = 0;
    public static int TotalReturns = 0;

    // Constructor
    public Member(int id, String name, int borrowedCount) {
        this.id = id;
        this.name = name;
        this.borrowedCount = borrowedCount;
        
        // Initialize counters to 0
        this.numViewBorrowed = 0;
        this.numBorrows = 0;
        this.numReturns = 0;
        this.sessionFees = 0.0;
    }

    // Private Helper Methods
    private boolean canBorrow() {
        // Limit is 5 books
        if (this.borrowedCount < 5) {
            return true;
        } else {
            return false;
        }
    }

    private boolean canReturn() {
        // Must have at least 1 book to return
        if (this.borrowedCount >= 1) {
            return true;
        } else {
            return false;
        }
    }

    // Public Methods
    public void viewBorrowedCount() {
        System.out.println("You currently have " + this.borrowedCount + " book(s).");
        
        // Update stats
        this.numViewBorrowed++;
        TotalViewBorrowed++;
    }

    public boolean borrowOne() {
        if (canBorrow()) {
            this.borrowedCount++;
            
            // Update local stats
            this.numBorrows++;
            this.sessionFees = this.sessionFees + 0.50;
            
            // Update global stats
            TotalBorrows++;
            TotalRevenue = TotalRevenue + 0.50;
            
            return true;
        } else {
            return false;
        }
    }

    public boolean returnOne() {
        if (canReturn()) {
            this.borrowedCount--;
            
            // Update stats
            this.numReturns++;
            TotalReturns++;
            
            return true;
        } else {
            return false;
        }
    }

    public void displayStatistics() {
        System.out.println("--- Statistics for " + this.name + " ---");
        System.out.println("ID: " + this.id);
        System.out.println("Current Books: " + this.borrowedCount);
        System.out.println("Times Borrowed: " + this.numBorrows);
        System.out.println("Times Returned: " + this.numReturns);
        System.out.println("Fees: " + this.sessionFees + " Credits");
        System.out.println("---------------------------");
    }

    public void reset() {
        // Reset global statistics
        TotalRevenue = 0;
        TotalViewBorrowed = 0;
        TotalBorrows = 0;
        TotalReturns = 0;
    }

    // Getters (as needed)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
