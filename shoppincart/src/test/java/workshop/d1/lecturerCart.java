package workshop.d1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lecturerCart {
    public static void main(String[] args) {
        System.out.println("Welcome to your shopping cart");
        Scanner scan = new Scanner(System.in);
        String com = scan.next();

        List<String> cart = new ArrayList<>();
        cart.add("apple");

        while(!com.equals("list") || !com.equals("add")){
            System.out.println("Please use only list or add.");
            com = scan.next();
        } System.out.println(com);
    }
}
