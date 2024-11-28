package com.senac.sp.cadastro.cadastrocuncionario.usecase;

import com.senac.sp.cadastro.cadastrocuncionario.model.FuncionarioModel;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service

public class CadastroFuncionarioUseCaseImpl implements CadastroFuncionarioUseCase{
    @Override
    public FuncionarioModel buscarFuncionario(Integer id) {
        return new FuncionarioModel()
                .setId(id)
                .setNome("Renan")
                .setIdade(28)
                .setSalario(Double.valueOf("5000.00"))
                .setCargo("Desenvolvedor")
                .setHorasMensais(60);
    }

    @Override
    public FuncionarioModel criarFuncionario(String nome, Integer idade, Double salario, String cargo, Integer horasMensais) {
        return new FuncionarioModel()
                .setId(new Random().nextInt())
                .setNome(nome)
                .setIdade(idade)
                .setSalario(salario)
                .setCargo(cargo)
                .setHorasMensais(horasMensais);
    }
}
