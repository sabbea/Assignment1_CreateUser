package Model;

import java.io.Serializable;
import Model.Person;

/**
 * Created by Abhishek on 6/29/2016.
 */




    public class User extends Person implements Serializable
    {
        private String userName;
        private String email;
        private String phone;
        private String password;
        private String conPass;
        private String photo;

        public User(String userName, String password, String conPass){
            this.userName = userName;
            this.password = password;
            this.conPass = conPass;
        }


        public User(String userName, String email, String phone, String password, String conPass)
        {

            this.userName = userName;
            this.email = email;
            this.phone = phone;
            this.password = password;
            this.conPass = conPass;
         }


        public User(String firstName, String lastName, String dob, String gender, String userName, String email, String phone, String password, String conPass)
        {
            super(firstName, lastName, dob, gender);
            this.userName = userName;
            this.email = email;
            this.phone = phone;
            this.password = password;
            this.conPass = conPass;
        }


    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", confirmed password='" + conPass + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }

}
