package Assigment_1_CinemaSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu extends CinemaSystem{


    public static void adminMain(){
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("----------------------------------------------------");
            System.out.println("Hello, You have the following available functions:\n");

            System.out.print(" 1) Add movie; \n 2) Remove movie; \n 3) Re login; \n 4) Quit system; \n ");
            Status = scan.nextInt();

            switch(Status){
                case 1:{

                }
                case 2:{

                    int choice = scan.nextInt();
                    scan.nextLine();
                    if (choice == 0){
                        adminMain();
                    } else {

                    }
                }
                case 3: {
                    CinemaSystem();//restart
                }
                case 4:{
                    System.exit(0);
                }
            }
        }while(Status!=5);
    }





    static ArrayList<String> MovieInfo = new ArrayList<>();
    public static void BasicMovies(ArrayList<String> MovieInfo) {
        MovieInfo.add("Name: Spider-Man:No Way Home \nGenre: Action, Adventure, Fantasy \nAge Restriction: PG-13");
        MovieInfo.add("Name: No Time to Die \nGenre: Action, Adventure, Thriller\nAge Restriction: PG-13");
        MovieInfo.add("Name: A Quiet Place Part II \nGenre: Drama, Horror, Sci-Fi\nAge Restriction: PG-13");
        MovieInfo.add("Name: Soul \nGenre: Animation, Adventure, Comedy\nAge Restriction: PG");
        MovieInfo.add("Name: The Suicide Squad \nGenre: Action, Adventure, Comedy\nAge Restriction: R");
    }
    public static void Movies(ArrayList<String> MovieInfo) {
        Scanner scan = new Scanner(System.in);

        System.out.println("----------------------------------------------------");


        Movie.addMovie(MovieInfo);
        for (String movie : MovieInfo) {
            System.out.println(movie);
            System.out.println("----------------------------------------------------");
        }
        userMain();
    }



    public static void userMain(){
        do{
            System.out.println("----------------------------------------------------");
            System.out.println("Hello, You have the following available functions:\n");

            System.out.print(" 1) User settings;\n 2) Show all available movies; \n 3) Re login; \n 4) Quit system; \n ");

            Scanner scan = new Scanner(System.in);
            Status = scan.nextInt();

            switch(Status){
                case 1:{
                    userSetting();
                }
                case 2:{
                    Movies(CinemaSystem.MovieInfo);
                }
                case 3: {
                    CinemaSystem();//restart
                }
                case 4: {
                    User.userinfo();
                    System.exit(0);//shut down
                }
                default:
                    System.out.println("----------------------------------------------------");
            }
        }while(Status!=5);
    }



    public static void userSetting(){
        System.out.println("----------------------------------------------------");
        System.out.println("Your name:" + User.name + "\tYour age:" + User.age + "\tBalance:" + User.balance + "\n");
        System.out.println(" 1)Watch order history \n 2)Cancel ticket purchase \n 3)Change name \n 4)Change age \n 5)Add balance \n 6)Return");
        Scanner scan = new Scanner(System.in);
        int Status;
        Status = scan.nextInt();
        switch(Status){
            case 1:{

            }
            case 2:{

            }
            case 3:{
                System.out.print("Set your name: ");
                scan.nextLine();
                User.name = scan.nextLine();
                userSetting();
            }
            case 4:{
                System.out.println("Set your age: ");
                User.age = scan.nextInt();
                userSetting();
            }
            case 5:{
                System.out.println("Enter the required amount: ");
                int amount = scan.nextInt();
                User.balanceSet(amount);
                userMain();
            }
            case 6:{
                userMain();
            }
    }


    }
    public static void ShowBuy(){
        System.out.println(" 1)Chose film\n 2)Cancel");
        Scanner scan = new Scanner(System.in);
        int chose = scan.nextInt();
        switch(chose){
            case 1:{

            }
            case 2:{
                userSetting();
            }
        }
    }

}
