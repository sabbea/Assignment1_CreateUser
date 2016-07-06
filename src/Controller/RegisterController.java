package Controller;

import Model.User;
import Model.UserDB;
import Model.UserIO;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import Model.User;
import javafx.stage.FileChooser;
import View.RegisterFXView;
import java.io.File;
import java.io.IOException;

/**
 * Created by Abhishek on 6/29/2016.
 */
public class RegisterController
{
    @FXML
    TextField firstn;
    @FXML
    TextField lastn;
    @FXML
    TextField dateof;
    @FXML
    TextField gender;
    @FXML
    TextField social;
    @FXML
    TextField number;
    @FXML
    TextField email;
    @FXML
    TextField Username;
    @FXML
    PasswordField Password;
    @FXML
    PasswordField ConPassword;




    public void openRegister()
    {

        //checks to see if the password entered matches the confirm password field

        if(Password.getText().equals(ConPassword.getText()))
        {
            //checks to see if it meets password requirements of one capital, one lowercase, one special character, and one number
            if(Password.getText().matches("^(?=.*[A-Z])(?=.*[!@#$%^&*])(?=.*\\d)(?!.*(AND|NOT)).*[a-z].*"))
            {
                //checks to see if the email is entered in the format of xxxx@xxx.xxx
                if(email.getText().matches("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"))
                {
                    //creates new user
                    User user = new User(firstn.getText(), lastn.getText(), dateof.getText(), gender.getText(), Username.getText(), email.getText(), number.getText(), Password.getText(), ConPassword.getText());
                    //adds user to database
                    UserDB.getUsers().add(user);
                    try {
                        UserIO.writeUsers(UserDB.getUsers());
                    } catch (IOException e) {
                        System.err.print("Cannot write UserDB to binary file");

                    }
                }
            }
        }
        System.out.println(UserDB.getUsers());
    }
    // method that allows you to browse computer for image files for profile pictures
    public void openFileChooser ()
    {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Image Files", "*.png" , "*.jpg", "*.gif"));
        File selectedFile = fileChooser.showOpenDialog(RegisterFXView.getRegisterStage());

    }



}
