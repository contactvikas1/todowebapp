package com.technovihaan.jee.login;


public class UserValidation {

    public static boolean validateCrediential(final String userName, final String password) {
        boolean isValid = Boolean.FALSE;
       if (userName.trim().equals("eiskvir") && password.trim().equals("1234")) {
            isValid = Boolean.TRUE;
       }
        return isValid;
    }
}
