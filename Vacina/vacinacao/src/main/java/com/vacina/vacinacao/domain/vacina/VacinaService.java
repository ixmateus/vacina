package com.vacina.vacinacao.domain.vacina;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VacinaService {
    private VacinaRepository vacinaRepository;

    public VacinaService(VacinaRepository vacinaRepository){
        this.vacinaRepository = vacinaRepository;
    }
    public Vacina cadastrarVacina(Vacina vacina){
        return vacinaRepository.save(vacina);
    }
    public List<Vacina> listarVacinas(){
        return vacinaRepository.findAll();
    }
}
