package com.debora.lendas_api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LendaController {

    @GetMapping("/lendas")
    public List<Lenda> listar(){

        List<Lenda> list = new ArrayList<>();

        Lenda l1 = new Lenda();
        l1.nome = "Drizzt d'Urden";
        l1.classe = "Ranger";
        l1.raca = "Drow";

        Lenda l2 = new Lenda();
        l2.nome = "Zaknafein d'Urden";
        l2.classe = "Espadachin";
        l2.raca = "Drow";

        list.add(l1);
        list.add(l2);

        return list;
    }
}

