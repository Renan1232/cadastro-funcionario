package com.senac.sp.cadastro.cadastrocuncionario.model;

public class FuncionarioModel {
    private Integer id;
    private String nome;
    private Integer idade;
    private Double salario;
    private String cargo;
    private Integer horasMensais;

    public Integer getId() {
        return id;
    }

    public FuncionarioModel setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public FuncionarioModel setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Integer getIdade() {
        return idade;
    }

    public FuncionarioModel setIdade(Integer idade) {
        this.idade = idade;
        return this;
    }

    public Double getSalario() {
        return salario;
    }

    public FuncionarioModel setSalario(Double salario) {
        this.salario = salario;
        return this;
    }

    public String getCargo() {
        return cargo;
    }

    public FuncionarioModel setCargo(String cargo) {
        this.cargo = cargo;
        return this;
    }

    public Integer getHorasMensais() {
        return horasMensais;
    }

    public FuncionarioModel setHorasMensais(Integer horasMensais) {
        this.horasMensais = horasMensais;
        return this;
    }
}
