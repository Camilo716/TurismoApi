package com.example.TurismoApi.Validators;

import com.example.TurismoApi.Util.Regex;

public class MailValidator implements IValidable<String> {
    @Override
    public Boolean validate(String mail) throws Exception {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        boolean notMatchesPattern = !Regex.matchesPattern(mail, regex);
        boolean startWithNumber = Character.isDigit(mail.charAt(0));
        boolean doesNotContainAtSign = !mail.contains("@");

        if (notMatchesPattern)
            throw new Exception("Must be a valid mail");
        if (startWithNumber)
            throw new Exception("Mail can't start with number");
        if (doesNotContainAtSign)
            throw new Exception("Mail must contain at sign");

        return true;
    }
}
