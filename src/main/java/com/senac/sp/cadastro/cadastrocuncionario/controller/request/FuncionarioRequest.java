package com.senac.sp.cadastro.cadastrocuncionario.controller.request;

public class FuncionarioRequest {

    private String nome;
    private Integer idade;
    private Double salario;
    private String cargo;
    private Integer horasMensais;

    public String getNome() {
        return nome;
    }

    public FuncionarioRequest setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Integer getIdade() {
        return idade;
    }

    public FuncionarioRequest setIdade(Integer idade) {
        this.idade = idade;
        return this;
    }

    public Double getSalario() {
        return salario;
    }

    public FuncionarioRequest setSalario(Double salario) {
        this.salario = salario;
        return this;
    }

    public String getCargo() {
        return cargo;
    }

    public FuncionarioRequest setCargo(String cargo) {
        this.cargo = cargo;
        return this;
    }

    public Integer getHorasMensais() {
        return horasMensais;
    }

    public FuncionarioRequest setHorasMensais(Integer horasMensais) {
        this.horasMensais = horasMensais;
        return this;
    }
}
