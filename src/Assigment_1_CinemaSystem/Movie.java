package Assigment_1_CinemaSystem;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Movie {

    static Scanner scan = new Scanner(System.in);
    static String  MovieName;
    static String  MovieGenre;
    static String  AgeRestriction;

    public static  void setMovie(String Name, String Genre , String Age){
        MovieName =  Name;
        MovieGenre = Genre;
        AgeRestriction = Age;
    }
    public void getMovie(){}

    public static void addMovie(ArrayList<String> movies) {
        System.out.println("Enter Movie Name: ");
        String name = scan.nextLine();

        System.out.println("Enter Movie Genres: ");
        String genres = scan.nextLine();

        System.out.println("Enter Age Restriction: ");
        String agr = scan.nextLine();

        movies.add("Name: " + name + "\nGenre: " + genres + "\nAge Restrictions: " + agr);
    }
}
