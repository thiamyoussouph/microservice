package com.solution.mecroservice.Service;

import com.solution.mecroservice.DTO.CompteDtorequestDTO;
import com.solution.mecroservice.DTO.CompteDtoresponse;
import com.solution.mecroservice.Entities.Compte;
import com.solution.mecroservice.Mappers.CompteMappers;
import com.solution.mecroservice.Repository.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;

@Service
@Transactional
public class CompteServiceIùplement implements iCompteService {
    @Autowired
    CompteRepository compteRepository;
    @Autowired
     private CompteMappers compteMappers;


    @Override
    public CompteDtoresponse saveCompte(CompteDtorequestDTO compteDto) {
        Compte compte=Compte.builder()
                .id(UUID.randomUUID().toString())
                .date(new Date())
                .balence(compteDto.getBalence())
                .currency(compteDto.getCurrency())
                .type(compteDto.getType())
                .build();
     Compte save =compteRepository.save(compte);
       CompteDtoresponse compteDtoresponse = compteMappers.fromCompte(save);
        return null;
    }

}
