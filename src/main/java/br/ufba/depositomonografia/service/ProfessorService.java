package br.ufba.depositomonografia.service;

import br.ufba.depositomonografia.model.Professor;
import br.ufba.depositomonografia.repository.ProfessorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository repository;

    public List<Professor> findAll() {
        return repository.findAll();
    }

    public Professor findOne(Long id) {
        return repository.getOne(id);
    }

    public Professor save(Professor professor) {
        return repository.saveAndFlush(professor);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
