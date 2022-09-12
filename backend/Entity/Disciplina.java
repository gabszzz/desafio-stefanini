package Desafio.AlunoDisciplina.Entity;

import javax.persistence.*;

@Entity
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDisciplina;

    private String titulo;

    private String sala;

    private String cargaHoraria;

    @ManyToMany
    private Aluno aluno;

    public Integer getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(Integer idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
