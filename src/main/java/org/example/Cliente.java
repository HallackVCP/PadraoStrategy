package org.example;


public class Cliente {

    private String email;

    private String telefone;

    private String senha;

    public Cliente(String email, String telefone, String senha) {
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean validarTelefone(){
        Validator validator = new Validator(this.getTelefone());
        return validator.validar(new TelefoneValidator());
    }
    public Boolean validarEmail(){
        Validator validator = new Validator(this.getEmail());
        return validator.validar(new EmailIValidator());
    }

    public Boolean validarSenha(){
        Validator validator = new Validator(this.getSenha());
        return validator.validar(new SenhaValidator());
    }
}
