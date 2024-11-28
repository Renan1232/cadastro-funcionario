package com.senac.sp.cadastro.cadastrocuncionario.usecase;

import com.senac.sp.cadastro.cadastrocuncionario.model.FuncionarioModel;

public interface CadastroFuncionarioUseCase {

    FuncionarioModel buscarFuncionario(Integer id);
    FuncionarioModel criarFuncionario(String nome,
                                      Integer idade,
                                      Double salario,
                                      String cargo,
                                      Integer horasMensais);

}
