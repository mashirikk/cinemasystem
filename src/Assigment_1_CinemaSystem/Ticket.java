package Assigment_1_CinemaSystem;

import javax.sql.rowset.serial.SQLOutputImpl;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Ticket {
    int id = 0;
    static float PriceStudent = 1000 , PriceAdult = 1800, PriceChildren = 700;
    String MovieName, Date; // MovieName based on selected movie

    public void setMovie(String MovieName, String Genre , String Age){
        Movie.MovieName =  MovieName;
        Movie.MovieGenre = Genre;
        Movie.AgeRestriction = Age;
    }
    public static void buyTicket(String rate){
        switch (rate){
            case "Adult": {
                if (User.balance < PriceAdult) {
                    System.out.println("Insufficient funds");
                    break;
                }
                User.balance -=PriceAdult;
                System.out.println("-" + PriceAdult + "$ \n" + "Balance: " + User.balance );
                System.out.println("The purchase has been completed successfully ");
                break;
            }
            case "Student":{
                if (User.balance < PriceStudent) {
                    System.out.println("Insufficient funds");
                    break;
                }
                User.balance -=PriceStudent;
                System.out.println("-" + PriceStudent + "$ \n" + "Balance: " + User.balance );
                System.out.println("The purchase has been completed successfully ");
                break;
            }
            case "Children":{
                if (User.balance < PriceChildren) {
                    System.out.println("Insufficient funds");
                    break;
                }
                User.balance -=PriceChildren;
                System.out.println("-" + PriceChildren + "$ \n" + "Balance: " + User.balance );
                System.out.println("The purchase has been completed successfully ");
                break;
            }
        }
    }

    public void CancelPurchase(String rate){
        switch (rate){
            case "Adult": {
                User.balance += PriceAdult;
                System.out.println("-" + PriceAdult + "$ \n" + "Balance: " + User.balance );
                System.out.println("The ticket refund has been completed successfully");
            }
            case "Student":{
                User.balance += PriceStudent;
                System.out.println("-" + PriceStudent + "$ \n" + "Balance: " + User.balance );
                System.out.println("The ticket refund has been completed successfully");
            }
            case "Children":{
                User.balance += PriceChildren;
                System.out.println("+" + PriceChildren + "$ \n" + "Balance: " + User.balance );
                System.out.println("The ticket refund has been completed successfully");
            }
        }
    }

    public void allTicket() {
        ArrayList<String> Tickets = new ArrayList<>();

    }


}