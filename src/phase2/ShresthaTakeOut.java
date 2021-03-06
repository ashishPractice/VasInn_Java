package phase2;

import java.util.Scanner;

public class ShresthaTakeOut {

    int feed;
    double price;

    public static void displayMainMenu() {
        System.out.println("CHOOSE TYPE OF MEAL");
        System.out.println("---------------------------");
        System.out.println("1. Italian");
        System.out.println("2. Chinese");
        System.out.println("3. American");
    }

    public static void displayItalianMainMenu() {
        System.out.println("CHOOSE ONE");
        System.out.println("---------------------------");
        System.out.println("1. Lasagna Tray - Feed 5 - 17.99");
        System.out.println("2. Pizza Pack - Feed 7 - 15.99");
        System.out.println("3. Gazpacho Soup, salad and bread sticks pack - Feed 4 - 12.99");

    }

    public static void displayChineseMainMenu() {
        System.out.println("---------------------------");
        System.out.println("1. Chicken and Broccoli Tray (includes 7 wonton soups, 7 egg rolls) - feeds 7 - 18.99 ");
        System.out.println("2. Sweet and Sour Pork Tray (includes 7 hot and sour soups, 7 egg rolls) - feeds 7 - 18.99");
        System.out.println("3. Shrimp Fried Rice Tray (includes 10 egg rolls) - Feeds 5 - 10.99");
        System.out.println("Enter choice:");
    }

    public static void displayAmericanMainMenu() {
        System.out.println("CHOOSE ONE");
        System.out.println("---------------------------");
        System.out.println("1. Hamburger and Hot Dog Tray - includes buns and condiments - feeds 8 - 21.99");
        System.out.println("2. Grilled Chicken Sandwich and Mozzarella Sticks Tray - includes dipping sauces -Feeds 5 - 22.99");
        System.out.println("3. Barbeque Tray - includes buns and peach cobbler - Feeds 10 - 26.99");
    }

    public static int determineTrays(int people, int feeds) {

        int tray = (people / feeds) + 1;
        return tray;

    }

    public static double getSubTotal(double price, int trays) {

        return price * trays;

    }

    public static double getTax(double subTotal, double taxrate) {

        return subTotal * taxrate;

    }

    public static double getTip(double subTotal, double tiprate) {

        return subTotal * tiprate;
    }

    public static double getGrandTotal(double subTotal, double tax, double tip) {

        return subTotal + tax + tip;
    }

    public static double pricePerPerson(double grandTotal, int people) {

        return grandTotal/people;
    }

    public static int determineLeftOvers(int feeds, int trays, int people) {
        int leftOver = (trays * feeds ) % people;
        return leftOver;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter number of people:");
            int peopleNumber = scan.nextInt();
            if (peopleNumber > 100 || peopleNumber < 10) {
                System.out.println("Number of people are invalid");
                break;
            }

            displayAmericanMainMenu();
            System.out.println("Choose what type of food you like to order");
            int foodChoice = scan.nextInt();

            switch (foodChoice) {
                case 1:
                    displayItalianMainMenu();
                    break;
                case 2:
                    displayChineseMainMenu();
                    break;
                case 3:
                    displayAmericanMainMenu();
                    break;
                default:
                    System.out.println("Invalid cboice");
            }

            if (foodChoice > 3 || foodChoice < 1) {
                break;
            }

            System.out.println("Enter choice:");
            int choice = scan.nextInt();

            int feed = 0;
            double price = 0.0;

            if (foodChoice == 1) {
                if (choice == 1) {
                    feed = 5;
                    price = 17.99;
                } else if (choice == 2) {
                    feed = 7;
                    price = 15.99;
                } else if (choice == 3) {
                    feed = 4;
                    price = 12.99;
                } else {
                    System.out.println("Invalid choice");
                    break;
                }
            } else if (foodChoice == 2) {
                if (choice == 1) {
                    feed = 7;
                    price = 18.99;
                } else if (choice == 2) {
                    feed = 7;
                    price = 18.99;
                } else if (choice == 3) {
                    feed = 5;
                    price = 10.99;
                } else {
                    System.out.println("Invalid choice");
                    break;
                }
            } else {
                if (choice == 1) {
                    feed = 8;
                    price = 21.99;
                } else if (choice == 2) {
                    feed = 5;
                    price = 22.99;
                } else if (choice == 3) {
                    feed = 10;
                    price = 26.99;
                } else {
                    System.out.println("Invalid choice");
                    break;
                }
            }


            int tray = determineTrays(peopleNumber, feed);
            System.out.println("You need " + tray + " trays");
            System.out.println("Feeds " + feed);

            double subTotal = getSubTotal(price, tray);

            double tax = getTax(subTotal, 0.07);

            double tip = getTip(subTotal, 0.15);

            double grandTotal = getGrandTotal(subTotal,tax,tip);

            System.out.println("Price for "+peopleNumber+" people ("+tray+" trays): "+ String.format("%.02f",subTotal));

            System.out.println("Tax: "+ String.format("%.02f",tax));

            System.out.println("Tip: "+ String.format("%.02f",tip));

            System.out.println("Total (food, tax, tips): "+ String.format("%.02f",grandTotal));

            double perPerson = pricePerPerson(grandTotal,peopleNumber);

            System.out.println("Price per persons: "+ String.format("%.02f",perPerson));

            int leftover = determineLeftOvers(feed,tray,peopleNumber);

            System.out.println("Leftover serving for the delivery person: "+ leftover);

        }


    }


}
