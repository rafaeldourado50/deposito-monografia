package br.ufba.depositomonografia.service;

import java.util.List;

import br.ufba.depositomonografia.model.Formulario;
import br.ufba.depositomonografia.repository.FormularioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormularioService {

    @Autowired
    private FormularioRepository repository;

    public List<Formulario> findAll() {
        return repository.findAll();
    }

    public Formulario findOne(Long id) {
        return repository.getOne(id);
    }

    public Formulario save(Formulario formulario) {
        return repository.saveAndFlush(formulario);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
