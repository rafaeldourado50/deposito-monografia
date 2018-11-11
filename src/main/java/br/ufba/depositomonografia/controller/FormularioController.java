package br.ufba.depositomonografia.controller;

import javax.validation.Valid;

import br.ufba.depositomonografia.model.Formulario;
import br.ufba.depositomonografia.service.FormularioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormularioController {

    @Autowired
    private FormularioService service;

    @GetMapping("/")
    public ModelAndView findAll() {

        ModelAndView mv = new ModelAndView("/formularioList");
        mv.addObject("formularios", service.findAll());

        return mv;
    }

    @GetMapping("/add")
    public ModelAndView add(Formulario formulario) {

        ModelAndView mv = new ModelAndView("/formularioCRUD");
        mv.addObject("formulario", formulario);

        return mv;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable("id") Long id) {

        return add(service.findOne(id));
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") Long id) {

        service.delete(id);

        return findAll();
    }

    @PostMapping("/save")
    public ModelAndView save(@Valid Formulario formulario, BindingResult result) {

        if(result.hasErrors()) {
            return add(formulario);
        }

        service.save(formulario);

        return findAll();
    }

}
