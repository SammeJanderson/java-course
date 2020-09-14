// Code for Beginning Java's Cake & Cupcake Shop Tutorial

import java.util.Scanner;  // Needed for the Scanner class to read input

public class custom_order {

    // STEP 1 PRINTING HELLO WORLD TO CONSOLE
    public static void main(String[] args) {

    //  System.out.println("Hello World!"); // print Hello World to console

    // TEST CODE

    // STEP 2 CREATE A SCANNER OBEJCT, DECLARE VARAIBLES, & PRINT STATEMENTS
	  Scanner keyboard = new Scanner (System.in);

    String firstName; // Primeiro nome do usuário
    String itemOrder; // Item do pedido
    String frostingType; // tipo de cobertura
    String fillingType; //tipo de recheio
    String toppings; // acompanhamentos
    String input; // user input

    double cost = 15; // cost od cakes and Cupcake
    final double TAX_RATE = .08; // sales tax rate
    double tax; // amounto of tax

    // Introduce shop and prompt user to input first name

    System.out.println("Welcome to java's Cake & Cupcake Shop!");
    System.out.println("We make custom cakes with our secret cake batter");





    // TEST CODE

    // STEP 3 INPUT YOUR NAME AND PREPARE TO VIEW MENU
System.out.print("What is your first name?");
firstName = keyboard.nextLine();

System.out.print(firstName + ", please see our Menu below: ");
System.out.print("\n"); // skips a line


    // TEST CODE

    // STEP 4 DISPLAY MENU
System.out.println("---------------------------------------------\n");
System.out.println("          MENU      QUANTITY    BASE COST  \n" );
System.out.println("---------------------------------------------\n");
System.out.println("         Cake          1             $15      \n");
System.out.println("  Set of cupcakes      6             $15     \n");
System.out.println("---------------------------------------------\n");
System.out.println("Frosting (vanilla, chocolate, strawberry, coco)\n");
System.out.println("Filling (mocha, mint, lemon, caramel, vanilla)\n");
System.out.println("Toppinfs (sprinkles, cinnamon, cocoa, nuts)\n");
System.out.println("----------------------------------------------\n");


    // TEST CODE

    // STEP 5 PROMPT USER TO ORDER
System.out.println("Do you want CUPCAKES or a CAKE?");
itemOrder = keyboard.nextLine();



    // TEST CODE

    // STEP 6 PROMPT USER TO CHOOSE FROSTING
System.out.print("What kind of frosting do you want?\n");
System.out.print("Vanilla, Chocolate, Strawberry or Coco \n");
frostingType = keyboard.nextLine();


    //TEST CODE

    // STEP 7 PROMPT USER TO CHOOSE FILLING
System.out.print("What type of FILLING do you want? \n");
System.out.println("Mocha, Mintm Lemon, Caramel or Raspberry");
fillingType = keyboard.nextLine();


    // TEST CODE

    // STEP 8 PROMPT USER TO CHOOSE TOPPINGS
System.out.println("What rype of TOPPINGS do you want?");
System.out.println("sprinkles, Cinnamon, Cocoa, Nuts");
toppings = keyboard.nextLine();


    // TEST CODE

    // STEP 9 DISPLAY ORDER CONFIRMATION
System.out.println();
System.out.println(firstName + ", your order is as follows:");
System.out.println("-----------------------------------------");
System.out.println("item Ordered " + itemOrder);
System.out.println("Fronsting "+ frostingType);
System.out.println("filling "+ fillingType);
System.out.println("toppings "+toppings);
System.out.println("-----------------------------------------");

    // TEST CODE

    // STEP 10 DISPLAY COST AND SALES TAX
System.out.printf("The cost of yourt order is: $%.2f\n", cost);
tax = cost * TAX_RATE;
System.out.printf("The tax is: $%.2f\n", tax);
System.out.printf("the total due is $%.2f\n",(tax + cost));
    }
}
