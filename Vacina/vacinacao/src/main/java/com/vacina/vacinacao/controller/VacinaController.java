package com.vacina.vacinacao.controller;

import com.vacina.vacinacao.domain.vacina.Vacina;
import com.vacina.vacinacao.domain.vacina.VacinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vacina")
public class VacinaController {
    private VacinaService vacinaService;

    @Autowired
    public VacinaController(VacinaService vacinaService){
        this.vacinaService = vacinaService;
    }
    @PostMapping("/cadastrar")
    public Vacina cadastrarVacina(@RequestBody Vacina vacina){
        return vacinaService.cadastrarVacina(vacina);
    }
    @GetMapping("/listar")
    public List<Vacina> listarVacinas(){
        return vacinaService.listarVacinas();
    }
}
