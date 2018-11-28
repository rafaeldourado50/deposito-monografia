package br.ufba.depositomonografia.controller;

import javax.validation.Valid;

import br.ufba.depositomonografia.dominio.Idioma;
import br.ufba.depositomonografia.dominio.Pais;
import br.ufba.depositomonografia.dominio.PermissaoAcesso;
import br.ufba.depositomonografia.dominio.TipoDocumento;
import br.ufba.depositomonografia.model.Deposito;
import br.ufba.depositomonografia.service.ColecaoService;
import br.ufba.depositomonografia.service.DepositoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DepositoController {

    @Autowired
    private DepositoService service;

    @Autowired
    private ColecaoService colecaoService;

    @GetMapping("/deposito")
    public ModelAndView findAll() {

        ModelAndView mv = new ModelAndView("depositoList");
        mv.addObject("depositos", service.findAll());

        return mv;
    }

    @GetMapping("/deposito/add")
    public ModelAndView add(Deposito deposito) {

        ModelAndView mv = new ModelAndView("depositoCRUD");
        mv.addObject("deposito", deposito);
        mv.addObject("colecoes", colecaoService.findAll());
        mv.addObject("idiomas", Idioma.values());
        mv.addObject("paises", Pais.values());
        mv.addObject("tipos", TipoDocumento.values());
        mv.addObject("permissoes", PermissaoAcesso.values());
        return mv;
    }

    @GetMapping("/deposito/edit/{id}")
    public ModelAndView edit(@PathVariable("id") Long id) {

        return add(service.findOne(id));
    }

    @GetMapping("/deposito/delete/{id}")
    public ModelAndView delete(@PathVariable("id") Long id) {

        service.delete(id);

        return findAll();
    }

    @PostMapping("/deposito/save")
    public ModelAndView save(@Valid Deposito deposito, BindingResult result) {

        if(result.hasErrors()) {
            return add(deposito);
        }

        service.save(deposito);

        return findAll();
    }

}
