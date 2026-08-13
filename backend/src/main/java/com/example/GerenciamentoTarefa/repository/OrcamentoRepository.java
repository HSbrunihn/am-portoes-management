package com.example.GerenciamentoTarefa.repository;
import com.example.GerenciamentoTarefa.entity.Orcamento;
import com.example.GerenciamentoTarefa.entity.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrcamentoRepository extends JpaRepository<Orcamento,Long> {

}
