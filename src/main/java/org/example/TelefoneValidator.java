package org.example;

public class TelefoneValidator implements IValidator {
    @Override
    public Boolean validate(String data) {
        return data.matches("^\\d{2}-\\d{5}-\\d{4}$");
    }
}
