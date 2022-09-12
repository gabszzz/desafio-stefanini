package Desafio.AlunoDisciplina.Repository;


import Desafio.AlunoDisciplina.Entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

}
