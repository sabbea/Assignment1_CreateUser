package Controller;

import Model.User;
import Model.UserDB;
import View.RegisterFXView;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;


public class LoginController
{
    @FXML
    Label status;
    @FXML
    TextField Username;
    @FXML
    PasswordField Password;


    public void openLogin()
    {
        //iterate through the userDB to find if user exists
        for(int i=0; i<UserDB.getUsers().size(); i++) {

         //checks userDB to see if username exists
            if (Username.getText().equals(UserDB.getUsers().get(i).getUserName()))
            {
                //checks to see if password exists in userDB
                if(Password.getText().equals(UserDB.getUsers().get(i).getPassword()))
                {


                    status.setText("Login Successful");
                    System.out.println("Welcome " + Username.getText() + "!");
                }


            }
            else {
                    status.setText("Login Failed");
            }
        }
    }

    public void openRegisterView() throws IOException

    {

        System.out.println("Open register view");
        new RegisterFXView();

    }

}



