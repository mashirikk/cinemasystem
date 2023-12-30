package Assigment_1_CinemaSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
    public static String name;
    public static int age;
    public static float balance;
    public ArrayList[] orderHistory;



    public void setValues(String _name, int _age, float _balance, ArrayList[] _OrderHistory) {
        this.name = _name;
        this.age = _age;
        this.balance = _balance;
        this.orderHistory = _OrderHistory;
    }
    public User(String _name, int _age, float _balance, ArrayList[] _OrderHistory) {
        setValues(_name, _age, _balance, _OrderHistory);
    }
    public static boolean contains(String newuser){
        for (User user : CinemaSystem.Users) {
            if (user.name.equals(newuser)) {
                return true;
            }
        }
        return false;
    }

    public static boolean Login(ArrayList<User> users){
        Scanner scan = new Scanner(System.in);
        String Login, Password;


        System.out.println("Login: ");
        Login = scan.nextLine();
        User newuser = new User(Login, 18, 0, null);
        if (contains(Login)) {
        } else {
            users.add(newuser);
        }
        System.out.println("Password: ");
        Password = scan.nextLine();

        if (Login.equals("admin") && Password.equals("admin")){
            return true;
        }else{
            return false;
        }

    }

    public String getFullUserInfo() {
        return "User Name: " + name +
                "\nUser Age: " + age +
                "\nUser Balance: " + balance;
    }
    public static void balanceSet(int Balance){
        balance+= Balance;
        System.out.println("Вы пополнили баланс на " + Balance + " Долларов" + "\n" + "Ваш текущий баланс: " + balance);
        user();
    }

    public static void userinfo() {
        for (User user : CinemaSystem.Users) {
            System.out.println(user.getFullUserInfo());
        }
    }
    public static void user(){

        }
}




