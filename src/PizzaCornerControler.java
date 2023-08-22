import java.util.Scanner;
import java.util.concurrent.Callable;

public class PizzaCornerControler {
    public static void main(String[] args) {


        System.out.println("Welcome to PIZZA'S CORNER");


        Scanner scan = new Scanner(System.in);
        System.out.println("choose which food you want");
        System.out.println("1. Pizza\n" +
                "2. Nonveg Food\n" +
                "3. Veg Food\n" +
                "4. Juice\n" +
                "5. Burger\n" +
                "6. Street Food\n" +
                "7. Rice\n" +
                "8. Roti\n"+
                "9.Exit");
        int choice = scan.nextInt();

        SubCategories sc = new SubCategories();
        Amount am = new Amount();
        switch (choice){
            case 1:
                sc.pizza();


                break;
            case 2:
                sc.nonVegFood();

                break;
            case 3:
                sc.vegFood();


                break;
            case 4:
                sc.juice();
                break;
            case 5:
                sc.burger();
                break;
            case 6:
                sc.streetFood();
                break;

            case 7:
                sc.rice();
                break;
            case 8:
                sc.roti();
                break;
            case 9:
                sc.exit();
                break;
            default:
                System.out.println("invalid choice");

        }
 choice++;
        if (choice>=1){

        }

    }
    }
