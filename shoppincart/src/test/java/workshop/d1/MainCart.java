package workshop.d1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MainCart {
    public static void main(String[] args) {
        System.out.println("Welcome to your shopping cart");
        List<String> cart = new LinkedList<>();

        // enter into a while loop till the user entered "exit" or tried to delete an
        // invalid option
        while (true) {
            Scanner scan = new Scanner(System.in); // get input from user
            String action = scan.next().toLowerCase(); // the first word from the user will be an action
            String items = scan.nextLine().trim(); // the following word(s) will be the item(s)
            if ("exit".equals(action)) {
                // if user entered "exits", the while loop will end
                System.out.println("Exiting from shopping cart");
                break;
            } else if (action.startsWith("add")) {
                // if user entered "add" as an action, append the items into the list
                for (String item : items.split(",")) {
                    if (!cart.contains(item)) {
                        cart.add(item.trim());
                        System.out.println(item.trim() + " added to cart");
                    } else {
                        System.out.printf("You have %s in your cart \n", item);
                    }
                }
            } else if ("list".equals(action)) {
                int i = 1;
                if (cart.isEmpty()) {
                    System.out.println("Your cart is empty");
                }
                for (String item : cart) {
                    System.out.println(i + "." + item.trim() + "");
                    i++;
                }
            } else if ("delete".equals(action)) {
                int i = Integer.parseInt(items);
                int choice = i - 1;
                if (i > cart.size()) {
                    System.out.println("Incorrect item index");
                    break;
                }
                String removed = cart.remove(choice);
                System.out.println(removed + " removed from cart");
            }
        }
    }
}
