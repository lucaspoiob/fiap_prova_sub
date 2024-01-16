package br.com.fiap.prova_substituta.controller;

import br.com.fiap.prova_substituta.entity.Aluno;
import br.com.fiap.prova_substituta.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@Controller
public class AlunoController {
    @Autowired
    private AlunoRepository alunoRepository;

    @ResponseBody
    @RequestMapping("/alunos")
    public List<Aluno> list() {
        return alunoRepository.findAll();
    }

    @ResponseBody
    @Transactional
    @RequestMapping(path = "/alunos", method = RequestMethod.POST)
    public void save(@RequestBody Aluno aluno) {
        alunoRepository.save(aluno);
    }

    @ResponseBody
    @Transactional
    @RequestMapping(path = "/alunos", method = RequestMethod.PUT)
    public void update(@RequestBody Aluno aluno) {
        alunoRepository.save(aluno);
    }

    @ResponseBody
    @Transactional
    @RequestMapping(path = "/alunos/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String id){
        alunoRepository.deleteById(id);
    }
}
