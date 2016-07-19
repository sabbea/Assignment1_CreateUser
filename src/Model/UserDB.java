package Model;

import Utility.ArrayOrderedList;

import java.util.ArrayList;

/**
 * Created by Abhishek on 6/30/2016.
 */
public class UserDB {

    //creates array list to store user data
    private static ArrayList<User> users = new ArrayList<User>();

    public static ArrayList<User> getUsers() {
        return users;

    }

    public static void setUsers(ArrayList users) {
        UserDB.users = users;
    }




}