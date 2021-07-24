package br.com.alura.microsservice.fornecedor.service;

import br.com.alura.microsservice.fornecedor.model.InfoFornecedor;
import br.com.alura.microsservice.fornecedor.repository.InfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoService {

    @Autowired
    private InfoRepository infoRepository;

    public InfoFornecedor getInfoPorEstado(String estado) {
        return infoRepository.findByEstado(estado);
    }
}
