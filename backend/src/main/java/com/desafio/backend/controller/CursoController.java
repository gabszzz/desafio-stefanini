package com.desafio.backend.controller;

import com.desafio.backend.dto.CadastroCursoDTO;
import com.desafio.backend.entity.Curso;
import com.desafio.backend.repository.CursoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CursoController {
    @Autowired
    CursoRepository cursoRepository;

    @GetMapping
    public ResponseEntity listarTodos() {
        List<Curso> cursos = cursoRepository.findAll();

        if (cursos.isEmpty()) return ResponseEntity.status(204).build();

        return ResponseEntity.status(200).body(cursos);
    }

    @PostMapping
    public ResponseEntity cadastrar(@RequestBody CadastroCursoDTO payload) {

        Curso novoCurso = new Curso();

        BeanUtils.copyProperties(payload, novoCurso);

        cursoRepository.save(novoCurso);

        return ResponseEntity.status(200).build();
    }
}
