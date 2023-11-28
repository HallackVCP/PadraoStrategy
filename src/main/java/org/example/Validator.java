package org.example;

public class Validator {

    private String data;

    public Validator(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Boolean validar(IValidator validator){
        return validator.validate(this.getData());
    }
}
