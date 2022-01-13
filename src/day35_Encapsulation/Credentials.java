package day35_Encapsulation;
//
//public class Credentials {
//
//    private String userName;
//    public String Password;
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public String getPassword() {
//        return Password;
//    }
//
//
//    public void setPassword(String password) {
//        this.Password = password;
//
//    }
//
//    public boolean isStrongPassword() {
//        boolean isStrongPassword = false;
//        boolean hasStrongPassword = false;
//        boolean hasOneDigit = false;
//        boolean hasASpecialCharacter = false;
//
//        for (int i = 0; i < Password.length(); i++) {
//            char ch = Password.charAt(i);
//            if (Character.isLetter(ch)) {
//                //  hasOneLetter =true;
//
//            }
//        }
//
//    }
//}



/*
 create a class named Credentials
            Variables:
                username, password

            Methods:
                isStrongPassWord(): takes an argument of string and verify if the given string is strong password
                            Characteristics of strong passwords are:
                                    1. Password MUST be at least have 8 characters long, and should not contain space
                                    2. PassWord should at least contain one letter
                                    3. Password should at least contain one special characters
                                    4. Password should at least contain a digit

                getPassword(): reads the password
                getUsername(): reads the username
                setUsername(): sets the username
                setPassword(): sets a new password
                                    the new password MUST be a strong password

                toString():

            Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)
 */