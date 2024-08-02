package labexer2;

import java.util.Scanner;

public class LabExer2 {
    private String itemName;
    private double itemPrice;
    private int itemQuantity;
    private double amountDue;

    public static void main(String[] args) {
        LabExer2 lab = new LabExer2();
        lab.readInput();
    }

    public void setItemName(String newItemName) {
        this.itemName = newItemName;
    }

    public String getItemName() {
        return this.itemName;
    }

    public double getItemPrice() {
        return this.itemPrice;
    }

    public int getItemQuantity() {
        return this.itemQuantity;
    }

    public void setTotalCost(int quantity, double price) {
        this.itemQuantity = quantity;
        this.itemPrice = price;
        this.amountDue = quantity * price;
    }

    public double getTotalCost() {
        return this.amountDue;
    }

    void readInput() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the name of the item purchasing: ");
            String itemName = scanner.nextLine();
            setItemName(itemName);
            
            System.out.print("Enter the quantity and price separated by a space: ");
            int quantity = scanner.nextInt();
            double price = scanner.nextDouble();
            
            setTotalCost(quantity, price);
            
            System.out.println("You are purchasing " + getItemQuantity() + " " + getItemName() + "(s)" + " at $" + String.format("%.2f", getItemPrice()) + " each.");
            System.out.printf("Amount due is $%.2f\n", getTotalCost());
        } finally {
            scanner.close(); // Ensure the Scanner is closed after use
        }
    }
}