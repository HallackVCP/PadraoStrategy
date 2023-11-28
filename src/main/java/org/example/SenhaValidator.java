package org.example;

public class SenhaValidator implements IValidator {
    @Override
    public Boolean validate(String data) {
        return data.matches("^(?=.*[a-z])(?=.*[A-Z]).{6,}$");
    }
}
