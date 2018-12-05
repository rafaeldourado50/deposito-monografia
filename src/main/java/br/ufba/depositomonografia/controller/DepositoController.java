package br.ufba.depositomonografia.controller;

import javax.validation.Valid;

import br.ufba.depositomonografia.dominio.Idioma;
import br.ufba.depositomonografia.dominio.Pais;
import br.ufba.depositomonografia.dominio.PermissaoAcesso;
import br.ufba.depositomonografia.dominio.TipoDocumento;
import br.ufba.depositomonografia.model.Colecao;
import br.ufba.depositomonografia.model.Deposito;
import br.ufba.depositomonografia.model.Professor;
import br.ufba.depositomonografia.service.ColecaoService;
import br.ufba.depositomonografia.service.DepositoService;
import br.ufba.depositomonografia.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class DepositoController {

    @Autowired
    private DepositoService service;

    @Autowired
    private ColecaoService colecaoService;

    @Autowired
    private ProfessorService professorService;

    private List<Colecao> listaColecao;
    private List<Professor> listaProfessor;

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

        if (listaColecao == null) {
            listaColecao = colecaoService.findAll();
        }
        mv.addObject("colecoes", listaColecao);

        if (listaProfessor == null) {
            listaProfessor = professorService.findAll();
        }
        mv.addObject("professores", listaProfessor);

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

        if (result.hasErrors()) {
            return add(deposito);
        }

        service.save(deposito);

        return findAll();
    }

    public List<Colecao> getListaColecao() {
        return listaColecao;
    }

    public void setListaColecao(List<Colecao> listaColecao) {
        this.listaColecao = listaColecao;
    }

    public List<Professor> getListaProfessor() {
        return listaProfessor;
    }

    public void setListaProfessor(List<Professor> listaProfessor) {
        this.listaProfessor = listaProfessor;
    }
}
