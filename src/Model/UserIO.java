package Model;

import java.io.*;

/**
 * Created by Abhishek on 6/30/2016.
 */
public class UserIO {
    //method for writing objects to file
    public static void writeUsers(Object data) throws IOException {

        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("users.dat"));
        output.writeObject(data);

    }
    //method for reading objects from file
    public static Object readUsers() throws IOException, ClassNotFoundException {

        ObjectInputStream input = new ObjectInputStream(new FileInputStream("users.dat"));
        return input.readObject();
    }
}

