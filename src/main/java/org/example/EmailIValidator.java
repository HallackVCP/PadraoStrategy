package org.example;

public class EmailIValidator implements IValidator {
    @Override
    public Boolean validate(String data) {
        return data.matches(("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}"));
    }
}
