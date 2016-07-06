package View;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by Abhishek on 6/29/2016.
 * View page for signup/register page
 */
public class RegisterFXView {

    private static Stage registerStage = new Stage();
    public RegisterFXView() throws IOException
    {
        Stage registerStage = new Stage();
        Parent registerView = FXMLLoader.load(getClass().getResource("RegisterView.fxml"));
        registerStage.setTitle("Register");
        registerStage.setScene(new Scene(registerView, 300, 275));
        registerStage.show();



    }
    public static Stage getRegisterStage(){
        return registerStage;
    }


}
