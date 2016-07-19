package Model;

import Utility.ArrayOrderedList;

import java.util.ArrayList;
import java.util.*;

/**
 * Created by Abhishek on 6/30/2016.
 */
public class UserDB {

    //creates array list to store user data
    private static ArrayOrderedList<User> users = new ArrayOrderedList<User>();

    public static ArrayOrderedList<User> getUsers() {
        return users;

    }

    public static void setUsers(ArrayOrderedList<User> users) {
        UserDB.users = users;
    }




}