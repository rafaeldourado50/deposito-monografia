package br.ufba.depositomonografia.controller;

import br.ufba.depositomonografia.model.Professor;
import br.ufba.depositomonografia.service.ProfessorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class ProfessorController {

    @Autowired
    private ProfessorService service;

    @GetMapping("/professor")
    public ModelAndView findAll() {

        ModelAndView mv = new ModelAndView("professorList");
        mv.addObject("professores", service.findAll());

        return mv;
    }

    @GetMapping("/professor/add")
    public ModelAndView add(Professor professor) {

        ModelAndView mv = new ModelAndView("professorCRUD");
        mv.addObject("professor", professor);
        return mv;
    }

    @GetMapping("/professor/edit/{id}")
    public ModelAndView edit(@PathVariable("id") Long id) {

        return add(service.findOne(id));
    }

    @GetMapping("/professor/delete/{id}")
    public ModelAndView delete(@PathVariable("id") Long id) {

        service.delete(id);

        return findAll();
    }

    @PostMapping("/professor/save")
    public ModelAndView save(@Valid Professor professor, BindingResult result) {

        if (result.hasErrors()) {
            return add(professor);
        }

        service.save(professor);

        return findAll();
    }
}
