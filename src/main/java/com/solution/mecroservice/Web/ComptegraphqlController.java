package com.solution.mecroservice.Web;

import com.solution.mecroservice.Entities.Compte;
import com.solution.mecroservice.Repository.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ComptegraphqlController {
    @Autowired
    private CompteRepository compteRepository;
    @QueryMapping
     public List<Compte> compteliste(){
         return compteRepository.findAll();
     }
    @QueryMapping
    public Compte  comptebyid(@Argument String id){
        return compteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(String.format("Compte not found", id)));
    }
}
