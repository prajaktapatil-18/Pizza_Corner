import java.util.Scanner;

public class SubCategories {
    private String address;

    public void pizza() {
        Scanner scan = new Scanner(System.in);


        System.out.println("Choose\n" +
                "1. Regular/simple pizza\n" +
                "2. Non-veg pizza\n" +
                "3. veg-pizza\n" +
                "4. corn pizza\n" +
                "5. spice pizza\n" +
                "6. extra cheese pizza");
        int choice = scan.nextInt();
        SubCategories sc = new SubCategories();

        switch (choice) {
            case 1:
                if (choice == 1) {
                    System.out.println("Regular pizza\n" +
                            "1.small \n" +
                            "2. medium\n" +
                            "3. big");
                    int choice2 = scan.nextInt();
                    if (choice2 == 1) {
                        sc.dilevaryMode();
                    } else if (choice2 == 2) {
                       sc.dilevaryMode();
                    } else if (choice2 == 3) {
                        sc.dilevaryMode();
                    } else {
                        System.out.println("invalid choice");
                    }
                }
                break;
            case 2:
                if (choice == 2) {
                    System.out.println("Non-veg pizza\n" +
                            "1.small \n" +
                            "2. medium\n" +
                            "3. big");
                    int choice1 = scan.nextInt();
                    if (choice1 == 1) {
                        sc.dilevaryMode();
                    } else if (choice1 == 2) {
                        sc.dilevaryMode();
                    } else if (choice1 == 3) {
                        sc.dilevaryMode();
                    } else {
                        System.out.println("invalid choice");
                    }
                }
                break;

            case 3:
                if (choice == 3) {
                    System.out.println("Veg pizza\n" +
                            "1.small \n" +
                            "2. medium\n" +
                            "3. big");
                    int choice1 = scan.nextInt();
                    if (choice1 == 1) {
                        sc.dilevaryMode();
                    } else if (choice1 == 2) {
                        sc.dilevaryMode();
                    } else if (choice1 == 3) {
                        sc.dilevaryMode();
                    } else {
                        System.out.println("invalid choice");
                    }
                }
                break;

            case 4:
                if (choice== 4) {
                    System.out.println("corn pizza\n" +
                            "1.small \n" +
                            "2. medium\n" +
                            "3. big");
                    int choice1 = scan.nextInt();
                    if (choice1 == 1) {
                       sc.dilevaryMode();
                    } else if (choice1 == 2) {
                        sc.dilevaryMode();
                    } else if (choice1 == 3) {
                        sc.dilevaryMode();
                    } else {
                        System.out.println("invalid choice");
                    }
                }
                break;

            case 5:
                if (choice == 5) {
                    System.out.println("spices pizza\n" +
                            "1.small \n" +
                            "2. medium\n" +
                            "3. big");
                    int choice1 = scan.nextInt();
                    if (choice1 == 1) {
                        sc.dilevaryMode();
                    } else if (choice1 == 2) {
                        sc.dilevaryMode();
                    } else if (choice1 == 3) {
                        sc.dilevaryMode();
                    } else {
                        System.out.println("invalid choice");
                    }
                }
                break;
            case 6:
                if (choice == 6) {
                    System.out.println("Veg pizza\n" +
                            "1.small \n" +
                            "2. medium\n" +
                            "3. big");
                    int choice1 = scan.nextInt();
                    if (choice1 == 1) {
                        sc.dilevaryMode();
                    } else if (choice1 == 2) {
                        sc.dilevaryMode();
                    } else if (choice1 == 3) {
                        sc.dilevaryMode();
                    } else {
                        System.out.println("invalid choice");
                    }
                }
                break;


        }


    }

    public void dilevaryMode() {
        Scanner scan = new Scanner(System.in);
        System.out.println("choose  " + "1.In hotel\n" +
                "2.parsal");
        int dilaveryMode = scan.nextInt();
        if (dilaveryMode == 1) {
            System.out.println("order succesefully");
        }else if (dilaveryMode==2) {
            System.out.println("enter your addcess");
            String address = scan.nextLine();
         scan.nextLine();
            System.out.println("your order will dilevere in your address" );

        }

    }

    public void nonVegFood() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose\n" +
                "1. Nonveg biryani\n" +
                "2. chicken masala\n" +
                "3. chicken lapeta\n" +
                "4. mutton biryani\n" +
                "5. mutton khima\n" +
                "6. nonveg sup\n" +
                "7. Kolhapuri chicken\n" +
                "8. fish fry\n" +
                "9. pronz fry\n" +
                "10. pronz carry\n" +
                "11. paplet fry and carry");
        int choice = scan.nextInt();

        SubCategories sc = new SubCategories();
        Amount am = new Amount();
        switch (choice) {
            case 1:
                if (choice == 1) {
                    System.out.println("1.half biryani\n" +
                            "2. full biryani");
                    int choice1 = scan.nextInt();
                    if (choice1 == 1) {
                        sc.dilevaryMode();


                    } else {
                        sc.dilevaryMode();

                    }

                }
                break;

            case 2:
                if (choice == 2) {
                    sc.dilevaryMode();

                }
                break;

            case 3:
                if (choice == 3) {
                    sc.dilevaryMode();

                }
                break;

            case 4:

                if (choice == 4) {
                    System.out.println("1.half biryani\n" +
                            "2. full biryani");
                    int choice1 = scan.nextInt();
                    if (choice1 == 1) {
                        sc.dilevaryMode();
                    } else {
                        sc.dilevaryMode();
                    }

                }
                break;


            case 5:

                if (choice == 5) {
                    System.out.println("1.half \n" +
                            "2. full ");
                    int choice1 = scan.nextInt();
                    if (choice1 == 1) {
                        sc.dilevaryMode();
                    } else {
                        sc.dilevaryMode();
                    }

                }
                break;


            case 6:

                if (choice == 6) {
                    System.out.println("1.half sup\n" +
                            "2. full sup");
                    int choice1 = scan.nextInt();
                    if (choice1 == 1) {
                        sc.dilevaryMode();
                    } else {
                        sc.dilevaryMode();
                    }

                }
                break;

            case 7:

                if (choice == 7) {
                    System.out.println("1.half \n" +
                            "2. full ");
                    int choice1 = scan.nextInt();
                    if (choice1 == 1) {
                        sc.dilevaryMode();
                    } else {
                        sc.dilevaryMode();
                    }

                }
                break;

            case 8:
                sc.dilevaryMode();
                break;
            case 9:
                sc.dilevaryMode();
                break;
            case 10:
                sc.dilevaryMode();
                break;

            case 11:
                sc.dilevaryMode();
                break;

            default:
                System.out.println("invalid choice");
        }
    }

    public void vegFood() {

        Scanner scan = new Scanner(System.in);


        System.out.println("Choose\n" +
                "1. veg biryani\n" +
                "2. Rajama carry\n" +
                "3. chhole\n" +
                "4. mix carry\n" +
                "5. Paneer tikka\n" +
                "6. palak paneer\n" +
                "7. shahi paneer\n" +
                "8. mutter paneer\n" +
                "9. paneer handi\n" +
                "10. paneer chili\n" +
                "11. paneer burji\n" +
                "12. veg pulav");
        int choice = scan.nextInt();

        SubCategories sc = new SubCategories();
        switch (choice) {
            case 1:
                if (choice == 1) {
                    System.out.println("1.half biryani\n" +
                            "2. full biryani");
                    int choice1 = scan.nextInt();
                    if (choice1 == 1) {
                        sc.dilevaryMode();
                    } else {
                        sc.dilevaryMode();
                    }

                }
                break;

            case 2, 3, 4, 5, 6, 7, 8, 9, 10, 11:
                sc.dilevaryMode();

                break;


            case 12:
                if (choice == 12) {
                    System.out.println("1.half pulav\n" +
                            "2. full pulav");
                    int choice1 = scan.nextInt();
                    if (choice1 == 1) {
                        sc.dilevaryMode();
                    } else {
                        sc.dilevaryMode();
                    }

                }
            default:
                System.out.println("invalid choice");
        }
    }

    public void juice() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your choice");


        System.out.println("1. orange juice\n" +
                "2. mango juice\n" +
                "3. pineapple juice\n" +
                "4. apple juice\n" +
                "5. watermelon juice\n" +
                "6. pan masala juice\n" +
                "7. aluvera juice\n" +
                "8. Lemon juice\n" +
                "9. sweet juice\n" +
                "10. jagri juice");
        int choice = scan.nextInt();

        SubCategories sc = new SubCategories();

        switch (choice) {
            case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10:
                System.out.println("1.half \n" +
                        "2. full ");
                int choice1 = scan.nextInt();
                if (choice1 == 1) {
                    sc.dilevaryMode();
                } else if (choice1==2){
                    sc.dilevaryMode();
                }else {
                    System.out.println("invalid");

                }
                break;

            default:
                System.out.println("try again");

        }
    }

    public void burger() {
        Scanner scan = new Scanner(System.in);
        System.out.println("choose");


        System.out.println("1. Simple burger\n" +
                "2. spicy burger\n" +
                "3. nonveg burger\n" +
                "4. paneer burger\n" +
                "5. vegetable burger\n" +
                "6. extra chess souces curger");
        int choice = scan.nextInt();

        SubCategories sc = new SubCategories();

        switch (choice) {
            case 1, 2, 3, 4, 5, 6:
                sc.dilevaryMode();
                break;
            default:
                System.out.println("try again");
        }
    }

    public void streetFood() {
        Scanner scan = new Scanner(System.in);

        System.out.println("choose");

        System.out.println("1. Misal\n" +
                "2. pav bhaji\n" +
                "3. vada pav\n" +
                "4. pani puri\n" +
                "5. ragda patice\n" +
                "6. sandwich\n" +
                "7. curry  vada\n" +
                "8. samose\n" +
                "9. kachori\n" +
                "10. chat");
        int choice = scan.nextInt();
        SubCategories sc = new SubCategories();

        switch (choice) {
            case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10:
                if (choice <= 10) {
                    System.out.println("quantity for e.g 1 plate 2 plate\n" +
                            "1. 1 plate\n" +
                            "2. 2 plate\n" +
                            "3. 3 plate\n" +
                            "4. 4 plate\n" +
                            "5. 5 plate");
                    int choiceQuantity = scan.nextInt();
                    System.out.println("ok thanks");
                    sc.dilevaryMode();

                }
                break;
            default:
                System.out.println("try again may be invalid choice u typed");
        }
    }

    public void rice() {
        Scanner scan = new Scanner(System.in);

        System.out.println("choose");

        System.out.println("1. plain rice\n" +
                "2. steam rice\n" +
                "3. jeera rice\n" +
                "4. peas rice\n" +
                "5. spicy rice");
        SubCategories sc = new SubCategories();
        int choice = scan.nextInt();

        switch (choice) {
            case 1, 2, 3, 4, 5:
                if (choice <= 5) {
                    System.out.println("choose\n" +
                            "1. half rice\n" +
                            "2. full rice");
                    int choice1 = scan.nextInt();
                    sc.dilevaryMode();
                }
        }


    }

    public void roti() {
        Scanner scan = new Scanner(System.in);

        System.out.println("choose");

        System.out.println("1. simple roti\n" +
                "2.  roti with stuffic\n" +
                "3.  roti with egg\n" +
                "4. roti with chess/butter\n" +
                "5. roti with veggies\n" +
                "6  bhature");
        int choice = scan.nextInt();
        SubCategories sc = new SubCategories();

        switch (choice) {
            case 1, 2, 3, 4, 5, 6:
                if (choice <= 6) {
                    System.out.println("quantity\n" +
                            "1.1\n" +
                            "2.2\n" +
                            "3.3\n" +
                            "4.4\n" +
                            "5.5\n" +
                            "6.6\n" +
                            "7.7\n" +
                            "8.8\n" +
                            "9.9\n" +
                            "10.10");
                    int choiceRotiQuantity = scan.nextInt();
                    sc.dilevaryMode();
                }
        }


    }

    public void exit() {
        System.out.println("thanks");


    }
}




