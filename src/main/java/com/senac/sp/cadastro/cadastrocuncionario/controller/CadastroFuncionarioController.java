package com.senac.sp.cadastro.cadastrocuncionario.controller;

import com.senac.sp.cadastro.cadastrocuncionario.controller.request.FuncionarioRequest;
import com.senac.sp.cadastro.cadastrocuncionario.model.FuncionarioModel;
import com.senac.sp.cadastro.cadastrocuncionario.usecase.CadastroFuncionarioUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/cadastro")
public class CadastroFuncionarioController {

    private final CadastroFuncionarioUseCase funcionarioUseCase;

    public CadastroFuncionarioController(CadastroFuncionarioUseCase usecase){
        this.funcionarioUseCase = usecase;
    }

    @GetMapping("/trazer-usuarios/{id-usuario}")
    public ResponseEntity<FuncionarioModel> getFuncionario(@PathVariable("id-usuario") Integer id){
        var fm = funcionarioUseCase.buscarFuncionario(id);
        return ResponseEntity.ok(fm);
    }

    @PostMapping("/criar-funcionario")
    public ResponseEntity<FuncionarioModel> criarFuncionario(@RequestBody FuncionarioRequest fr){
        var funcionario = funcionarioUseCase.criarFuncionario(
                fr.getNome(),
                fr.getIdade(),
                fr.getSalario(),
                fr.getCargo(),
                fr.getHorasMensais());
        return ResponseEntity.ok(funcionario);
    }

}
