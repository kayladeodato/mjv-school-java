package br.com.mjv.model;

import java.util.List;

public class Profissao {

    private String cargo;
    private String empresa;
    private Double salario;
    private boolean empregoAtual;
    private VinculoEmpregaticio vinculoEmpregaticio;
    private List habilidades;
    private Double pretensaoSalarialMin;
    private Double pretensaoSalarialMax;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public boolean isEmpregoAtual() {
        return empregoAtual;
    }

    public void setEmpregoAtual(boolean empregoAtual) {
        this.empregoAtual = empregoAtual;
    }

    public VinculoEmpregaticio getVinculoEmpregaticio() {
        return vinculoEmpregaticio;
    }

    public void setVinculoEmpregaticio(VinculoEmpregaticio vinculoEmpregaticio) {
        this.vinculoEmpregaticio = vinculoEmpregaticio;
    }

    public List getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List habilidades) {
        this.habilidades = habilidades;
    }

    public Double getPretensaoSalarialMin() {
        return pretensaoSalarialMin;
    }

    public void setPretensaoSalarialMin(Double pretensaoSalarialMin) {
        this.pretensaoSalarialMin = pretensaoSalarialMin;
    }

    public Double getPretensaoSalarialMax() {
        return pretensaoSalarialMax;
    }

    public void setPretensaoSalarialMax(Double pretensaoSalarialMax) {
        this.pretensaoSalarialMax = pretensaoSalarialMax;
    }
}
