package homework;

import customExceptions.WrongLoginException;
import customExceptions.WrongPasswordException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {
    private static final Pattern PATTERN = Pattern.compile("^\\w{1,19}$");


    public static boolean checkRegistration(String login, String pass, String confirmPass) {

        try {
            if (!checkLogin(login)) {
                throw new WrongLoginException("Login is incorrect.");
            } else if (!checkLogin(pass) || !checkLogin(confirmPass)) {
                throw new WrongPasswordException("Password or Confirm pass is incorrect.");
            } else if (!pass.equals(confirmPass)) {
                throw new WrongPasswordException("Password and Confirm pass does not match");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Caught the exception: " + e.getMessage());
            System.exit(1);
        }
        return true;
    }

    private static boolean checkLogin(String login) {
        Matcher matcher = PATTERN.matcher(login);
        return matcher.find();
    }


}
