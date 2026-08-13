package com.example.GerenciamentoTarefa.repository;


import com.example.GerenciamentoTarefa.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
