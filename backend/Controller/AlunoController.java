package Desafio.AlunoDisciplina.Controller;

import Desafio.AlunoDisciplina.Repository.AlunoRepository;
import Desafio.AlunoDisciplina.Repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Aluno")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private DisciplinaRepository disciplinaRepository;


}