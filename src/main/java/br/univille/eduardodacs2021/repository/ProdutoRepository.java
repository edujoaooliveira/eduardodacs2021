package br.univille.eduardodacs2021.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.eduardodacs2021.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{


}