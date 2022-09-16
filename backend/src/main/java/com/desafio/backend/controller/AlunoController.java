package com.desafio.backend.controller;

import com.desafio.backend.dto.CadastroAlunoDTO;
import com.desafio.backend.entity.Aluno;
import com.desafio.backend.entity.Curso;
import com.desafio.backend.repository.AlunoRepository;
import com.desafio.backend.repository.CursoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AlunoController {

    @Autowired
    AlunoRepository alunoRepository;

    @Autowired
    CursoRepository cursoRepository;

    @GetMapping
    public ResponseEntity listarTodos() {
        List<Aluno> alunos = alunoRepository.findAll();

        if (alunos.isEmpty()) return ResponseEntity.status(204).build();

        return ResponseEntity.status(200).body(alunos);
    }

    @PostMapping
    public ResponseEntity cadastrar(@RequestBody CadastroAlunoDTO payload) {
        if (payload == null) return ResponseEntity.status(400).build();

        Curso curso = cursoRepository.findById(payload.getCurso_id()).get();

        if (curso != null) {
            Aluno novoAluno = new Aluno();

            novoAluno.setNome(payload.getNome());
            novoAluno.setGenero(payload.getGenero());
            novoAluno.setCurso(curso);

            alunoRepository.save(novoAluno);

            return ResponseEntity.status(200).build();
        }

        return ResponseEntity.status(403).build();
    }
}
