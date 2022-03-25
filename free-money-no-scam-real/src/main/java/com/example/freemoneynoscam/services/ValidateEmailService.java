package com.example.freemoneynoscam.services;

public class ValidateEmailService {
    public boolean isEmailValid(String email){
        boolean returnStatement = false;
        int aCounter = 0;
        int dotCounter = 0;

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@'){
                aCounter++;
            }
            if (email.charAt(i) == '.'){
                dotCounter++;
            }
        }

        if (aCounter == 1 && dotCounter == 1){
            returnStatement = true;
        }

        //TODO implement logic such that we verify an e-mail is valid
        return returnStatement;
    }
}
