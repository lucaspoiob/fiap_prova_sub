package br.com.fiap.prova_substituta.repository;

import br.com.fiap.prova_substituta.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    void deleteById(String id);
}
