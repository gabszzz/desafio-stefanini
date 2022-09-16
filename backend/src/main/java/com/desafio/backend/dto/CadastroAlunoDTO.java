package com.desafio.backend.dto;

public class CadastroAlunoDTO {
    private String nome;
    private String genero;
    private Integer curso_id;

    public CadastroAlunoDTO() {
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getCurso_id() {
        return curso_id;
    }
}
