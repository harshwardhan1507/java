 /*

```
        VENDING MACHINE
```

=========================================

## PROJECT OVERVIEW

A console-based vending machine simulation that allows users to:

1. View available products.
2. Select one or more items.
3. Specify quantities.
4. Add multiple products to a cart.
5. Generate a running total.
6. Proceed to checkout.
7. Make a payment.
8. Receive change if excess money is provided.
9. Update stock only after successful payment.
10. Display a final bill/receipt.
11. Start a new transaction after checkout.

---

## PROGRAM FLOW

1. Display all available items.

2. User selects an item.

3. Validate:

   * Item exists.
   * Quantity is positive.
   * Requested quantity is available in stock.

4. Add item to cart.

5. Update running bill amount.

6. Ask user whether they want to:

   * Add more items.
   * Proceed to checkout.

7. Display final bill.

8. Accept payment:

   * Exact amount → Purchase successful.
   * Excess amount → Return change.
   * Insufficient amount → Retry or cancel.

9. On successful payment:

   * Update stock.
   * Print receipt.
   * Clear cart.
   * Reset transaction data.

10. Ask whether to start a new transaction.

---

## DATA STRUCTURES

String[][] items

Stores:

* Item Name
* Price
* Stock

Example:

{
{"Monster","10","100"},
{"Coke","5","50"},
{"Lays","4","70"}
}

---

## GLOBAL VARIABLES

double amt
Running total of all items in cart.

double userGivenAmt
Amount entered by the customer.

String cart
Stores formatted cart details for receipt printing.

String[] purchasedItems
Stores names of purchased items.

int[] purchasedQty
Stores quantities corresponding to purchased items.

int purchaseCount
Tracks number of items added to cart.

Scanner sc
Handles user input.

---

## METHODS

display()
Displays all available items,
prices, and current stock.

compute(int quantity, String itemName)
Calculates cost of selected items.
Updates running total.
Adds item to cart.
Stores purchase information.

billDisplay()
Displays the final receipt,
purchased items, and total amount.

payment()
Handles customer payment.
Verifies sufficient funds.
Returns change when necessary.
Returns payment status.

updateStock()
Deducts purchased quantities
from inventory after successful payment.

resetTransaction()
Clears cart and resets transaction data
for the next customer.

---

## VALIDATIONS IMPLEMENTED

✓ Item existence check
✓ Stock availability check
✓ Positive quantity validation
✓ Exact payment handling
✓ Change calculation
✓ Multiple-item cart support
✓ Inventory update after payment
✓ Transaction reset after checkout

=========================================
END OF DOCUMENTATION
====================

*/
package javakb.projects.intermediate;

import java.util.Scanner;

public class VendingMachine {


    static double amt = 0;
    static double userGivenAmt = 0;

    static String[][] items = {
            {"Monster", "10", "100"},
            {"Coke", "5", "50"},
            {"Lays", "4", "70"},
            {"Chocolate", "2", "80"},
            {"Milkshake", "6", "50"}
    };

    static Scanner sc = new Scanner(System.in);

    static String cart = "";

    static String[] purchasedItems = new String[100];
    static int[] purchasedQty = new int[100];
    static int purchaseCount = 0;

    static void display() {
        System.out.println("\n\t****** ITEMS ******");
        for (String[] item : items) {
            System.out.printf("|%-12s|$%-6s|%-5s|%n",
                    item[0],
                    item[1],
                    item[2]);
        }
    }

    static void compute(int userItem, String userChoice) {

        for (String[] item : items) {
            if (item[0].equalsIgnoreCase(userChoice)) {

                amt += Integer.parseInt(item[1]) * userItem;

                cart += item[0] + " x " + userItem + "\n";

                purchasedItems[purchaseCount] = item[0];
                purchasedQty[purchaseCount] = userItem;
                purchaseCount++;

                break;
            }
        }

        System.out.println("Current Total = $" + amt);
    }

    static void updateStock() {

        for (int i = 0; i < purchaseCount; i++) {

            String itemName = purchasedItems[i];
            int quantity = purchasedQty[i];

            for (String[] item : items) {

                if (item[0].equalsIgnoreCase(itemName)) {

                    int stock = Integer.parseInt(item[2]);
                    stock -= quantity;
                    item[2] = String.valueOf(stock);

                    break;
                }
            }
        }
    }

    static void billDisplay() {

        System.out.println("\n\t****** FINAL BILL ******");
        System.out.println(cart);
        System.out.println("Total = $" + amt);
    }

    static boolean payment() {

        while (true) {

            System.out.print("Enter money: $");
            userGivenAmt = sc.nextDouble();

            if (userGivenAmt == amt) {

                System.out.println("Payment Successful");
                return true;
            }

            else if (userGivenAmt > amt) {

                double change = userGivenAmt - amt;

                System.out.println("Payment Successful");
                System.out.println("Returning Change: $" + change);

                return true;
            }

            else {

                System.out.println("Insufficient Money.");
                System.out.print("Try Again? (y/n): ");

                char choice = sc.next().charAt(0);

                if (choice == 'n' || choice == 'N') {
                    return false;
                }
            }
        }
    }

    static void resetTransaction() {

        amt = 0;
        userGivenAmt = 0;
        cart = "";

        purchaseCount = 0;
    }

    public static void main(String[] args) {

        boolean continueShopping = true;

        while (continueShopping) {

            boolean itemCheck = false;

            display();

            System.out.print("\nEnter item name: ");
            String userChoice = sc.nextLine().trim();

            switch (userChoice.toLowerCase()) {

                case "monster":
                case "coke":
                case "lays":
                case "milkshake":
                case "chocolate":

                    System.out.print("Enter quantity: ");
                    int userItem = sc.nextInt();
                    sc.nextLine();

                    if (userItem <= 0) {

                        System.out.println("Invalid Quantity");
                        continue;
                    }

                    for (String[] item : items) {

                        if (item[0].equalsIgnoreCase(userChoice)) {

                            int stock = Integer.parseInt(item[2]);

                            if (stock >= userItem) {

                                itemCheck = true;
                            }

                            else {

                                System.out.println("Insufficient Stock");
                            }

                            break;
                        }
                    }

                    if (itemCheck) {

                        compute(userItem, userChoice);

                        System.out.print(
                                "Add More Items? (y/n): "
                        );

                        char choice = sc.next().charAt(0);
                        sc.nextLine();

                        if (choice == 'y' || choice == 'Y') {

                            continue;
                        }

                        billDisplay();

                        if (payment()) {

                            updateStock();

                            System.out.println(
                                    "\nPurchase Completed!"
                            );

                            display();
                        }

                        resetTransaction();

                        System.out.print(
                                "\nStart New Transaction? (y/n): "
                        );

                        char again = sc.next().charAt(0);
                        sc.nextLine();

                        continueShopping =
                                (again == 'y' || again == 'Y');
                    }

                    break;

                default:

                    System.out.println("Invalid Item");
            }
        }

        sc.close();

        System.out.println("Thank you for using the Vending Machine.");
    }


}
