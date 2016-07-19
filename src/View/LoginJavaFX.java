package View;

import Model.UserDB;
import Model.UserIO;
import Utility.ArrayOrderedList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginJavaFX extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception{
        loadUserDB();
        Parent root = FXMLLoader.load(getClass().getResource("LoginJavaFXView.fxml"));
        primaryStage.setTitle("Sign In");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }
    //method to load database file
    public void loadUserDB(){
        try {
            UserDB.setUsers((ArrayOrderedList) UserIO.readUsers());
        } catch (IOException e) {
            System.err.print("Fail to open/read users.dat file");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
