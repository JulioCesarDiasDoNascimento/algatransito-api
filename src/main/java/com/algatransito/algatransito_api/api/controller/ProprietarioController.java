package com.algatransito.algatransito_api.api.controller;

import com.algatransito.algatransito_api.domain.model.Proprietario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProprietarioController {

    @GetMapping("/proprietarios")
    public List<Proprietario> listar(){

        Proprietario proprietarioEU = new Proprietario();
        proprietarioEU.setId(1L);
        proprietarioEU.setNome("Julio");
        proprietarioEU.setEmail("juliocesarddn@teste.com");
        proprietarioEU.setTelefone("84994484221");

        Proprietario proprietarioGIGI = new Proprietario();
        proprietarioGIGI.setId(2L);
        proprietarioGIGI.setNome("Giovanna");
        proprietarioGIGI.setEmail("gi@teste.com");
        proprietarioGIGI.setTelefone("84994484222");

        return Arrays.asList(proprietarioEU, proprietarioGIGI);
    }
}
