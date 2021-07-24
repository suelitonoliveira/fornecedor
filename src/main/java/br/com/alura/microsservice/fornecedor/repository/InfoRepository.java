package br.com.alura.microsservice.fornecedor.repository;

import br.com.alura.microsservice.fornecedor.model.InfoFornecedor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoRepository extends CrudRepository<InfoFornecedor, Long> {
    InfoFornecedor findByEstado(String estado);
}
