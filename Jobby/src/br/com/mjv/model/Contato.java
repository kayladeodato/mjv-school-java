package br.com.mjv.model;

public class Contato {
    private String email;
    private Long telefone;
    private Long celular;
    private boolean celWhatsapp;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public Long getCelular() {
        return celular;
    }

    public void setCelular(Long celular) {
        this.celular = celular;
    }

    public boolean isCelWhatsapp() {
        return celWhatsapp;
    }

    public void setCelWhatsapp(boolean celWhatsapp) {
        this.celWhatsapp = celWhatsapp;
    }
}
