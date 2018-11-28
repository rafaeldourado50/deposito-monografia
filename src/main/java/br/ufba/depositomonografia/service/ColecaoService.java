package br.ufba.depositomonografia.service;

import br.ufba.depositomonografia.model.Colecao;
import br.ufba.depositomonografia.repository.ColecaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColecaoService {

    @Autowired
    private ColecaoRepository repository;

    public List<Colecao> findAll() {
        return repository.findAll();
    }

    public Colecao findOne(Long id) {
        return repository.getOne(id);
    }

    public Colecao save(Colecao Deposito) {
        return repository.saveAndFlush(Deposito);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
