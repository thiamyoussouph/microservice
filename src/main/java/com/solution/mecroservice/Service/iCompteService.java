package com.solution.mecroservice.Service;

import com.solution.mecroservice.DTO.CompteDtorequestDTO;
import com.solution.mecroservice.DTO.CompteDtoresponse;
import com.solution.mecroservice.Entities.Compte;

public interface iCompteService {
    public CompteDtoresponse saveCompte(CompteDtorequestDTO compteDto );
}
