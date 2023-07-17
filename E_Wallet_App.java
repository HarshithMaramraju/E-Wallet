package Projects;

import java.util.Scanner;

public class E_Wallet_App
{
    public static void main(String[] args) {
        System.out.println("Welcome to E-Wallet.");

        Scanner sc = new Scanner(System.in);

        //        Variables
        int password = 1234;
        boolean validity = false;
        boolean shop_again = false;
        boolean back_to_shop_menu = false;
        boolean make_default = false;

        int count = 3;

        int min_balance = 2000;
        int balance = 2000;

        while (!validity) {
            System.out.println("\nPlease Enter Your Credentials.");
            int pwd = sc.nextInt();

            if (password == pwd) {
                System.out.println("\nlogin successfull");
                validity = true;    // will not allow to run main while again

                while (!shop_again) {
                    System.out.println("\nPress any one");
                    back_to_shop_menu = false;

                    System.out.println("\npress 1 for Shopping");
                    System.out.println("press 2 for Add money");
                    System.out.println("press 3 for Check balance");
                    System.out.println("press 4 for exit or log out");

                    int post_login_options = sc.nextInt();

                    while (!back_to_shop_menu) {
                        back_to_shop_menu = false;
                        make_default = false;

                        while (post_login_options > 4 || post_login_options <= 0) {
                            System.out.println("\nInvalid number entered. Enter 1, 2, or 3");
                            System.out.println("press 1 for Shopping");
                            System.out.println("press 2 for Add money");
                            System.out.println("press 3 for Check balance");
                            System.out.println("press 4 for exit or log out");
                            post_login_options = sc.nextInt();
                        }

                        if (post_login_options < 5) {
                            switch (post_login_options) {
                                case 1: {
                                    System.out.println("\nShopping is Selected 🛒");

                                    System.out.println("\nSelect any one of a category");
                                    System.out.println("press 1 for Watches");
                                    System.out.println("press 2 for Shoes");
                                    System.out.println("press 3 for Hoodies");
                                    System.out.println("press 4 for Caps");
                                    System.out.println("press 5 for Bags");
                                    System.out.println("press 6 for Makeup kit");
                                    System.out.println("press 7 for Main menu");

                                    int select_shopping = sc.nextInt();
                                    while (!make_default) {
                                        while (select_shopping > 7 || select_shopping <= 0) {
                                            System.out.println("Invalid number. Try again");

                                            System.out.println("\nSelect any one of a category");
                                            System.out.println("press 1 for Watches");
                                            System.out.println("press 2 for Shoes");
                                            System.out.println("press 3 for Hoodies");
                                            System.out.println("press 4 for Caps");
                                            System.out.println("press 5 for Bags");
                                            System.out.println("press 6 for Makeup kit");
                                            System.out.println("press 7 for Main menu");

                                            select_shopping = sc.nextInt();
                                        }

                                        if (select_shopping < 8) {
                                            switch (select_shopping) {
                                                case 1: {
                                                    System.out.println("\nSelected Watches ⌚");

                                                    System.out.println("press 1 for rolex - 5000");
                                                    System.out.println("press 2 for timex - 2000");
                                                    System.out.println("press 3 for GShock - 10000");
                                                    System.out.println("press 4 for Gucci - 15000");
                                                    System.out.println("press 5 for FastTrack - 1000");
                                                    System.out.println("press 6 for accessories menu");

                                                    int watch_options = sc.nextInt();

                                                    while (watch_options > 6 || watch_options <= 0) {
                                                        System.out.println("\nInvalid number. ");

                                                        System.out.println("press 1 for rolex - 5000");
                                                        System.out.println("press 2 for timex - 2000");
                                                        System.out.println("press 3 for GShock - 10000");
                                                        System.out.println("press 4 for Gucci - 15000");
                                                        System.out.println("press 5 for FastTrack - 1000");
                                                        System.out.println("press 6 for accessories menu");

                                                        watch_options = sc.nextInt();
                                                    }
                                                    switch (watch_options) {
                                                        case 1: {
                                                            int price = 5000;

                                                            if (balance > price && balance > min_balance && (balance - price > min_balance)) {
                                                                System.out.println("rolex Selected");
                                                                System.out.println("Do you proceed to buy the rolex product");

                                                                System.out.println("press 1 to buy the product");
                                                                System.out.println("press 2 for Shop Menu");
                                                                int bill_options = sc.nextInt();
                                                                while (bill_options > 2 || bill_options <= 0) {
                                                                    System.out.println("\nInvalid number selected. ");
                                                                    bill_options = sc.nextInt();
                                                                }

                                                                switch (bill_options) {
                                                                    case 1: {
                                                                        System.out.println("You bought rolex worth " + price);
                                                                        balance = balance - price;
                                                                        System.out.println("your updated balance is " + balance);

                                                                        System.out.println("\nDo you want to continue Shopping?");
                                                                        System.out.println("Press 1 to continue shopping");
                                                                        System.out.println("Press 2 to exit or logout");
                                                                        int shop_2nd = sc.nextInt();

                                                                        while (shop_2nd < 0 || shop_2nd > 2) {
                                                                            System.out.println("\nInvalid Input");
                                                                            System.out.println("Press 1 to continue shopping");
                                                                            System.out.println("Press 2 to exit or logout");
                                                                            shop_2nd = sc.nextInt();
                                                                        }

                                                                        switch (shop_2nd) {
                                                                            case 1: {
                                                                                shop_again = false;
                                                                                break;
                                                                            }

                                                                            case 2: {
                                                                                shop_again = true;
                                                                                break;
                                                                            }
                                                                        }
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }

                                                            } else {
                                                                System.out.println("You don't have sufficient balance. your " +
                                                                        "current balance is " + balance);

                                                                System.out.println("\nPress 1 to add money?");
                                                                System.out.println("press 2 to return back");
                                                                int again_shop = sc.nextInt();

                                                                while (again_shop < 0 || again_shop > 2) {
                                                                    System.out.println("Invalid Input. Please try again");
                                                                    System.out.println("\nPress 1 to add money");
                                                                    System.out.println("\nPress 2 return back");
                                                                    again_shop = sc.nextInt();
                                                                }

                                                                switch (again_shop) {
                                                                    case 1: {
                                                                        System.out.println("\nAdd money is Selected ➕");

                                                                        System.out.println("\nminimum balance is " + min_balance);
                                                                        System.out.println("your current balance is " + balance);
                                                                        System.out.println("Enter amount to be added");

                                                                        int money_add = sc.nextInt();

                                                                        while (money_add < 1000 || money_add > 1000000) {
                                                                            System.out.println("minimum amount to be added is 1000 and maximum amount" +
                                                                                    " is 1000000");
                                                                            money_add = sc.nextInt();
                                                                        }

                                                                        if (money_add >= 1000 && money_add <= 10000) {
                                                                            money_add = money_add - 100;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 10000 && money_add <= 100000) {
                                                                            money_add = money_add - 1000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 100000 && money_add <= 1000000) {
                                                                            money_add = money_add - 100000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        }

                                                                        select_shopping = 1;
                                                                        shop_again = false;
                                                                        continue;
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        }

                                                        case 2: {
                                                            int price = 2000;

                                                            if (balance > price && balance > min_balance && (balance - price > 2000)) {
                                                                System.out.println("timex Selected");
                                                                System.out.println("Do you proceed to buy the timex product");

                                                                System.out.println("press 1 to buy the product");
                                                                System.out.println("press 2 for Shop Menu");
                                                                int bill_options = sc.nextInt();
                                                                while (bill_options > 2 || bill_options <= 0) {
                                                                    System.out.println("\nInvalid number selected. ");

                                                                    bill_options = sc.nextInt();
                                                                }

                                                                switch (bill_options) {
                                                                    case 1: {
                                                                        System.out.println("You bought timex worth " + price);
                                                                        balance = balance - price;
                                                                        System.out.println("your updated balance is " + balance);

                                                                        System.out.println("\nDo you want to continue Shopping?");
                                                                        System.out.println("Press 1 to continue shopping");
                                                                        System.out.println("Press 2 to exit or logout");
                                                                        int shop_2nd = sc.nextInt();

                                                                        while (shop_2nd < 0 || shop_2nd > 2) {
                                                                            System.out.println("\nInvalid Input");
                                                                            System.out.println("Press 1 to continue shopping");
                                                                            System.out.println("Press 2 to exit or logout");
                                                                            shop_2nd = sc.nextInt();
                                                                        }

                                                                        switch (shop_2nd) {
                                                                            case 1: {
                                                                                shop_again = false;
                                                                                break;
                                                                            }

                                                                            case 2: {
                                                                                shop_again = true;
                                                                                break;
                                                                            }
                                                                        }
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }

                                                            } else {
                                                                System.out.println("You don't have sufficient balance. your " +
                                                                        "current balance is " + balance);

                                                                System.out.println("\nPress 1 to add money?");
                                                                System.out.println("press 2 to return back");
                                                                int again_shop = sc.nextInt();

                                                                while (again_shop < 0 || again_shop > 2) {
                                                                    System.out.println("Invalid Input. Please try again");
                                                                    System.out.println("\nPress 1 to add money");
                                                                    System.out.println("\nPress 2 return back");
                                                                    again_shop = sc.nextInt();
                                                                }

                                                                switch (again_shop) {
                                                                    case 1: {

                                                                        System.out.println("\nAdd money is Selected ➕");

                                                                        System.out.println("\nminimum balance is " + min_balance);
                                                                        System.out.println("your current balance is " + balance);
                                                                        System.out.println("Enter amount to be added");

                                                                        int money_add = sc.nextInt();

                                                                        while (money_add < 1000 || money_add > 1000000) {
                                                                            System.out.println("minimum amount to be added is 1000 and maximum amount" +
                                                                                    " is 1000000");
                                                                            money_add = sc.nextInt();
                                                                        }

                                                                        if (money_add >= 1000 && money_add <= 10000) {
                                                                            money_add = money_add - 100;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 10000 && money_add <= 100000) {
                                                                            money_add = money_add - 1000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 100000 && money_add <= 1000000) {
                                                                            money_add = money_add - 100000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        }

                                                                        select_shopping = 1;
                                                                        shop_again = false;
                                                                        continue;
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        }

                                                        case 3: {
                                                            int price = 10000;

                                                            if (balance > price && balance > min_balance && (balance - price > 2000)) {
                                                                System.out.println("GShock Selected");
                                                                System.out.println("Do you proceed to buy the GShock product");

                                                                System.out.println("press 1 to buy the product");
                                                                System.out.println("press 2 for Shop Menu");
                                                                int bill_options = sc.nextInt();
                                                                while (bill_options > 2 || bill_options <= 0) {
                                                                    System.out.println("\nInvalid number selected. ");
                                                                    bill_options = sc.nextInt();
                                                                }

                                                                switch (bill_options) {
                                                                    case 1: {
                                                                        System.out.println("You bought GShock worth " + price);
                                                                        balance = balance - price;
                                                                        System.out.println("your updated balance is " + balance);

                                                                        System.out.println("\nDo you want to continue Shopping?");
                                                                        System.out.println("Press 1 to continue shopping");
                                                                        System.out.println("Press 2 to exit or logout");
                                                                        int shop_2nd = sc.nextInt();

                                                                        while (shop_2nd < 0 || shop_2nd > 2) {
                                                                            System.out.println("\nInvalid Input");
                                                                            System.out.println("Press 1 to continue shopping");
                                                                            System.out.println("Press 2 to exit or logout");
                                                                            shop_2nd = sc.nextInt();
                                                                        }

                                                                        switch (shop_2nd) {
                                                                            case 1: {
                                                                                shop_again = false;
                                                                                break;
                                                                            }

                                                                            case 2: {
                                                                                continue;
                                                                            }
                                                                        }
                                                                    }

                                                                    case 2: {
                                                                        System.out.println("\nThank you for your service. Please visit again");
                                                                        System.out.println("Logged out");
                                                                        validity = true;
                                                                    }
                                                                }

                                                            } else {
                                                                System.out.println("You don't have sufficient balance. your " +
                                                                        "current balance is " + balance);

                                                                System.out.println("\nPress 1 to add money?");
                                                                System.out.println("press 2 to return back");
                                                                int again_shop = sc.nextInt();

                                                                while (again_shop < 0 || again_shop > 2) {
                                                                    System.out.println("Invalid Input. Please try again");
                                                                    System.out.println("\nPress 1 to add money");
                                                                    System.out.println("\nPress 2 return back");
                                                                    again_shop = sc.nextInt();
                                                                }

                                                                switch (again_shop) {
                                                                    case 1: {

                                                                        System.out.println("\nAdd money is Selected ➕");

                                                                        System.out.println("\nminimum balance is " + min_balance);
                                                                        System.out.println("your current balance is " + balance);
                                                                        System.out.println("Enter amount to be added");

                                                                        int money_add = sc.nextInt();

                                                                        while (money_add < 1000 || money_add > 1000000) {
                                                                            System.out.println("minimum amount to be added is 1000 and maximum amount" +
                                                                                    " is 1000000");
                                                                            money_add = sc.nextInt();
                                                                        }

                                                                        if (money_add >= 1000 && money_add <= 10000) {
                                                                            money_add = money_add - 100;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 10000 && money_add <= 100000) {
                                                                            money_add = money_add - 1000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 100000 && money_add <= 1000000) {
                                                                            money_add = money_add - 100000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        }

                                                                        select_shopping = 1;
                                                                        shop_again = false;
                                                                        continue;
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        }

                                                        case 4: {
                                                            int price = 15000;

                                                            if (balance > price && balance > min_balance && (balance - price > 2000)) {
                                                                System.out.println("Gucci Selected");
                                                                System.out.println("Do you proceed to buy the Gucci product");

                                                                System.out.println("press 1 to buy the product");
                                                                System.out.println("press 2 for Shop Menu");
                                                                int bill_options = sc.nextInt();
                                                                while (bill_options > 2 || bill_options <= 0) {
                                                                    System.out.println("\nInvalid number selected. ");
                                                                    bill_options = sc.nextInt();
                                                                }

                                                                switch (bill_options) {
                                                                    case 1: {
                                                                        System.out.println("You bought Gucci worth " + price);
                                                                        balance = balance - price;
                                                                        System.out.println("your updated balance is " + balance);

                                                                        System.out.println("\nDo you want to continue Shopping?");
                                                                        System.out.println("Press 1 to continue shopping");
                                                                        System.out.println("Press 2 to exit or logout");
                                                                        int shop_2nd = sc.nextInt();

                                                                        while (shop_2nd < 0 || shop_2nd > 2) {
                                                                            System.out.println("\nInvalid Input");
                                                                            System.out.println("Press 1 to continue shopping");
                                                                            System.out.println("Press 2 to exit or logout");
                                                                            shop_2nd = sc.nextInt();
                                                                        }

                                                                        switch (shop_2nd) {
                                                                            case 1: {
                                                                                shop_again = false;
                                                                                break;
                                                                            }

                                                                            case 2: {
                                                                                shop_again = true;
                                                                                break;
                                                                            }
                                                                        }
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }

                                                            } else {
                                                                System.out.println("You don't have sufficient balance. your " +
                                                                        "current balance is " + balance);

                                                                System.out.println("\nPress 1 to add money?");
                                                                System.out.println("press 2 to return back");
                                                                int again_shop = sc.nextInt();

                                                                while (again_shop < 0 || again_shop > 2) {
                                                                    System.out.println("Invalid Input. Please try again");
                                                                    System.out.println("\nPress 1 to add money");
                                                                    System.out.println("\nPress 2 return back");
                                                                    again_shop = sc.nextInt();
                                                                }

                                                                switch (again_shop) {
                                                                    case 1: {

                                                                        System.out.println("\nAdd money is Selected ➕");

                                                                        System.out.println("\nminimum balance is " + min_balance);
                                                                        System.out.println("your current balance is " + balance);
                                                                        System.out.println("Enter amount to be added");

                                                                        int money_add = sc.nextInt();

                                                                        while (money_add < 1000 || money_add > 1000000) {
                                                                            System.out.println("minimum amount to be added is 1000 and maximum amount" +
                                                                                    " is 1000000");
                                                                            money_add = sc.nextInt();
                                                                        }

                                                                        if (money_add >= 1000 && money_add <= 10000) {
                                                                            money_add = money_add - 100;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 10000 && money_add <= 100000) {
                                                                            money_add = money_add - 1000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 100000 && money_add <= 1000000) {
                                                                            money_add = money_add - 100000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        }

                                                                        select_shopping = 1;
                                                                        shop_again = false;
                                                                        continue;
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        }

                                                        case 5: {
                                                            int price = 1000;

                                                            if (balance > price && balance > min_balance && (balance - price > 2000)) {
                                                                System.out.println("FastTrack Selected");
                                                                System.out.println("Do you proceed to buy the FastTrack product");

                                                                System.out.println("press 1 to buy the product");
                                                                System.out.println("press 2 for Shop Menu");
                                                                int bill_options = sc.nextInt();
                                                                while (bill_options > 2 || bill_options <= 0) {
                                                                    System.out.println("\nInvalid number selected. ");
                                                                    bill_options = sc.nextInt();
                                                                }

                                                                switch (bill_options) {
                                                                    case 1: {
                                                                        System.out.println("You bought FastTrack worth " + price);
                                                                        balance = balance - price;
                                                                        System.out.println("your updated balance is " + balance);

                                                                        System.out.println("\nDo you want to continue Shopping?");
                                                                        System.out.println("Press 1 to continue shopping");
                                                                        System.out.println("Press 2 to exit or logout");
                                                                        int shop_2nd = sc.nextInt();

                                                                        while (shop_2nd < 0 || shop_2nd > 2) {
                                                                            System.out.println("\nInvalid Input");
                                                                            System.out.println("Press 1 to continue shopping");
                                                                            System.out.println("Press 2 to exit or logout");
                                                                            shop_2nd = sc.nextInt();
                                                                        }

                                                                        switch (shop_2nd) {
                                                                            case 1: {
                                                                                shop_again = false;
                                                                                break;
                                                                            }

                                                                            case 2: {
                                                                                shop_again = true;
                                                                                break;
                                                                            }
                                                                        }
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }

                                                            } else {
                                                                System.out.println("You don't have sufficient balance. your " +
                                                                        "current balance is " + balance);

                                                                System.out.println("\nPress 1 to add money?");
                                                                System.out.println("press 2 to return back");
                                                                int again_shop = sc.nextInt();

                                                                while (again_shop < 0 || again_shop > 2) {
                                                                    System.out.println("Invalid Input. Please try again");
                                                                    System.out.println("\nPress 1 to add money");
                                                                    System.out.println("\nPress 2 return back");
                                                                    again_shop = sc.nextInt();
                                                                }

                                                                switch (again_shop) {
                                                                    case 1: {

                                                                        System.out.println("\nAdd money is Selected ➕");

                                                                        System.out.println("\nminimum balance is " + min_balance);
                                                                        System.out.println("your current balance is " + balance);
                                                                        System.out.println("Enter amount to be added");

                                                                        int money_add = sc.nextInt();

                                                                        while (money_add < 1000 || money_add > 1000000) {
                                                                            System.out.println("minimum amount to be added is 1000 and maximum amount" +
                                                                                    " is 1000000");
                                                                            money_add = sc.nextInt();
                                                                        }

                                                                        if (money_add >= 1000 && money_add <= 10000) {
                                                                            money_add = money_add - 100;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 10000 && money_add <= 100000) {
                                                                            money_add = money_add - 1000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 100000 && money_add <= 1000000) {
                                                                            money_add = money_add - 100000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        }

                                                                        select_shopping = 1;
                                                                        shop_again = false;
                                                                        continue;
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        }

                                                        case 6: {
                                                            break;
                                                        }
                                                    }

                                                    break;
                                                }

                                                case 2: {
                                                    System.out.println("\nSelected Shoes 👟");

                                                    System.out.println("press 1 for Nike worth - 10000");
                                                    System.out.println("press 2 for Adidas worth - 5000");
                                                    System.out.println("press 3 for Puma worth - 2000");
                                                    System.out.println("press 4 for Reebok worth - 1500");
                                                    System.out.println("press 5 for Converse worth - 5500");
                                                    System.out.println("press 6 for accessories Menu");

                                                    int shoe_options = sc.nextInt();

                                                    while (shoe_options > 6 || shoe_options <= 0) {
                                                        System.out.println("\nInvalid number. ");

                                                        System.out.println("press 1 for Nike worth - 10000");
                                                        System.out.println("press 2 for Adidas worth - 5000");
                                                        System.out.println("press 3 for Puma worth - 2000");
                                                        System.out.println("press 4 for Reebok worth - 1500");
                                                        System.out.println("press 5 for Converse worth - 5500");
                                                        System.out.println("press 6 for accessories Menu");

                                                        shoe_options = sc.nextInt();
                                                    }

                                                    switch (shoe_options) {
                                                        case 1: {
                                                            int price = 10000;

                                                            if (balance > price && balance > min_balance && (balance - price > 2000)) {
                                                                System.out.println("Nike Selected");
                                                                System.out.println("Do you proceed to buy the Nike product");

                                                                System.out.println("press 1 to buy the product");
                                                                System.out.println("press 2 for Shop Menu");
                                                                int bill_options = sc.nextInt();
                                                                while (bill_options > 2 || bill_options <= 0) {
                                                                    System.out.println("\nInvalid number selected. ");
                                                                    bill_options = sc.nextInt();
                                                                }

                                                                switch (bill_options) {
                                                                    case 1: {
                                                                        System.out.println("You bought Nike worth " + price);
                                                                        balance = balance - price;
                                                                        System.out.println("your updated balance is " + balance);

                                                                        System.out.println("\nDo you want to continue Shopping?");
                                                                        System.out.println("Press 1 to continue shopping");
                                                                        System.out.println("Press 2 to exit or logout");
                                                                        int shop_2nd = sc.nextInt();

                                                                        while (shop_2nd < 0 || shop_2nd > 2) {
                                                                            System.out.println("\nInvalid Input");
                                                                            System.out.println("Press 1 to continue shopping");
                                                                            System.out.println("Press 2 to exit or logout");
                                                                            shop_2nd = sc.nextInt();
                                                                        }

                                                                        switch (shop_2nd) {
                                                                            case 1: {
                                                                                shop_again = false;
                                                                                break;
                                                                            }

                                                                            case 2: {
                                                                                shop_again = true;
                                                                                break;
                                                                            }
                                                                        }
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }

                                                            } else {
                                                                System.out.println("You don't have sufficient balance. your " +
                                                                        "current balance is " + balance);

                                                                System.out.println("\nPress 1 to add money?");
                                                                System.out.println("press 2 to return back");
                                                                int again_shop = sc.nextInt();

                                                                while (again_shop < 0 || again_shop > 2) {
                                                                    System.out.println("Invalid Input. Please try again");
                                                                    System.out.println("\nPress 1 to add money");
                                                                    System.out.println("\nPress 2 return back");
                                                                    again_shop = sc.nextInt();
                                                                }

                                                                switch (again_shop) {
                                                                    case 1: {

                                                                        System.out.println("\nAdd money is Selected ➕");

                                                                        System.out.println("\nminimum balance is " + min_balance);
                                                                        System.out.println("your current balance is " + balance);
                                                                        System.out.println("Enter amount to be added");

                                                                        int money_add = sc.nextInt();

                                                                        while (money_add < 1000 || money_add > 1000000) {
                                                                            System.out.println("minimum amount to be added is 1000 and maximum amount" +
                                                                                    " is 1000000");
                                                                            money_add = sc.nextInt();
                                                                        }

                                                                        if (money_add >= 1000 && money_add <= 10000) {
                                                                            money_add = money_add - 100;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 10000 && money_add <= 100000) {
                                                                            money_add = money_add - 1000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 100000 && money_add <= 1000000) {
                                                                            money_add = money_add - 100000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        }

                                                                        select_shopping = 2;
                                                                        shop_again = false;
                                                                        continue;
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        }

                                                        case 2: {
                                                            int price = 5000;

                                                            if (balance > price && balance > min_balance && (balance - price > 2000)) {
                                                                System.out.println("Adidas Selected");
                                                                System.out.println("Do you proceed to buy the Adidas product");

                                                                System.out.println("press 1 to buy the product");
                                                                System.out.println("press 2 for Shop Menu");
                                                                int bill_options = sc.nextInt();
                                                                while (bill_options > 2 || bill_options <= 0) {
                                                                    System.out.println("\nInvalid number selected. ");
                                                                    bill_options = sc.nextInt();
                                                                }

                                                                switch (bill_options) {
                                                                    case 1: {
                                                                        System.out.println("You bought Adidas worth " + price);
                                                                        balance = balance - price;
                                                                        System.out.println("your updated balance is " + balance);

                                                                        System.out.println("\nDo you want to continue Shopping?");
                                                                        System.out.println("Press 1 to continue shopping");
                                                                        System.out.println("Press 2 to exit or logout");
                                                                        int shop_2nd = sc.nextInt();

                                                                        while (shop_2nd < 0 || shop_2nd > 2) {
                                                                            System.out.println("\nInvalid Input");
                                                                            System.out.println("Press 1 to continue shopping");
                                                                            System.out.println("Press 2 to exit or logout");
                                                                            shop_2nd = sc.nextInt();
                                                                        }

                                                                        switch (shop_2nd) {
                                                                            case 1: {
                                                                                shop_again = false;
                                                                                break;
                                                                            }

                                                                            case 2: {
                                                                                shop_again = true;
                                                                                break;
                                                                            }
                                                                        }
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }

                                                            } else {
                                                                System.out.println("You don't have sufficient balance. your " +
                                                                        "current balance is " + balance);

                                                                System.out.println("\nPress 1 to add money?");
                                                                System.out.println("press 2 to return back");
                                                                int again_shop = sc.nextInt();

                                                                while (again_shop < 0 || again_shop > 2) {
                                                                    System.out.println("Invalid Input. Please try again");
                                                                    System.out.println("\nPress 1 to add money");
                                                                    System.out.println("\nPress 2 return back");
                                                                    again_shop = sc.nextInt();
                                                                }

                                                                switch (again_shop) {
                                                                    case 1: {

                                                                        System.out.println("\nAdd money is Selected ➕");

                                                                        System.out.println("\nminimum balance is " + min_balance);
                                                                        System.out.println("your current balance is " + balance);
                                                                        System.out.println("Enter amount to be added");

                                                                        int money_add = sc.nextInt();

                                                                        while (money_add < 1000 || money_add > 1000000) {
                                                                            System.out.println("minimum amount to be added is 1000 and maximum amount" +
                                                                                    " is 1000000");
                                                                            money_add = sc.nextInt();
                                                                        }

                                                                        if (money_add >= 1000 && money_add <= 10000) {
                                                                            money_add = money_add - 100;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 10000 && money_add <= 100000) {
                                                                            money_add = money_add - 1000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 100000 && money_add <= 1000000) {
                                                                            money_add = money_add - 100000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        }

                                                                        select_shopping = 2;
                                                                        shop_again = false;
                                                                        continue;
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        }

                                                        case 3: {
                                                            int price = 2000;

                                                            if (balance > price && balance > min_balance && (balance - price > 2000)) {
                                                                System.out.println("Puma Selected");
                                                                System.out.println("Do you proceed to buy the Puma product");

                                                                System.out.println("press 1 to buy the product");
                                                                System.out.println("press 2 for Shop Menu");
                                                                int bill_options = sc.nextInt();
                                                                while (bill_options > 2 || bill_options <= 0) {
                                                                    System.out.println("\nInvalid number selected. ");
                                                                    bill_options = sc.nextInt();
                                                                }

                                                                switch (bill_options) {
                                                                    case 1: {
                                                                        System.out.println("You bought Puma worth " + price);
                                                                        balance = balance - price;
                                                                        System.out.println("your updated balance is " + balance);

                                                                        System.out.println("\nDo you want to continue Shopping?");
                                                                        System.out.println("Press 1 to continue shopping");
                                                                        System.out.println("Press 2 to exit or logout");
                                                                        int shop_2nd = sc.nextInt();

                                                                        while (shop_2nd < 0 || shop_2nd > 2) {
                                                                            System.out.println("\nInvalid Input");
                                                                            System.out.println("Press 1 to continue shopping");
                                                                            System.out.println("Press 2 to exit or logout");
                                                                            shop_2nd = sc.nextInt();
                                                                        }

                                                                        switch (shop_2nd) {
                                                                            case 1: {
                                                                                shop_again = false;
                                                                                break;
                                                                            }

                                                                            case 2: {
                                                                                shop_again = true;
                                                                                break;
                                                                            }
                                                                        }
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }

                                                            } else {
                                                                System.out.println("You don't have sufficient balance. your " +
                                                                        "current balance is " + balance);

                                                                System.out.println("\nPress 1 to add money?");
                                                                System.out.println("press 2 to return back");
                                                                int again_shop = sc.nextInt();

                                                                while (again_shop < 0 || again_shop > 2) {
                                                                    System.out.println("Invalid Input. Please try again");
                                                                    System.out.println("\nPress 1 to add money");
                                                                    System.out.println("\nPress 2 return back");
                                                                    again_shop = sc.nextInt();
                                                                }

                                                                switch (again_shop) {
                                                                    case 1: {

                                                                        System.out.println("\nAdd money is Selected ➕");

                                                                        System.out.println("\nminimum balance is " + min_balance);
                                                                        System.out.println("your current balance is " + balance);
                                                                        System.out.println("Enter amount to be added");

                                                                        int money_add = sc.nextInt();

                                                                        while (money_add < 1000 || money_add > 1000000) {
                                                                            System.out.println("minimum amount to be added is 1000 and maximum amount" +
                                                                                    " is 1000000");
                                                                            money_add = sc.nextInt();
                                                                        }

                                                                        if (money_add >= 1000 && money_add <= 10000) {
                                                                            money_add = money_add - 100;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 10000 && money_add <= 100000) {
                                                                            money_add = money_add - 1000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 100000 && money_add <= 1000000) {
                                                                            money_add = money_add - 100000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        }

                                                                        select_shopping = 2;
                                                                        shop_again = false;
                                                                        continue;
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        }

                                                        case 4: {
                                                            int price = 1500;

                                                            if (balance > price && balance > min_balance && (balance - price > 2000)) {
                                                                System.out.println("Reebok Selected");
                                                                System.out.println("Do you proceed to buy the Reebok product");

                                                                System.out.println("press 1 to buy the product");
                                                                System.out.println("press 2 for Shop Menu");
                                                                int bill_options = sc.nextInt();
                                                                while (bill_options > 2 || bill_options <= 0) {
                                                                    System.out.println("\nInvalid number selected. ");
                                                                    bill_options = sc.nextInt();
                                                                }

                                                                switch (bill_options) {
                                                                    case 1: {
                                                                        System.out.println("You bought Reebok worth " + price);
                                                                        balance = balance - price;
                                                                        System.out.println("your updated balance is " + balance);

                                                                        System.out.println("\nDo you want to continue Shopping?");
                                                                        System.out.println("Press 1 to continue shopping");
                                                                        System.out.println("Press 2 to exit or logout");
                                                                        int shop_2nd = sc.nextInt();

                                                                        while (shop_2nd < 0 || shop_2nd > 2) {
                                                                            System.out.println("\nInvalid Input");
                                                                            System.out.println("Press 1 to continue shopping");
                                                                            System.out.println("Press 2 to exit or logout");
                                                                            shop_2nd = sc.nextInt();
                                                                        }

                                                                        switch (shop_2nd) {
                                                                            case 1: {
                                                                                shop_again = false;
                                                                                break;
                                                                            }

                                                                            case 2: {
                                                                                shop_again = true;
                                                                                break;
                                                                            }
                                                                        }
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }

                                                            } else {
                                                                System.out.println("You don't have sufficient balance. your " +
                                                                        "current balance is " + balance);

                                                                System.out.println("\nPress 1 to add money?");
                                                                System.out.println("press 2 to return back");
                                                                int again_shop = sc.nextInt();

                                                                while (again_shop < 0 || again_shop > 2) {
                                                                    System.out.println("Invalid Input. Please try again");
                                                                    System.out.println("\nPress 1 to add money");
                                                                    System.out.println("\nPress 2 return back");
                                                                    again_shop = sc.nextInt();
                                                                }

                                                                switch (again_shop) {
                                                                    case 1: {

                                                                        System.out.println("\nAdd money is Selected ➕");

                                                                        System.out.println("\nminimum balance is " + min_balance);
                                                                        System.out.println("your current balance is " + balance);
                                                                        System.out.println("Enter amount to be added");

                                                                        int money_add = sc.nextInt();

                                                                        while (money_add < 1000 || money_add > 1000000) {
                                                                            System.out.println("minimum amount to be added is 1000 and maximum amount" +
                                                                                    " is 1000000");
                                                                            money_add = sc.nextInt();
                                                                        }

                                                                        if (money_add >= 1000 && money_add <= 10000) {
                                                                            money_add = money_add - 100;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 10000 && money_add <= 100000) {
                                                                            money_add = money_add - 1000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 100000 && money_add <= 1000000) {
                                                                            money_add = money_add - 100000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        }

                                                                        select_shopping = 2;
                                                                        shop_again = false;
                                                                        continue;
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        }

                                                        case 5: {
                                                            int price = 5500;

                                                            if (balance > price && balance > min_balance && (balance - price > 2000)) {
                                                                System.out.println("Converse Selected");
                                                                System.out.println("Do you proceed to buy the Converse product");

                                                                System.out.println("press 1 to buy the product");
                                                                System.out.println("press 2 for Shop Menu");
                                                                int bill_options = sc.nextInt();
                                                                while (bill_options > 2 || bill_options <= 0) {
                                                                    System.out.println("\nInvalid number selected. ");
                                                                    bill_options = sc.nextInt();
                                                                }

                                                                switch (bill_options) {
                                                                    case 1: {
                                                                        System.out.println("You bought Converse worth " + price);
                                                                        balance = balance - price;
                                                                        System.out.println("your updated balance is " + balance);

                                                                        System.out.println("\nDo you want to continue Shopping?");
                                                                        System.out.println("Press 1 to continue shopping");
                                                                        System.out.println("Press 2 to exit or logout");
                                                                        int shop_2nd = sc.nextInt();

                                                                        while (shop_2nd < 0 || shop_2nd > 2) {
                                                                            System.out.println("\nInvalid Input");
                                                                            System.out.println("Press 1 to continue shopping");
                                                                            System.out.println("Press 2 to exit or logout");
                                                                            shop_2nd = sc.nextInt();
                                                                        }

                                                                        switch (shop_2nd) {
                                                                            case 1: {
                                                                                shop_again = false;
                                                                                break;
                                                                            }

                                                                            case 2: {
                                                                                shop_again = true;
                                                                                break;
                                                                            }
                                                                        }
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }

                                                            } else {
                                                                System.out.println("You don't have sufficient balance. your " +
                                                                        "current balance is " + balance);

                                                                System.out.println("\nPress 1 to add money?");
                                                                System.out.println("press 2 to return back");
                                                                int again_shop = sc.nextInt();

                                                                while (again_shop < 0 || again_shop > 2) {
                                                                    System.out.println("Invalid Input. Please try again");
                                                                    System.out.println("\nPress 1 to add money");
                                                                    System.out.println("\nPress 2 return back");
                                                                    again_shop = sc.nextInt();
                                                                }

                                                                switch (again_shop) {
                                                                    case 1: {

                                                                        System.out.println("\nAdd money is Selected ➕");

                                                                        System.out.println("\nminimum balance is " + min_balance);
                                                                        System.out.println("your current balance is " + balance);
                                                                        System.out.println("Enter amount to be added");

                                                                        int money_add = sc.nextInt();

                                                                        while (money_add < 1000 || money_add > 1000000) {
                                                                            System.out.println("minimum amount to be added is 1000 and maximum amount" +
                                                                                    " is 1000000");
                                                                            money_add = sc.nextInt();
                                                                        }

                                                                        if (money_add >= 1000 && money_add <= 10000) {
                                                                            money_add = money_add - 100;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 10000 && money_add <= 100000) {
                                                                            money_add = money_add - 1000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 100000 && money_add <= 1000000) {
                                                                            money_add = money_add - 100000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        }

                                                                        select_shopping = 2;
                                                                        shop_again = false;
                                                                        continue;
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        }

                                                        case 6: {
                                                            break;
                                                        }
                                                    }

                                                    break;
                                                }

                                                case 3: {
                                                    System.out.println("\nSelected Hoodies 👕");

                                                    System.out.println("press 1 for Champion - 50000");
                                                    System.out.println("press 2 for The North Face - 15000");
                                                    System.out.println("press 3 for Adidas - 1000");
                                                    System.out.println("press 4 for Under Armour - 1500");
                                                    System.out.println("press 5 for Carhartt - 1200");
                                                    System.out.println("press 6 for accessories Menu");

                                                    int hoodies_options = sc.nextInt();

                                                    while (hoodies_options > 6 || hoodies_options <= 0) {
                                                        System.out.println("\nInvalid number. ");

                                                        System.out.println("press 1 for Champion - 50000");
                                                        System.out.println("press 2 for The North Face - 15000");
                                                        System.out.println("press 3 for Adidas - 1000");
                                                        System.out.println("press 4 for Under Armour - 1500");
                                                        System.out.println("press 5 for Carhartt - 1200");
                                                        System.out.println("press 6 for accessories Menu");

                                                        hoodies_options = sc.nextInt();
                                                    }

                                                    switch (hoodies_options) {
                                                        case 1: {
                                                            int price = 50000;

                                                            if (balance > price && balance > min_balance && (balance - price > 2000)) {
                                                                System.out.println("Champion Selected");
                                                                System.out.println("Do you proceed to buy the Champion product");

                                                                System.out.println("press 1 to buy the product");
                                                                System.out.println("press 2 for Shop Menu");
                                                                int bill_options = sc.nextInt();
                                                                while (bill_options > 2 || bill_options <= 0) {
                                                                    System.out.println("\nInvalid number selected. ");
                                                                    bill_options = sc.nextInt();
                                                                }

                                                                switch (bill_options) {
                                                                    case 1: {
                                                                        System.out.println("You bought Champion worth " + price);
                                                                        balance = balance - price;
                                                                        System.out.println("your updated balance is " + balance);

                                                                        System.out.println("\nDo you want to continue Shopping?");
                                                                        System.out.println("Press 1 to continue shopping");
                                                                        System.out.println("Press 2 to exit or logout");
                                                                        int shop_2nd = sc.nextInt();

                                                                        while (shop_2nd < 0 || shop_2nd > 2) {
                                                                            System.out.println("\nInvalid Input");
                                                                            System.out.println("Press 1 to continue shopping");
                                                                            System.out.println("Press 2 to exit or logout");
                                                                            shop_2nd = sc.nextInt();
                                                                        }

                                                                        switch (shop_2nd) {
                                                                            case 1: {
                                                                                shop_again = false;
                                                                                break;
                                                                            }

                                                                            case 2: {
                                                                                shop_again = true;
                                                                                break;
                                                                            }
                                                                        }
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }

                                                            } else {
                                                                System.out.println("You don't have sufficient balance. your " +
                                                                        "current balance is " + balance);

                                                                System.out.println("\nPress 1 to add money?");
                                                                System.out.println("press 2 to return back");
                                                                int again_shop = sc.nextInt();

                                                                while (again_shop < 0 || again_shop > 2) {
                                                                    System.out.println("Invalid Input. Please try again");
                                                                    System.out.println("\nPress 1 to add money");
                                                                    System.out.println("\nPress 2 return back");
                                                                    again_shop = sc.nextInt();
                                                                }

                                                                switch (again_shop) {
                                                                    case 1: {

                                                                        System.out.println("\nAdd money is Selected ➕");

                                                                        System.out.println("\nminimum balance is " + min_balance);
                                                                        System.out.println("your current balance is " + balance);
                                                                        System.out.println("Enter amount to be added");

                                                                        int money_add = sc.nextInt();

                                                                        while (money_add < 1000 || money_add > 1000000) {
                                                                            System.out.println("minimum amount to be added is 1000 and maximum amount" +
                                                                                    " is 1000000");
                                                                            money_add = sc.nextInt();
                                                                        }

                                                                        if (money_add >= 1000 && money_add <= 10000) {
                                                                            money_add = money_add - 100;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 10000 && money_add <= 100000) {
                                                                            money_add = money_add - 1000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 100000 && money_add <= 1000000) {
                                                                            money_add = money_add - 100000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        }

                                                                        select_shopping = 3;
                                                                        shop_again = false;
                                                                        continue;
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        }

                                                        case 2: {
                                                            int price = 15000;

                                                            if (balance > price && balance > min_balance && (balance - price > 2000)) {
                                                                System.out.println("The North Face Selected");
                                                                System.out.println("Do you proceed to buy the The North Face " +
                                                                        "product");
                                                                System.out.println("press 1 to buy the product");
                                                                System.out.println("press 2 for Shop Menu");
                                                                int bill_options = sc.nextInt();
                                                                while (bill_options > 2 || bill_options <= 0) {
                                                                    System.out.println("\nInvalid number selected. ");
                                                                    bill_options = sc.nextInt();
                                                                }

                                                                switch (bill_options) {
                                                                    case 1: {
                                                                        System.out.println("You bought North Face worth " + price);
                                                                        balance = balance - price;
                                                                        System.out.println("your updated balance is " + balance);

                                                                        System.out.println("\nDo you want to continue Shopping?");
                                                                        System.out.println("Press 1 to continue shopping");
                                                                        System.out.println("Press 2 to exit or logout");
                                                                        int shop_2nd = sc.nextInt();

                                                                        while (shop_2nd < 0 || shop_2nd > 2) {
                                                                            System.out.println("\nInvalid Input");
                                                                            System.out.println("Press 1 to continue shopping");
                                                                            System.out.println("Press 2 to exit or logout");
                                                                            shop_2nd = sc.nextInt();
                                                                        }

                                                                        switch (shop_2nd) {
                                                                            case 1: {
                                                                                shop_again = false;
                                                                                break;
                                                                            }

                                                                            case 2: {
                                                                                shop_again = true;
                                                                                break;
                                                                            }
                                                                        }
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }

                                                            } else {
                                                                System.out.println("You don't have sufficient balance. your " +
                                                                        "current balance is " + balance);

                                                                System.out.println("\nPress 1 to add money?");
                                                                System.out.println("press 2 to return back");
                                                                int again_shop = sc.nextInt();

                                                                while (again_shop < 0 || again_shop > 2) {
                                                                    System.out.println("Invalid Input. Please try again");
                                                                    System.out.println("\nPress 1 to add money");
                                                                    System.out.println("\nPress 2 return back");
                                                                    again_shop = sc.nextInt();
                                                                }

                                                                switch (again_shop) {
                                                                    case 1: {

                                                                        System.out.println("\nAdd money is Selected ➕");

                                                                        System.out.println("\nminimum balance is " + min_balance);
                                                                        System.out.println("your current balance is " + balance);
                                                                        System.out.println("Enter amount to be added");

                                                                        int money_add = sc.nextInt();

                                                                        while (money_add < 1000 || money_add > 1000000) {
                                                                            System.out.println("minimum amount to be added is 1000 and maximum amount" +
                                                                                    " is 1000000");
                                                                            money_add = sc.nextInt();
                                                                        }

                                                                        if (money_add >= 1000 && money_add <= 10000) {
                                                                            money_add = money_add - 100;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 10000 && money_add <= 100000) {
                                                                            money_add = money_add - 1000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 100000 && money_add <= 1000000) {
                                                                            money_add = money_add - 100000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        }

                                                                        select_shopping = 3;
                                                                        shop_again = false;
                                                                        continue;
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        }

                                                        case 3: {
                                                            int price = 1000;

                                                            if (balance > price && balance > min_balance && (balance - price > 2000)) {
                                                                System.out.println("Adidas Selected");
                                                                System.out.println("Do you proceed to buy the Adidas product");

                                                                System.out.println("press 1 to buy the product");
                                                                System.out.println("press 2 for Shop Menu");
                                                                int bill_options = sc.nextInt();
                                                                while (bill_options > 2 || bill_options <= 0) {
                                                                    System.out.println("\nInvalid number selected. ");
                                                                    bill_options = sc.nextInt();
                                                                }

                                                                switch (bill_options) {
                                                                    case 1: {
                                                                        System.out.println("You bought Adidas worth " + price);
                                                                        balance = balance - price;
                                                                        System.out.println("your updated balance is " + balance);

                                                                        System.out.println("\nDo you want to continue Shopping?");
                                                                        System.out.println("Press 1 to continue shopping");
                                                                        System.out.println("Press 2 to exit or logout");
                                                                        int shop_2nd = sc.nextInt();

                                                                        while (shop_2nd < 0 || shop_2nd > 2) {
                                                                            System.out.println("\nInvalid Input");
                                                                            System.out.println("Press 1 to continue shopping");
                                                                            System.out.println("Press 2 to exit or logout");
                                                                            shop_2nd = sc.nextInt();
                                                                        }

                                                                        switch (shop_2nd) {
                                                                            case 1: {
                                                                                shop_again = false;
                                                                                break;
                                                                            }

                                                                            case 2: {
                                                                                shop_again = true;
                                                                                break;
                                                                            }
                                                                        }
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }

                                                            } else {
                                                                System.out.println("You don't have sufficient balance. your " +
                                                                        "current balance is " + balance);

                                                                System.out.println("\nPress 1 to add money?");
                                                                System.out.println("press 2 to return back");
                                                                int again_shop = sc.nextInt();

                                                                while (again_shop < 0 || again_shop > 2) {
                                                                    System.out.println("Invalid Input. Please try again");
                                                                    System.out.println("\nPress 1 to add money");
                                                                    System.out.println("\nPress 2 return back");
                                                                    again_shop = sc.nextInt();
                                                                }

                                                                switch (again_shop) {
                                                                    case 1: {

                                                                        System.out.println("\nAdd money is Selected ➕");

                                                                        System.out.println("\nminimum balance is " + min_balance);
                                                                        System.out.println("your current balance is " + balance);
                                                                        System.out.println("Enter amount to be added");

                                                                        int money_add = sc.nextInt();

                                                                        while (money_add < 1000 || money_add > 1000000) {
                                                                            System.out.println("minimum amount to be added is 1000 and maximum amount" +
                                                                                    " is 1000000");
                                                                            money_add = sc.nextInt();
                                                                        }

                                                                        if (money_add >= 1000 && money_add <= 10000) {
                                                                            money_add = money_add - 100;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 10000 && money_add <= 100000) {
                                                                            money_add = money_add - 1000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 100000 && money_add <= 1000000) {
                                                                            money_add = money_add - 100000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        }

                                                                        select_shopping = 3;
                                                                        shop_again = false;
                                                                        continue;
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        }

                                                        case 4: {
                                                            int price = 1500;

                                                            if (balance > price && balance > min_balance && (balance - price > 2000)) {
                                                                System.out.println("Under Armour Selected");
                                                                System.out.println("Do you proceed to buy the Under Armour " +
                                                                        "product");
                                                                System.out.println("press 1 to buy the product");
                                                                System.out.println("press 2 for Shop Menu");
                                                                int bill_options = sc.nextInt();
                                                                while (bill_options > 2 || bill_options <= 0) {
                                                                    System.out.println("\nInvalid number selected. ");
                                                                    bill_options = sc.nextInt();
                                                                }

                                                                switch (bill_options) {
                                                                    case 1: {
                                                                        System.out.println("You bought Under Armour  worth " + price);
                                                                        balance = balance - price;
                                                                        System.out.println("your updated balance is " + balance);

                                                                        System.out.println("\nDo you want to continue Shopping?");
                                                                        System.out.println("Press 1 to continue shopping");
                                                                        System.out.println("Press 2 to exit or logout");
                                                                        int shop_2nd = sc.nextInt();

                                                                        while (shop_2nd < 0 || shop_2nd > 2) {
                                                                            System.out.println("\nInvalid Input");
                                                                            System.out.println("Press 1 to continue shopping");
                                                                            System.out.println("Press 2 to exit or logout");
                                                                            shop_2nd = sc.nextInt();
                                                                        }

                                                                        switch (shop_2nd) {
                                                                            case 1: {
                                                                                shop_again = false;
                                                                                break;
                                                                            }

                                                                            case 2: {
                                                                                shop_again = true;
                                                                                break;
                                                                            }
                                                                        }
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }

                                                            } else {
                                                                System.out.println("You don't have sufficient balance. your " +
                                                                        "current balance is " + balance);

                                                                System.out.println("\nPress 1 to add money?");
                                                                System.out.println("press 2 to return back");
                                                                int again_shop = sc.nextInt();

                                                                while (again_shop < 0 || again_shop > 2) {
                                                                    System.out.println("Invalid Input. Please try again");
                                                                    System.out.println("\nPress 1 to add money");
                                                                    System.out.println("\nPress 2 return back");
                                                                    again_shop = sc.nextInt();
                                                                }

                                                                switch (again_shop) {
                                                                    case 1: {

                                                                        System.out.println("\nAdd money is Selected ➕");

                                                                        System.out.println("\nminimum balance is " + min_balance);
                                                                        System.out.println("your current balance is " + balance);
                                                                        System.out.println("Enter amount to be added");

                                                                        int money_add = sc.nextInt();

                                                                        while (money_add < 1000 || money_add > 1000000) {
                                                                            System.out.println("minimum amount to be added is 1000 and maximum amount" +
                                                                                    " is 1000000");
                                                                            money_add = sc.nextInt();
                                                                        }

                                                                        if (money_add >= 1000 && money_add <= 10000) {
                                                                            money_add = money_add - 100;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 10000 && money_add <= 100000) {
                                                                            money_add = money_add - 1000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 100000 && money_add <= 1000000) {
                                                                            money_add = money_add - 100000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        }

                                                                        select_shopping = 3;
                                                                        shop_again = false;
                                                                        continue;
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        }

                                                        case 5: {
                                                            int price = 1200;

                                                            if (balance > price && balance > min_balance && (balance - price > 2000)) {
                                                                System.out.println("Carhartt Selected");
                                                                System.out.println("Do you proceed to buy the Carhartt product");

                                                                System.out.println("press 1 to buy the product");
                                                                System.out.println("press 2 for Shop Menu");
                                                                int bill_options = sc.nextInt();
                                                                while (bill_options > 2 || bill_options <= 0) {
                                                                    System.out.println("\nInvalid number selected. ");
                                                                    bill_options = sc.nextInt();
                                                                }

                                                                switch (bill_options) {
                                                                    case 1: {
                                                                        System.out.println("You bought Carhartt worth " + price);
                                                                        balance = balance - price;
                                                                        System.out.println("your updated balance is " + balance);

                                                                        System.out.println("\nDo you want to continue Shopping?");
                                                                        System.out.println("Press 1 to continue shopping");
                                                                        System.out.println("Press 2 to exit or logout");
                                                                        int shop_2nd = sc.nextInt();

                                                                        while (shop_2nd < 0 || shop_2nd > 2) {
                                                                            System.out.println("\nInvalid Input");
                                                                            System.out.println("Press 1 to continue shopping");
                                                                            System.out.println("Press 2 to exit or logout");
                                                                            shop_2nd = sc.nextInt();
                                                                        }

                                                                        switch (shop_2nd) {
                                                                            case 1: {
                                                                                shop_again = false;
                                                                                break;
                                                                            }

                                                                            case 2: {
                                                                                shop_again = true;
                                                                                break;
                                                                            }
                                                                        }
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }

                                                            } else {
                                                                System.out.println("You don't have sufficient balance. your " +
                                                                        "current balance is " + balance);

                                                                System.out.println("\nPress 1 to add money?");
                                                                System.out.println("press 2 to return back");
                                                                int again_shop = sc.nextInt();

                                                                while (again_shop < 0 || again_shop > 2) {
                                                                    System.out.println("Invalid Input. Please try again");
                                                                    System.out.println("\nPress 1 to add money");
                                                                    System.out.println("\nPress 2 return back");
                                                                    again_shop = sc.nextInt();
                                                                }

                                                                switch (again_shop) {
                                                                    case 1: {

                                                                        System.out.println("\nAdd money is Selected ➕");

                                                                        System.out.println("\nminimum balance is " + min_balance);
                                                                        System.out.println("your current balance is " + balance);
                                                                        System.out.println("Enter amount to be added");

                                                                        int money_add = sc.nextInt();

                                                                        while (money_add < 1000 || money_add > 1000000) {
                                                                            System.out.println("minimum amount to be added is 1000 and maximum amount" +
                                                                                    " is 1000000");
                                                                            money_add = sc.nextInt();
                                                                        }

                                                                        if (money_add >= 1000 && money_add <= 10000) {
                                                                            money_add = money_add - 100;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 10000 && money_add <= 100000) {
                                                                            money_add = money_add - 1000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 100000 && money_add <= 1000000) {
                                                                            money_add = money_add - 100000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        }

                                                                        select_shopping = 3;
                                                                        shop_again = false;
                                                                        continue;
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        }

                                                        case 6: {
                                                            break;
                                                        }
                                                    }

                                                    break;
                                                }

                                                case 4: {
                                                    System.out.println("\nSelected Caps 🧢");

                                                    System.out.println("press 1 for New Era - 500");
                                                    System.out.println("press 2 for Flex-fit - 1000");
                                                    System.out.println("press 3 for Yupoong - 1500");
                                                    System.out.println("press 4 for Richardson - 450");
                                                    System.out.println("press 5 for Mitchell & Ness - 700");
                                                    System.out.println("press 6 for accessories Menu");

                                                    int caps_options = sc.nextInt();

                                                    while (caps_options > 6 || caps_options <= 0) {
                                                        System.out.println("\nInvalid number. ");

                                                        System.out.println("press 1 for New Era - 500");
                                                        System.out.println("press 2 for Flex-fit - 1000");
                                                        System.out.println("press 3 for Yupoong - 1500");
                                                        System.out.println("press 4 for Richardson - 450");
                                                        System.out.println("press 5 for Mitchell & Ness - 700");
                                                        System.out.println("press 6 for accessories Menu");

                                                        caps_options = sc.nextInt();
                                                    }

                                                    switch (caps_options) {
                                                        case 1: {
                                                            int price = 500;

                                                            if (balance > price && balance > min_balance && (balance - price > 2000)) {
                                                                System.out.println("New Era Selected");
                                                                System.out.println("Do you proceed to buy the New Era product");

                                                                System.out.println("press 1 to buy the product");
                                                                System.out.println("press 2 for Shop Menu");
                                                                int bill_options = sc.nextInt();
                                                                while (bill_options > 2 || bill_options <= 0) {
                                                                    System.out.println("\nInvalid number selected. ");
                                                                    bill_options = sc.nextInt();
                                                                }

                                                                switch (bill_options) {
                                                                    case 1: {
                                                                        System.out.println("You bought New Era worth " + price);
                                                                        balance = balance - price;
                                                                        System.out.println("your updated balance is " + balance);

                                                                        System.out.println("\nDo you want to continue Shopping?");
                                                                        System.out.println("Press 1 to continue shopping");
                                                                        System.out.println("Press 2 to exit or logout");
                                                                        int shop_2nd = sc.nextInt();

                                                                        while (shop_2nd < 0 || shop_2nd > 2) {
                                                                            System.out.println("\nInvalid Input");
                                                                            System.out.println("Press 1 to continue shopping");
                                                                            System.out.println("Press 2 to exit or logout");
                                                                            shop_2nd = sc.nextInt();
                                                                        }

                                                                        switch (shop_2nd) {
                                                                            case 1: {
                                                                                shop_again = false;
                                                                                break;
                                                                            }

                                                                            case 2: {
                                                                                shop_again = true;
                                                                                break;
                                                                            }
                                                                        }
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }

                                                            } else {
                                                                System.out.println("You don't have sufficient balance. your " +
                                                                        "current balance is " + balance);

                                                                System.out.println("\nPress 1 to add money?");
                                                                System.out.println("press 2 to return back");
                                                                int again_shop = sc.nextInt();

                                                                while (again_shop < 0 || again_shop > 2) {
                                                                    System.out.println("Invalid Input. Please try again");
                                                                    System.out.println("\nPress 1 to add money");
                                                                    System.out.println("\nPress 2 return back");
                                                                    again_shop = sc.nextInt();
                                                                }

                                                                switch (again_shop) {
                                                                    case 1: {

                                                                        System.out.println("\nAdd money is Selected ➕");

                                                                        System.out.println("\nminimum balance is " + min_balance);
                                                                        System.out.println("your current balance is " + balance);
                                                                        System.out.println("Enter amount to be added");

                                                                        int money_add = sc.nextInt();

                                                                        while (money_add < 1000 || money_add > 1000000) {
                                                                            System.out.println("minimum amount to be added is 1000 and maximum amount" +
                                                                                    " is 1000000");
                                                                            money_add = sc.nextInt();
                                                                        }

                                                                        if (money_add >= 1000 && money_add <= 10000) {
                                                                            money_add = money_add - 100;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 10000 && money_add <= 100000) {
                                                                            money_add = money_add - 1000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 100000 && money_add <= 1000000) {
                                                                            money_add = money_add - 100000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        }

                                                                        select_shopping = 4;
                                                                        shop_again = false;
                                                                        continue;
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        }

                                                        case 2: {
                                                            int price = 1000;

                                                            if (balance > price && balance > min_balance && (balance - price > 2000)) {
                                                                System.out.println("Flex-fit Selected");
                                                                System.out.println("Do you proceed to buy the Flex-fit product");

                                                                System.out.println("press 1 to buy the product");
                                                                System.out.println("press 2 for Shop Menu");
                                                                int bill_options = sc.nextInt();
                                                                while (bill_options > 2 || bill_options <= 0) {
                                                                    System.out.println("\nInvalid number selected. ");
                                                                    bill_options = sc.nextInt();
                                                                }

                                                                switch (bill_options) {
                                                                    case 1: {
                                                                        System.out.println("You bought Flex-fit worth " + price);
                                                                        balance = balance - price;
                                                                        System.out.println("your updated balance is " + balance);

                                                                        System.out.println("\nDo you want to continue Shopping?");
                                                                        System.out.println("Press 1 to continue shopping");
                                                                        System.out.println("Press 2 to exit or logout");
                                                                        int shop_2nd = sc.nextInt();

                                                                        while (shop_2nd < 0 || shop_2nd > 2) {
                                                                            System.out.println("\nInvalid Input");
                                                                            System.out.println("Press 1 to continue shopping");
                                                                            System.out.println("Press 2 to exit or logout");
                                                                            shop_2nd = sc.nextInt();
                                                                        }

                                                                        switch (shop_2nd) {
                                                                            case 1: {
                                                                                shop_again = false;
                                                                                break;
                                                                            }

                                                                            case 2: {
                                                                                shop_again = true;
                                                                                break;
                                                                            }
                                                                        }
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }

                                                            } else {
                                                                System.out.println("You don't have sufficient balance. your " +
                                                                        "current balance is " + balance);

                                                                System.out.println("\nPress 1 to add money?");
                                                                System.out.println("press 2 to return back");
                                                                int again_shop = sc.nextInt();

                                                                while (again_shop < 0 || again_shop > 2) {
                                                                    System.out.println("Invalid Input. Please try again");
                                                                    System.out.println("\nPress 1 to add money");
                                                                    System.out.println("\nPress 2 return back");
                                                                    again_shop = sc.nextInt();
                                                                }

                                                                switch (again_shop) {
                                                                    case 1: {

                                                                        System.out.println("\nAdd money is Selected ➕");

                                                                        System.out.println("\nminimum balance is " + min_balance);
                                                                        System.out.println("your current balance is " + balance);
                                                                        System.out.println("Enter amount to be added");

                                                                        int money_add = sc.nextInt();

                                                                        while (money_add < 1000 || money_add > 1000000) {
                                                                            System.out.println("minimum amount to be added is 1000 and maximum amount" +
                                                                                    " is 1000000");
                                                                            money_add = sc.nextInt();
                                                                        }

                                                                        if (money_add >= 1000 && money_add <= 10000) {
                                                                            money_add = money_add - 100;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 10000 && money_add <= 100000) {
                                                                            money_add = money_add - 1000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 100000 && money_add <= 1000000) {
                                                                            money_add = money_add - 100000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        }

                                                                        select_shopping = 4;
                                                                        shop_again = false;
                                                                        continue;
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        }

                                                        case 3: {
                                                            int price = 1500;

                                                            if (balance > price && balance > min_balance && (balance - price > 2000)) {
                                                                System.out.println("Yupoong Selected");
                                                                System.out.println("Do you proceed to buy the Yupoong product");

                                                                System.out.println("press 1 to buy the product");
                                                                System.out.println("press 2 for Shop Menu");
                                                                int bill_options = sc.nextInt();
                                                                while (bill_options > 2 || bill_options <= 0) {
                                                                    System.out.println("\nInvalid number selected. ");
                                                                    bill_options = sc.nextInt();
                                                                }

                                                                switch (bill_options) {
                                                                    case 1: {
                                                                        System.out.println("You bought Yupoong worth " + price);
                                                                        balance = balance - price;
                                                                        System.out.println("your updated balance is " + balance);

                                                                        System.out.println("\nDo you want to continue Shopping?");
                                                                        System.out.println("Press 1 to continue shopping");
                                                                        System.out.println("Press 2 to exit or logout");
                                                                        int shop_2nd = sc.nextInt();

                                                                        while (shop_2nd < 0 || shop_2nd > 2) {
                                                                            System.out.println("\nInvalid Input");
                                                                            System.out.println("Press 1 to continue shopping");
                                                                            System.out.println("Press 2 to exit or logout");
                                                                            shop_2nd = sc.nextInt();
                                                                        }

                                                                        switch (shop_2nd) {
                                                                            case 1: {
                                                                                shop_again = false;
                                                                                break;
                                                                            }

                                                                            case 2: {
                                                                                shop_again = true;
                                                                                break;
                                                                            }
                                                                        }
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }

                                                            } else {
                                                                System.out.println("You don't have sufficient balance. your " +
                                                                        "current balance is " + balance);

                                                                System.out.println("\nPress 1 to add money?");
                                                                System.out.println("press 2 to return back");
                                                                int again_shop = sc.nextInt();

                                                                while (again_shop < 0 || again_shop > 2) {
                                                                    System.out.println("Invalid Input. Please try again");
                                                                    System.out.println("\nPress 1 to add money");
                                                                    System.out.println("\nPress 2 return back");
                                                                    again_shop = sc.nextInt();
                                                                }

                                                                switch (again_shop) {
                                                                    case 1: {

                                                                        System.out.println("\nAdd money is Selected ➕");

                                                                        System.out.println("\nminimum balance is " + min_balance);
                                                                        System.out.println("your current balance is " + balance);
                                                                        System.out.println("Enter amount to be added");

                                                                        int money_add = sc.nextInt();

                                                                        while (money_add < 1000 || money_add > 1000000) {
                                                                            System.out.println("minimum amount to be added is 1000 and maximum amount" +
                                                                                    " is 1000000");
                                                                            money_add = sc.nextInt();
                                                                        }

                                                                        if (money_add >= 1000 && money_add <= 10000) {
                                                                            money_add = money_add - 100;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 10000 && money_add <= 100000) {
                                                                            money_add = money_add - 1000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 100000 && money_add <= 1000000) {
                                                                            money_add = money_add - 100000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        }

                                                                        select_shopping = 4;
                                                                        shop_again = false;
                                                                        continue;
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        }

                                                        case 4: {
                                                            int price = 450;

                                                            if (balance > price && balance > min_balance && (balance - price > 2000)) {
                                                                System.out.println("Richardson Selected");
                                                                System.out.println("Do you proceed to buy the Richardson product");

                                                                System.out.println("press 1 to buy the product");
                                                                System.out.println("press 2 for Shop Menu");
                                                                int bill_options = sc.nextInt();
                                                                while (bill_options > 2 || bill_options <= 0) {
                                                                    System.out.println("\nInvalid number selected. ");
                                                                    bill_options = sc.nextInt();
                                                                }

                                                                switch (bill_options) {
                                                                    case 1: {
                                                                        System.out.println("You bought Richardson worth " + price);
                                                                        balance = balance - price;
                                                                        System.out.println("your updated balance is " + balance);

                                                                        System.out.println("\nDo you want to continue Shopping?");
                                                                        System.out.println("Press 1 to continue shopping");
                                                                        System.out.println("Press 2 to exit or logout");
                                                                        int shop_2nd = sc.nextInt();

                                                                        while (shop_2nd < 0 || shop_2nd > 2) {
                                                                            System.out.println("\nInvalid Input");
                                                                            System.out.println("Press 1 to continue shopping");
                                                                            System.out.println("Press 2 to exit or logout");
                                                                            shop_2nd = sc.nextInt();
                                                                        }

                                                                        switch (shop_2nd) {
                                                                            case 1: {
                                                                                shop_again = false;
                                                                                break;
                                                                            }

                                                                            case 2: {
                                                                                shop_again = true;
                                                                                break;
                                                                            }
                                                                        }
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }

                                                            } else {
                                                                System.out.println("You don't have sufficient balance. your " +
                                                                        "current balance is " + balance);

                                                                System.out.println("\nPress 1 to add money?");
                                                                System.out.println("press 2 to return back");
                                                                int again_shop = sc.nextInt();

                                                                while (again_shop < 0 || again_shop > 2) {
                                                                    System.out.println("Invalid Input. Please try again");
                                                                    System.out.println("\nPress 1 to add money");
                                                                    System.out.println("\nPress 2 return back");
                                                                    again_shop = sc.nextInt();
                                                                }

                                                                switch (again_shop) {
                                                                    case 1: {

                                                                        System.out.println("\nAdd money is Selected ➕");

                                                                        System.out.println("\nminimum balance is " + min_balance);
                                                                        System.out.println("your current balance is " + balance);
                                                                        System.out.println("Enter amount to be added");

                                                                        int money_add = sc.nextInt();

                                                                        while (money_add < 1000 || money_add > 1000000) {
                                                                            System.out.println("minimum amount to be added is 1000 and maximum amount" +
                                                                                    " is 1000000");
                                                                            money_add = sc.nextInt();
                                                                        }

                                                                        if (money_add >= 1000 && money_add <= 10000) {
                                                                            money_add = money_add - 100;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 10000 && money_add <= 100000) {
                                                                            money_add = money_add - 1000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 100000 && money_add <= 1000000) {
                                                                            money_add = money_add - 100000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        }

                                                                        select_shopping = 4;
                                                                        shop_again = false;
                                                                        continue;
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        }

                                                        case 5: {
                                                            int price = 700;

                                                            if (balance > price && balance > min_balance && (balance - price > 2000)) {
                                                                System.out.println("Mitchell & Ness Selected");
                                                                System.out.println("Do you proceed to buy the Mitchell & Ness " +
                                                                        "product");
                                                                System.out.println("press 1 to buy the product");
                                                                System.out.println("press 2 for Shop Menu");
                                                                int bill_options = sc.nextInt();
                                                                while (bill_options > 2 || bill_options <= 0) {
                                                                    System.out.println("\nInvalid number selected. ");
                                                                    bill_options = sc.nextInt();
                                                                }

                                                                switch (bill_options) {
                                                                    case 1: {
                                                                        System.out.println("You bought Mitchell & Ness worth " + price);
                                                                        balance = balance - price;
                                                                        System.out.println("your updated balance is " + balance);

                                                                        System.out.println("\nDo you want to continue Shopping?");
                                                                        System.out.println("Press 1 to continue shopping");
                                                                        System.out.println("Press 2 to exit or logout");
                                                                        int shop_2nd = sc.nextInt();

                                                                        while (shop_2nd < 0 || shop_2nd > 2) {
                                                                            System.out.println("\nInvalid Input");
                                                                            System.out.println("Press 1 to continue shopping");
                                                                            System.out.println("Press 2 to exit or logout");
                                                                            shop_2nd = sc.nextInt();
                                                                        }

                                                                        switch (shop_2nd) {
                                                                            case 1: {
                                                                                shop_again = false;
                                                                                break;
                                                                            }

                                                                            case 2: {
                                                                                shop_again = true;
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                    case 2: {

                                                                    }
                                                                    continue;
                                                                }

                                                            } else {
                                                                System.out.println("You don't have sufficient balance. your " +
                                                                        "current balance is " + balance);

                                                                System.out.println("\nPress 1 to add money?");
                                                                System.out.println("press 2 to return back");
                                                                int again_shop = sc.nextInt();

                                                                while (again_shop < 0 || again_shop > 2) {
                                                                    System.out.println("Invalid Input. Please try again");
                                                                    System.out.println("\nPress 1 to add money");
                                                                    System.out.println("\nPress 2 return back");
                                                                    again_shop = sc.nextInt();
                                                                }

                                                                switch (again_shop) {
                                                                    case 1: {

                                                                        System.out.println("\nAdd money is Selected ➕");

                                                                        System.out.println("\nminimum balance is " + min_balance);
                                                                        System.out.println("your current balance is " + balance);
                                                                        System.out.println("Enter amount to be added");

                                                                        int money_add = sc.nextInt();

                                                                        while (money_add < 1000 || money_add > 1000000) {
                                                                            System.out.println("minimum amount to be added is 1000 and maximum amount" +
                                                                                    " is 1000000");
                                                                            money_add = sc.nextInt();
                                                                        }

                                                                        if (money_add >= 1000 && money_add <= 10000) {
                                                                            money_add = money_add - 100;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 10000 && money_add <= 100000) {
                                                                            money_add = money_add - 1000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 100000 && money_add <= 1000000) {
                                                                            money_add = money_add - 100000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        }

                                                                        select_shopping = 4;
                                                                        shop_again = false;
                                                                        continue;
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        }

                                                        case 6: {
                                                            break;
                                                        }
                                                    }

                                                    break;
                                                }

                                                case 5: {
                                                    System.out.println("\nSelected Bags 👜");

                                                    System.out.println("press 1 for Louis Vuitton - 50000");
                                                    System.out.println("press 2 for Gucci - 17000");
                                                    System.out.println("press 3 for Prada - 15500");
                                                    System.out.println("press 4 for Chanel - 25900");
                                                    System.out.println("press 5 for Michael Kors - 100000");
                                                    System.out.println("press 6 for accessories Menu");

                                                    int bags_options = sc.nextInt();

                                                    while (bags_options > 6 || bags_options <= 0) {
                                                        System.out.println("\nInvalid number. ");

                                                        System.out.println("press 1 for Louis Vuitton - 50000");
                                                        System.out.println("press 2 for Gucci - 17000");
                                                        System.out.println("press 3 for Prada - 15500");
                                                        System.out.println("press 4 for Chanel - 25900");
                                                        System.out.println("press 5 for Michael Kors - 100000");
                                                        System.out.println("press 6 for accessories Menu");

                                                        bags_options = sc.nextInt();
                                                    }

                                                    switch (bags_options) {
                                                        case 1: {
                                                            int price = 50000;

                                                            if (balance > price && balance > min_balance && (balance - price > 2000)) {
                                                                System.out.println("Louis Vuitton Selected");
                                                                System.out.println("Do you proceed to buy the Louis Vuitton " +
                                                                        "product");
                                                                System.out.println("press 1 to buy the product");
                                                                System.out.println("press 2 for Shop Menu");
                                                                int bill_options = sc.nextInt();
                                                                while (bill_options > 2 || bill_options <= 0) {
                                                                    System.out.println("\nInvalid number selected. ");
                                                                    bill_options = sc.nextInt();
                                                                }

                                                                switch (bill_options) {
                                                                    case 1: {
                                                                        System.out.println("You bought Louis worth " + price);
                                                                        balance = balance - price;
                                                                        System.out.println("your updated balance is " + balance);

                                                                        System.out.println("\nDo you want to continue Shopping?");
                                                                        System.out.println("Press 1 to continue shopping");
                                                                        System.out.println("Press 2 to exit or logout");
                                                                        int shop_2nd = sc.nextInt();

                                                                        while (shop_2nd < 0 || shop_2nd > 2) {
                                                                            System.out.println("\nInvalid Input");
                                                                            System.out.println("Press 1 to continue shopping");
                                                                            System.out.println("Press 2 to exit or logout");
                                                                            shop_2nd = sc.nextInt();
                                                                        }

                                                                        switch (shop_2nd) {
                                                                            case 1: {
                                                                                shop_again = false;
                                                                                break;
                                                                            }

                                                                            case 2: {
                                                                                shop_again = true;
                                                                                break;
                                                                            }
                                                                        }
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }

                                                            } else {
                                                                System.out.println("You don't have sufficient balance. your " +
                                                                        "current balance is " + balance);

                                                                System.out.println("\nPress 1 to add money?");
                                                                System.out.println("press 2 to return back");
                                                                int again_shop = sc.nextInt();

                                                                while (again_shop < 0 || again_shop > 2) {
                                                                    System.out.println("Invalid Input. Please try again");
                                                                    System.out.println("\nPress 1 to add money");
                                                                    System.out.println("\nPress 2 return back");
                                                                    again_shop = sc.nextInt();
                                                                }

                                                                switch (again_shop) {
                                                                    case 1: {

                                                                        System.out.println("\nAdd money is Selected ➕");

                                                                        System.out.println("\nminimum balance is " + min_balance);
                                                                        System.out.println("your current balance is " + balance);
                                                                        System.out.println("Enter amount to be added");

                                                                        int money_add = sc.nextInt();

                                                                        while (money_add < 1000 || money_add > 1000000) {
                                                                            System.out.println("minimum amount to be added is 1000 and maximum amount" +
                                                                                    " is 1000000");
                                                                            money_add = sc.nextInt();
                                                                        }

                                                                        if (money_add >= 1000 && money_add <= 10000) {
                                                                            money_add = money_add - 100;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 10000 && money_add <= 100000) {
                                                                            money_add = money_add - 1000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 100000 && money_add <= 1000000) {
                                                                            money_add = money_add - 100000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        }

                                                                        select_shopping = 5;
                                                                        shop_again = false;
                                                                        continue;
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        }

                                                        case 2: {
                                                            int price = 17000;

                                                            if (balance > price && balance > min_balance && (balance - price > 2000)) {
                                                                System.out.println("Gucci Selected");
                                                                System.out.println("Do you proceed to buy the Gucci product");

                                                                System.out.println("press 1 to buy the product");
                                                                System.out.println("press 2 for Shop Menu");
                                                                int bill_options = sc.nextInt();
                                                                while (bill_options > 2 || bill_options <= 0) {
                                                                    System.out.println("\nInvalid number selected. ");
                                                                    bill_options = sc.nextInt();
                                                                }

                                                                switch (bill_options) {
                                                                    case 1: {
                                                                        System.out.println("You bought Gucci worth " + price);
                                                                        balance = balance - price;
                                                                        System.out.println("your updated balance is " + balance);

                                                                        System.out.println("\nDo you want to continue Shopping?");
                                                                        System.out.println("Press 1 to continue shopping");
                                                                        System.out.println("Press 2 to exit or logout");
                                                                        int shop_2nd = sc.nextInt();

                                                                        while (shop_2nd < 0 || shop_2nd > 2) {
                                                                            System.out.println("\nInvalid Input");
                                                                            System.out.println("Press 1 to continue shopping");
                                                                            System.out.println("Press 2 to exit or logout");
                                                                            shop_2nd = sc.nextInt();
                                                                        }

                                                                        switch (shop_2nd) {
                                                                            case 1: {
                                                                                shop_again = false;
                                                                                break;
                                                                            }

                                                                            case 2: {
                                                                                shop_again = true;
                                                                                break;
                                                                            }
                                                                        }
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }

                                                            } else {
                                                                System.out.println("You don't have sufficient balance. your " +
                                                                        "current balance is " + balance);

                                                                System.out.println("\nPress 1 to add money?");
                                                                System.out.println("press 2 to return back");
                                                                int again_shop = sc.nextInt();

                                                                while (again_shop < 0 || again_shop > 2) {
                                                                    System.out.println("Invalid Input. Please try again");
                                                                    System.out.println("\nPress 1 to add money");
                                                                    System.out.println("\nPress 2 return back");
                                                                    again_shop = sc.nextInt();
                                                                }

                                                                switch (again_shop) {
                                                                    case 1: {

                                                                        System.out.println("\nAdd money is Selected ➕");

                                                                        System.out.println("\nminimum balance is " + min_balance);
                                                                        System.out.println("your current balance is " + balance);
                                                                        System.out.println("Enter amount to be added");

                                                                        int money_add = sc.nextInt();

                                                                        while (money_add < 1000 || money_add > 1000000) {
                                                                            System.out.println("minimum amount to be added is 1000 and maximum amount" +
                                                                                    " is 1000000");
                                                                            money_add = sc.nextInt();
                                                                        }

                                                                        if (money_add >= 1000 && money_add <= 10000) {
                                                                            money_add = money_add - 100;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 10000 && money_add <= 100000) {
                                                                            money_add = money_add - 1000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 100000 && money_add <= 1000000) {
                                                                            money_add = money_add - 100000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        }

                                                                        select_shopping = 5;
                                                                        shop_again = false;
                                                                        continue;
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        }

                                                        case 3: {
                                                            int price = 15500;

                                                            if (balance > price && balance > min_balance && (balance - price > 2000)) {
                                                                System.out.println("Prada Selected");
                                                                System.out.println("Do you proceed to buy the Prada product");

                                                                System.out.println("press 1 to buy the product");
                                                                System.out.println("press 2 for Shop Menu");
                                                                int bill_options = sc.nextInt();
                                                                while (bill_options > 2 || bill_options <= 0) {
                                                                    System.out.println("\nInvalid number selected. ");
                                                                    bill_options = sc.nextInt();
                                                                }

                                                                switch (bill_options) {
                                                                    case 1: {
                                                                        System.out.println("You bought Prada worth " + price);
                                                                        balance = balance - price;
                                                                        System.out.println("your updated balance is " + balance);

                                                                        System.out.println("\nDo you want to continue Shopping?");
                                                                        System.out.println("Press 1 to continue shopping");
                                                                        System.out.println("Press 2 to exit or logout");
                                                                        int shop_2nd = sc.nextInt();

                                                                        while (shop_2nd < 0 || shop_2nd > 2) {
                                                                            System.out.println("\nInvalid Input");
                                                                            System.out.println("Press 1 to continue shopping");
                                                                            System.out.println("Press 2 to exit or logout");
                                                                            shop_2nd = sc.nextInt();
                                                                        }

                                                                        switch (shop_2nd) {
                                                                            case 1: {
                                                                                shop_again = false;
                                                                                break;
                                                                            }

                                                                            case 2: {
                                                                                shop_again = true;
                                                                                break;
                                                                            }
                                                                        }
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }

                                                            } else {
                                                                System.out.println("You don't have sufficient balance. your " +
                                                                        "current balance is " + balance);

                                                                System.out.println("\nPress 1 to add money?");
                                                                System.out.println("press 2 to return back");
                                                                int again_shop = sc.nextInt();

                                                                while (again_shop < 0 || again_shop > 2) {
                                                                    System.out.println("Invalid Input. Please try again");
                                                                    System.out.println("\nPress 1 to add money");
                                                                    System.out.println("\nPress 2 return back");
                                                                    again_shop = sc.nextInt();
                                                                }

                                                                switch (again_shop) {
                                                                    case 1: {

                                                                        System.out.println("\nAdd money is Selected ➕");

                                                                        System.out.println("\nminimum balance is " + min_balance);
                                                                        System.out.println("your current balance is " + balance);
                                                                        System.out.println("Enter amount to be added");

                                                                        int money_add = sc.nextInt();

                                                                        while (money_add < 1000 || money_add > 1000000) {
                                                                            System.out.println("minimum amount to be added is 1000 and maximum amount" +
                                                                                    " is 1000000");
                                                                            money_add = sc.nextInt();
                                                                        }

                                                                        if (money_add >= 1000 && money_add <= 10000) {
                                                                            money_add = money_add - 100;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 10000 && money_add <= 100000) {
                                                                            money_add = money_add - 1000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 100000 && money_add <= 1000000) {
                                                                            money_add = money_add - 100000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        }

                                                                        select_shopping = 5;
                                                                        shop_again = false;
                                                                        continue;
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        }

                                                        case 4: {
                                                            int price = 25900;

                                                            if (balance > price && balance > min_balance && (balance - price > 2000)) {
                                                                System.out.println("Chanel Selected");
                                                                System.out.println("Do you proceed to buy the Chanel product");

                                                                System.out.println("press 1 to buy the product");
                                                                System.out.println("press 2 for Shop Menu");
                                                                int bill_options = sc.nextInt();
                                                                while (bill_options > 2 || bill_options <= 0) {
                                                                    System.out.println("\nInvalid number selected. ");
                                                                    bill_options = sc.nextInt();
                                                                }

                                                                switch (bill_options) {
                                                                    case 1: {
                                                                        System.out.println("You bought Chanel worth " + price);
                                                                        balance = balance - price;
                                                                        System.out.println("your updated balance is " + balance);

                                                                        System.out.println("\nDo you want to continue Shopping?");
                                                                        System.out.println("Press 1 to continue shopping");
                                                                        System.out.println("Press 2 to exit or logout");
                                                                        int shop_2nd = sc.nextInt();

                                                                        while (shop_2nd < 0 || shop_2nd > 2) {
                                                                            System.out.println("\nInvalid Input");
                                                                            System.out.println("Press 1 to continue shopping");
                                                                            System.out.println("Press 2 to exit or logout");
                                                                            shop_2nd = sc.nextInt();
                                                                        }

                                                                        switch (shop_2nd) {
                                                                            case 1: {
                                                                                shop_again = false;
                                                                                break;
                                                                            }

                                                                            case 2: {
                                                                                shop_again = true;
                                                                                break;
                                                                            }
                                                                        }
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }

                                                            } else {
                                                                System.out.println("You don't have sufficient balance. your " +
                                                                        "current balance is " + balance);

                                                                System.out.println("\nPress 1 to add money?");
                                                                System.out.println("press 2 to return back");
                                                                int again_shop = sc.nextInt();

                                                                while (again_shop < 0 || again_shop > 2) {
                                                                    System.out.println("Invalid Input. Please try again");
                                                                    System.out.println("\nPress 1 to add money");
                                                                    System.out.println("\nPress 2 return back");
                                                                    again_shop = sc.nextInt();
                                                                }

                                                                switch (again_shop) {
                                                                    case 1: {

                                                                        System.out.println("\nAdd money is Selected ➕");

                                                                        System.out.println("\nminimum balance is " + min_balance);
                                                                        System.out.println("your current balance is " + balance);
                                                                        System.out.println("Enter amount to be added");

                                                                        int money_add = sc.nextInt();

                                                                        while (money_add < 1000 || money_add > 1000000) {
                                                                            System.out.println("minimum amount to be added is 1000 and maximum amount" +
                                                                                    " is 1000000");
                                                                            money_add = sc.nextInt();
                                                                        }

                                                                        if (money_add >= 1000 && money_add <= 10000) {
                                                                            money_add = money_add - 100;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 10000 && money_add <= 100000) {
                                                                            money_add = money_add - 1000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 100000 && money_add <= 1000000) {
                                                                            money_add = money_add - 100000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        }

                                                                        select_shopping = 5;
                                                                        shop_again = false;
                                                                        continue;
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        }

                                                        case 5: {
                                                            int price = 100000;

                                                            if (balance > price && balance > min_balance && (balance - price > 2000)) {
                                                                System.out.println("Michael Kors Selected");
                                                                System.out.println("Do you proceed to buy the Michael Kors " +
                                                                        "product");
                                                                System.out.println("press 1 to buy the product");
                                                                System.out.println("press 2 for Shop Menu");
                                                                int bill_options = sc.nextInt();
                                                                while (bill_options > 2 || bill_options <= 0) {
                                                                    System.out.println("\nInvalid number selected. ");
                                                                    bill_options = sc.nextInt();
                                                                }

                                                                switch (bill_options) {
                                                                    case 1: {
                                                                        System.out.println("You bought Michael Kors worth " + price);
                                                                        balance = balance - price;
                                                                        System.out.println("your updated balance is " + balance);

                                                                        System.out.println("\nDo you want to continue Shopping?");
                                                                        System.out.println("Press 1 to continue shopping");
                                                                        System.out.println("Press 2 to exit or logout");
                                                                        int shop_2nd = sc.nextInt();

                                                                        while (shop_2nd < 0 || shop_2nd > 2) {
                                                                            System.out.println("\nInvalid Input");
                                                                            System.out.println("Press 1 to continue shopping");
                                                                            System.out.println("Press 2 to exit or logout");
                                                                            shop_2nd = sc.nextInt();
                                                                        }

                                                                        switch (shop_2nd) {
                                                                            case 1: {
                                                                                shop_again = false;
                                                                                break;
                                                                            }

                                                                            case 2: {
                                                                                shop_again = true;
                                                                                break;
                                                                            }
                                                                        }
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }

                                                            } else {
                                                                System.out.println("You don't have sufficient balance. your " +
                                                                        "current balance is " + balance);

                                                                System.out.println("\nPress 1 to add money?");
                                                                System.out.println("press 2 to return back");
                                                                int again_shop = sc.nextInt();

                                                                while (again_shop < 0 || again_shop > 2) {
                                                                    System.out.println("Invalid Input. Please try again");
                                                                    System.out.println("\nPress 1 to add money");
                                                                    System.out.println("\nPress 2 return back");
                                                                    again_shop = sc.nextInt();
                                                                }

                                                                switch (again_shop) {
                                                                    case 1: {

                                                                        System.out.println("\nAdd money is Selected ➕");

                                                                        System.out.println("\nminimum balance is " + min_balance);
                                                                        System.out.println("your current balance is " + balance);
                                                                        System.out.println("Enter amount to be added");

                                                                        int money_add = sc.nextInt();

                                                                        while (money_add < 1000 || money_add > 1000000) {
                                                                            System.out.println("minimum amount to be added is 1000 and maximum amount" +
                                                                                    " is 1000000");
                                                                            money_add = sc.nextInt();
                                                                        }

                                                                        if (money_add >= 1000 && money_add <= 10000) {
                                                                            money_add = money_add - 100;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 10000 && money_add <= 100000) {
                                                                            money_add = money_add - 1000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 100000 && money_add <= 1000000) {
                                                                            money_add = money_add - 100000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        }

                                                                        select_shopping = 5;
                                                                        shop_again = false;
                                                                        continue;
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        }

                                                        case 6: {
                                                            break;
                                                        }
                                                    }

                                                    break;
                                                }

                                                case 6: {
                                                    System.out.println("\nSelected Makeup kit 💄");

                                                    System.out.println("press 1 for MAC - 1000");
                                                    System.out.println("press 2 for Sephora Collection - 500");
                                                    System.out.println("press 3 for Tarte - 1050");
                                                    System.out.println("press 4 for NARS - 700");
                                                    System.out.println("press 5 for TooFaced - 550");
                                                    System.out.println("press 6 for accessories Menu");

                                                    int makeup_options = sc.nextInt();

                                                    while (makeup_options > 6 || makeup_options <= 0) {
                                                        System.out.println("\nInvalid number. ");

                                                        System.out.println("press 1 for MAC - 1000");
                                                        System.out.println("press 2 for Sephora Collection - 500");
                                                        System.out.println("press 3 for Tarte - 1050");
                                                        System.out.println("press 4 for NARS - 700");
                                                        System.out.println("press 5 for TooFaced - 550");
                                                        System.out.println("press 6 for accessories Menu");

                                                        makeup_options = sc.nextInt();
                                                    }

                                                    switch (makeup_options) {
                                                        case 1: {
                                                            int price = 1000;

                                                            if (balance > price && balance > min_balance && (balance - price > 2000)) {
                                                                System.out.println("MAC Selected");
                                                                System.out.println("Do you proceed to buy the MAC product");

                                                                System.out.println("press 1 to buy the product");
                                                                System.out.println("press 2 for Shop Menu");
                                                                int bill_options = sc.nextInt();
                                                                while (bill_options > 2 || bill_options <= 0) {
                                                                    System.out.println("\nInvalid number selected. ");
                                                                    bill_options = sc.nextInt();
                                                                }

                                                                switch (bill_options) {
                                                                    case 1: {
                                                                        System.out.println("You bought MAC worth " + price);
                                                                        balance = balance - price;
                                                                        System.out.println("your updated balance is " + balance);

                                                                        System.out.println("\nDo you want to continue Shopping?");
                                                                        System.out.println("Press 1 to continue shopping");
                                                                        System.out.println("Press 2 to exit or logout");
                                                                        int shop_2nd = sc.nextInt();

                                                                        while (shop_2nd < 0 || shop_2nd > 2) {
                                                                            System.out.println("\nInvalid Input");
                                                                            System.out.println("Press 1 to continue shopping");
                                                                            System.out.println("Press 2 to exit or logout");
                                                                            shop_2nd = sc.nextInt();
                                                                        }

                                                                        switch (shop_2nd) {
                                                                            case 1: {
                                                                                shop_again = false;
                                                                                break;
                                                                            }

                                                                            case 2: {
                                                                                shop_again = true;
                                                                                break;
                                                                            }
                                                                        }
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }

                                                            } else {
                                                                System.out.println("You don't have sufficient balance. your " +
                                                                        "current balance is " + balance);

                                                                System.out.println("\nPress 1 to add money?");
                                                                System.out.println("press 2 to return back");
                                                                int again_shop = sc.nextInt();

                                                                while (again_shop < 0 || again_shop > 2) {
                                                                    System.out.println("Invalid Input. Please try again");
                                                                    System.out.println("\nPress 1 to add money");
                                                                    System.out.println("\nPress 2 return back");
                                                                    again_shop = sc.nextInt();
                                                                }

                                                                switch (again_shop) {
                                                                    case 1: {

                                                                        System.out.println("\nAdd money is Selected ➕");

                                                                        System.out.println("\nminimum balance is " + min_balance);
                                                                        System.out.println("your current balance is " + balance);
                                                                        System.out.println("Enter amount to be added");

                                                                        int money_add = sc.nextInt();

                                                                        while (money_add < 1000 || money_add > 1000000) {
                                                                            System.out.println("minimum amount to be added is 1000 and maximum amount" +
                                                                                    " is 1000000");
                                                                            money_add = sc.nextInt();
                                                                        }

                                                                        if (money_add >= 1000 && money_add <= 10000) {
                                                                            money_add = money_add - 100;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 10000 && money_add <= 100000) {
                                                                            money_add = money_add - 1000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 100000 && money_add <= 1000000) {
                                                                            money_add = money_add - 100000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        }

                                                                        select_shopping = 6;
                                                                        shop_again = false;
                                                                        continue;
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        }

                                                        case 2: {
                                                            int price = 500;

                                                            if (balance > price && balance > min_balance && (balance - price > 2000)) {
                                                                System.out.println("Sephora Collection Selected");
                                                                System.out.println("Do you proceed to buy the Sephora Collection " +
                                                                        "product");
                                                                System.out.println("press 1 to buy the product");
                                                                System.out.println("press 2 for Shop Menu");
                                                                int bill_options = sc.nextInt();
                                                                while (bill_options > 2 || bill_options <= 0) {
                                                                    System.out.println("\nInvalid number selected. ");
                                                                    bill_options = sc.nextInt();
                                                                }

                                                                switch (bill_options) {
                                                                    case 1: {
                                                                        System.out.println("You bought Sephora Co worth " + price);
                                                                        balance = balance - price;
                                                                        System.out.println("your updated balance is " + balance);

                                                                        System.out.println("\nDo you want to continue Shopping?");
                                                                        System.out.println("Press 1 to continue shopping");
                                                                        System.out.println("Press 2 to exit or logout");
                                                                        int shop_2nd = sc.nextInt();

                                                                        while (shop_2nd < 0 || shop_2nd > 2) {
                                                                            System.out.println("\nInvalid Input");
                                                                            System.out.println("Press 1 to continue shopping");
                                                                            System.out.println("Press 2 to exit or logout");
                                                                            shop_2nd = sc.nextInt();
                                                                        }

                                                                        switch (shop_2nd) {
                                                                            case 1: {
                                                                                shop_again = false;
                                                                                break;
                                                                            }

                                                                            case 2: {
                                                                                shop_again = true;
                                                                                break;
                                                                            }
                                                                        }
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }

                                                            } else {
                                                                System.out.println("You don't have sufficient balance. your " +
                                                                        "current balance is " + balance);

                                                                System.out.println("\nPress 1 to add money?");
                                                                System.out.println("press 2 to return back");
                                                                int again_shop = sc.nextInt();

                                                                while (again_shop < 0 || again_shop > 2) {
                                                                    System.out.println("Invalid Input. Please try again");
                                                                    System.out.println("\nPress 1 to add money");
                                                                    System.out.println("\nPress 2 return back");
                                                                    again_shop = sc.nextInt();
                                                                }

                                                                switch (again_shop) {
                                                                    case 1: {

                                                                        System.out.println("\nAdd money is Selected ➕");

                                                                        System.out.println("\nminimum balance is " + min_balance);
                                                                        System.out.println("your current balance is " + balance);
                                                                        System.out.println("Enter amount to be added");

                                                                        int money_add = sc.nextInt();

                                                                        while (money_add < 1000 || money_add > 1000000) {
                                                                            System.out.println("minimum amount to be added is 1000 and maximum amount" +
                                                                                    " is 1000000");
                                                                            money_add = sc.nextInt();
                                                                        }

                                                                        if (money_add >= 1000 && money_add <= 10000) {
                                                                            money_add = money_add - 100;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 10000 && money_add <= 100000) {
                                                                            money_add = money_add - 1000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 100000 && money_add <= 1000000) {
                                                                            money_add = money_add - 100000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        }

                                                                        select_shopping = 6;
                                                                        shop_again = false;
                                                                        continue;
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        }

                                                        case 3: {
                                                            int price = 1050;

                                                            if (balance > price && balance > min_balance && (balance - price > 2000)) {
                                                                System.out.println("Tarte Selected");
                                                                System.out.println("Do you proceed to buy the Tarte product");

                                                                System.out.println("press 1 to buy the product");
                                                                System.out.println("press 2 for Shop Menu");
                                                                int bill_options = sc.nextInt();
                                                                while (bill_options > 2 || bill_options <= 0) {
                                                                    System.out.println("\nInvalid number selected. ");
                                                                    bill_options = sc.nextInt();
                                                                }

                                                                switch (bill_options) {
                                                                    case 1: {
                                                                        System.out.println("You bought Tarte worth " + price);
                                                                        balance = balance - price;
                                                                        System.out.println("your updated balance is " + balance);

                                                                        System.out.println("\nDo you want to continue Shopping?");
                                                                        System.out.println("Press 1 to continue shopping");
                                                                        System.out.println("Press 2 to exit or logout");
                                                                        int shop_2nd = sc.nextInt();

                                                                        while (shop_2nd < 0 || shop_2nd > 2) {
                                                                            System.out.println("\nInvalid Input");
                                                                            System.out.println("Press 1 to continue shopping");
                                                                            System.out.println("Press 2 to exit or logout");
                                                                            shop_2nd = sc.nextInt();
                                                                        }

                                                                        switch (shop_2nd) {
                                                                            case 1: {
                                                                                shop_again = false;
                                                                                break;
                                                                            }

                                                                            case 2: {
                                                                                shop_again = true;
                                                                                break;
                                                                            }
                                                                        }
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }

                                                            } else {
                                                                System.out.println("You don't have sufficient balance. your " +
                                                                        "current balance is " + balance);

                                                                System.out.println("\nPress 1 to add money?");
                                                                System.out.println("press 2 to return back");
                                                                int again_shop = sc.nextInt();

                                                                while (again_shop < 0 || again_shop > 2) {
                                                                    System.out.println("Invalid Input. Please try again");
                                                                    System.out.println("\nPress 1 to add money");
                                                                    System.out.println("\nPress 2 return back");
                                                                    again_shop = sc.nextInt();
                                                                }

                                                                switch (again_shop) {
                                                                    case 1: {

                                                                        System.out.println("\nAdd money is Selected ➕");

                                                                        System.out.println("\nminimum balance is " + min_balance);
                                                                        System.out.println("your current balance is " + balance);
                                                                        System.out.println("Enter amount to be added");

                                                                        int money_add = sc.nextInt();

                                                                        while (money_add < 1000 || money_add > 1000000) {
                                                                            System.out.println("minimum amount to be added is 1000 and maximum amount" +
                                                                                    " is 1000000");
                                                                            money_add = sc.nextInt();
                                                                        }

                                                                        if (money_add >= 1000 && money_add <= 10000) {
                                                                            money_add = money_add - 100;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 10000 && money_add <= 100000) {
                                                                            money_add = money_add - 1000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 100000 && money_add <= 1000000) {
                                                                            money_add = money_add - 100000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        }

                                                                        select_shopping = 6;
                                                                        shop_again = false;
                                                                        continue;
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        }

                                                        case 4: {
                                                            int price = 700;

                                                            if (balance > price && balance > min_balance && (balance - price > 2000)) {
                                                                System.out.println("NARS Selected");
                                                                System.out.println("Do you proceed to buy the NARS product");

                                                                System.out.println("press 1 to buy the product");
                                                                System.out.println("press 2 for Shop Menu");
                                                                int bill_options = sc.nextInt();
                                                                while (bill_options > 2 || bill_options <= 0) {
                                                                    System.out.println("\nInvalid number selected. ");
                                                                    bill_options = sc.nextInt();
                                                                }

                                                                switch (bill_options) {
                                                                    case 1: {
                                                                        System.out.println("You bought NARS worth " + price);
                                                                        balance = balance - price;
                                                                        System.out.println("your updated balance is " + balance);

                                                                        System.out.println("\nDo you want to continue Shopping?");
                                                                        System.out.println("Press 1 to continue shopping");
                                                                        System.out.println("Press 2 to exit or logout");
                                                                        int shop_2nd = sc.nextInt();

                                                                        while (shop_2nd < 0 || shop_2nd > 2) {
                                                                            System.out.println("\nInvalid Input");
                                                                            System.out.println("Press 1 to continue shopping");
                                                                            System.out.println("Press 2 to exit or logout");
                                                                            shop_2nd = sc.nextInt();
                                                                        }

                                                                        switch (shop_2nd) {
                                                                            case 1: {
                                                                                shop_again = false;
                                                                                break;
                                                                            }

                                                                            case 2: {
                                                                                shop_again = true;
                                                                                break;
                                                                            }
                                                                        }
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }

                                                            } else {
                                                                System.out.println("You don't have sufficient balance. your " +
                                                                        "current balance is " + balance);

                                                                System.out.println("\nPress 1 to add money?");
                                                                System.out.println("press 2 to return back");
                                                                int again_shop = sc.nextInt();

                                                                while (again_shop < 0 || again_shop > 2) {
                                                                    System.out.println("Invalid Input. Please try again");
                                                                    System.out.println("\nPress 1 to add money");
                                                                    System.out.println("\nPress 2 return back");
                                                                    again_shop = sc.nextInt();
                                                                }

                                                                switch (again_shop) {
                                                                    case 1: {

                                                                        System.out.println("\nAdd money is Selected ➕");

                                                                        System.out.println("\nminimum balance is " + min_balance);
                                                                        System.out.println("your current balance is " + balance);
                                                                        System.out.println("Enter amount to be added");

                                                                        int money_add = sc.nextInt();

                                                                        while (money_add < 1000 || money_add > 1000000) {
                                                                            System.out.println("minimum amount to be added is 1000 and maximum amount" +
                                                                                    " is 1000000");
                                                                            money_add = sc.nextInt();
                                                                        }

                                                                        if (money_add >= 1000 && money_add <= 10000) {
                                                                            money_add = money_add - 100;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 10000 && money_add <= 100000) {
                                                                            money_add = money_add - 1000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 100000 && money_add <= 1000000) {
                                                                            money_add = money_add - 100000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        }

                                                                        select_shopping = 6;
                                                                        shop_again = false;
                                                                        continue;
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        }

                                                        case 5: {
                                                            int price = 550;

                                                            if (balance > price && balance > min_balance && (balance - price > 2000)) {
                                                                System.out.println("TooFaced Selected");
                                                                System.out.println("Do you proceed to buy the TooFaced product");

                                                                System.out.println("press 1 to buy the product");
                                                                System.out.println("press 2 for Shop Menu");
                                                                int bill_options = sc.nextInt();
                                                                while (bill_options > 2 || bill_options <= 0) {
                                                                    System.out.println("\nInvalid number selected. ");
                                                                    bill_options = sc.nextInt();
                                                                }

                                                                switch (bill_options) {
                                                                    case 1: {
                                                                        System.out.println("You bought TooFaced worth " + price);
                                                                        balance = balance - price;
                                                                        System.out.println("your updated balance is " + balance);

                                                                        System.out.println("\nDo you want to continue Shopping?");
                                                                        System.out.println("Press 1 to continue shopping");
                                                                        System.out.println("Press 2 to exit or logout");
                                                                        int shop_2nd = sc.nextInt();

                                                                        while (shop_2nd < 0 || shop_2nd > 2) {
                                                                            System.out.println("\nInvalid Input");
                                                                            System.out.println("Press 1 to continue shopping");
                                                                            System.out.println("Press 2 to exit or logout");
                                                                            shop_2nd = sc.nextInt();
                                                                        }

                                                                        switch (shop_2nd) {
                                                                            case 1: {
                                                                                shop_again = false;
                                                                                break;
                                                                            }

                                                                            case 2: {
                                                                                shop_again = true;
                                                                                break;
                                                                            }
                                                                        }
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }

                                                            } else {
                                                                System.out.println("You don't have sufficient balance. your " +
                                                                        "current balance is " + balance);

                                                                System.out.println("\nPress 1 to add money?");
                                                                System.out.println("press 2 to return back");
                                                                int again_shop = sc.nextInt();

                                                                while (again_shop < 0 || again_shop > 2) {
                                                                    System.out.println("Invalid Input. Please try again");
                                                                    System.out.println("\nPress 1 to add money");
                                                                    System.out.println("\nPress 2 return back");
                                                                    again_shop = sc.nextInt();
                                                                }

                                                                switch (again_shop) {
                                                                    case 1: {

                                                                        System.out.println("\nAdd money is Selected ➕");

                                                                        System.out.println("\nminimum balance is " + min_balance);
                                                                        System.out.println("your current balance is " + balance);
                                                                        System.out.println("Enter amount to be added");

                                                                        int money_add = sc.nextInt();

                                                                        while (money_add < 1000 || money_add > 1000000) {
                                                                            System.out.println("minimum amount to be added is 1000 and maximum amount" +
                                                                                    " is 1000000");
                                                                            money_add = sc.nextInt();
                                                                        }

                                                                        if (money_add >= 1000 && money_add <= 10000) {
                                                                            money_add = money_add - 100;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 10000 && money_add <= 100000) {
                                                                            money_add = money_add - 1000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        } else if (money_add >= 100000 && money_add <= 1000000) {
                                                                            money_add = money_add - 100000;    // tax deduction
                                                                            balance = balance + money_add;
                                                                            System.out.println(balance + " is your updated balance.");
                                                                        }

                                                                        select_shopping = 6;
                                                                        shop_again = false;
                                                                        continue;
                                                                    }

                                                                    case 2: {
                                                                        continue;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        }

                                                        case 6: {
                                                            break;
                                                        }
                                                    }

                                                    break;
                                                }

                                                case 7: {
                                                    back_to_shop_menu = true;
                                                    shop_again = false;
                                                    break;
                                                }
                                            }
                                            break;
                                        }
                                    }
                                    break;
                                }

                                case 2: {
                                    System.out.println("\nAdd money is Selected ➕");

                                    System.out.println("\nminimum balance is " + min_balance);
                                    System.out.println("your current balance is " + balance);
                                    System.out.println("Enter amount to be added");

                                    int money_add = sc.nextInt();

                                    while (money_add < 1000 || money_add > 1000000) {
                                        System.out.println("minimum amount to be added is 1000 and maximum amount" +
                                                " is 1000000");
                                        money_add = sc.nextInt();
                                    }

                                    if (money_add >= 1000 && money_add <= 10000) {
                                        money_add = money_add - 100;    // tax deduction
                                        balance = balance + money_add;
                                        System.out.println("\n" + balance + " is your updated balance.");
                                    } else if (money_add >= 10000 && money_add <= 100000) {
                                        money_add = money_add - 1000;    // tax deduction
                                        balance = balance + money_add;
                                        System.out.println("\n" + balance + " is your updated balance.");
                                    } else if (money_add >= 100000 && money_add <= 1000000) {
                                        money_add = money_add - 100000;    // tax deduction
                                        balance = balance + money_add;
                                        System.out.println("\n" + balance + " is your updated balance.");
                                    }

                                    back_to_shop_menu = true;
                                    break;
                                }

                                case 3: {
                                    System.out.println("\ncheck balance is Selected 💵");

                                    System.out.println("\nYour total amount balance is " + balance);
                                    back_to_shop_menu = true;
                                    break;
                                }

                                case 4: {
                                    System.out.println("\nThank you for your service. Please visit again");
                                    System.out.println("Logged out");
                                    back_to_shop_menu = true;
                                    make_default = true;
                                    shop_again = true;
                                    validity = true;
                                    break;
                                }
                            }
                        }
                    }
                }

            } else {
                count = count - 1;

                System.out.println("\nYou have " + count + " attempts left");

                if (count > 0) {
                    System.out.println("\npress 1 to enter correct password.");
                    System.out.println("press 2 to exit");

                    int exit_val = sc.nextInt();

                    while (exit_val > 2 || exit_val <= 0) {
                        // does not allow to enter other than 1 or 2. Repeats in loop till we enter 1 or 2
                        System.out.println("\nInvalid number entered.");
                        System.out.println("press 1 to enter correct password.");
                        System.out.println("press 2 to exit");
                        exit_val = sc.nextInt();    // reinitializing again. if 1 or 2. while loop exits.
                    }

                    if (exit_val == 1) {
                        // if 1 is entered
                        continue;    // goes to main while to start everything again
                    } else if (exit_val == 2)
                        // if 2 is entered
                        System.out.println("\nPlease visit again");
                    System.out.println("Logged out");
                    validity = true;    // goes to main while loop to end the loop
                } else {
                    System.out.println("\nYou tried all 3 attempts. Please try again");
                    System.out.println("Logging out");
                    break;
                }
            }
        }
    }
}