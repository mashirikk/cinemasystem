package Assigment_1_CinemaSystem;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class CinemaSystem {
    static ArrayList<String> MovieInfo = new ArrayList<>();
    static ArrayList<User> Users = new ArrayList<>();
    static ArrayList<String> Tickets = new ArrayList<>();
    static ArrayList<String> OrderHistory = new ArrayList<>();
    boolean isLog = false;
    static int  Status=0;
    public static void CinemaSystem(){
        boolean admin;
        admin=User.Login(Users);

        if(admin){        //IF ADMIN
            Menu.adminMain();
        }else{           //IF NOT ADMIN
            Menu.userMain();
        }
    }
//    1) arraylist на фильмы
//    2) arraylist на юзеров
//    3) arraylist на проданные билеты

}
