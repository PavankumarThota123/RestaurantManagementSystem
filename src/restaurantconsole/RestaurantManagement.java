package restaurantconsole;
import java.util.Scanner;

			         
public class RestaurantManagement {
 
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
			double total = 0;

			System.out.println("Welcome to the Restaurant Management System!");
			System.out.println("\nMenu:");
			System.out.println("1. Shawarma - 120/-");
			System.out.println("2. Pizza - 200/-");
			System.out.println("3. Salad - 100/-");
			System.out.println("4. Juice - 50/-");
			System.out.println("5. Milk Shake - 80/-");
			System.out.println("6.total bill");
			System.out.println("7. balances");

			while (true) {
			    System.out.print("\nEnter the item number to add to order ");
			    int choice = scanner.nextInt();
			    if (choice >= 1 && choice <= 7) {
			        switch (choice) {
			            case 1:
			                System.out.print("Enter the quantity: ");
			        int quantity1 = scanner.nextInt();
			        scanner.nextLine(); // Consume newline
			                total += 120 * quantity1;
			                System.out.println("Shawarma added to order. Total Price: $" + total);
			                break;
			            case 2:
			                System.out.print("Enter the quantity: ");
			                int quantity2 = scanner.nextInt();
			        scanner.nextLine(); // Consume newline
			                total += 200 * quantity2;
			                System.out.println("Pizza added to order. Total Price: $" + total);
			                break;
			            case 3:
			                System.out.print("Enter the quantity: ");
			                int quantity3 = scanner.nextInt();
			        scanner.nextLine(); // Consume newline
			                total += 100 * quantity3;
			                System.out.println("Salad added to order. Total Price: $" + total);
			                break;
			            case 4:
			                System.out.print("Enter the quantity: ");
			        
			                int quantity4 = scanner.nextInt();
			        scanner.nextLine(); // Consume newline
			                total += 50 * quantity4;
			                System.out.println("Juice added to order. Total Price: $" + total);
			                break;
			            case 5:
			                System.out.print("Enter the quantity: ");
			                int quantity5 = scanner.nextInt();
			        scanner.nextLine(); // Consume newline
			                total += 80 * quantity5;
			                System.out.println("Milk Shake added to order. Total Price: $" + total);
			                break;
			                case 6:
			                	 System.out.println("\nOrder Summary:");
			 			        System.out.println("Total Price: $" + total);
			 			        break;
			            case 7:
			                System.out.println("enter amount");
			                double amnt=scanner.nextInt();
			                System.out.println("amount"+""+amnt);
			              double c=amnt-total;
			                System.out.println("balance"+" "+c);
			                System.out.println("Thank you for visiting us");
			                
			        }
			    } else {
			    	System.out.println("Invalid item number");
			    			
			    }
			}
        }
    }
}




