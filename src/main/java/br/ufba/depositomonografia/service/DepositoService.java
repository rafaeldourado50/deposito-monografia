package br.ufba.depositomonografia.service;

import java.util.List;

import br.ufba.depositomonografia.model.Deposito;
import br.ufba.depositomonografia.repository.DepositoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepositoService {

    @Autowired
    private DepositoRepository repository;

    public List<Deposito> findAll() {
        return repository.findAll();
    }

    public Deposito findOne(Long id) {
        return repository.getOne(id);
    }

    public Deposito save(Deposito deposito) {
        return repository.saveAndFlush(deposito);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
