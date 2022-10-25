package com.solution.mecroservice.Mappers;

import com.solution.mecroservice.DTO.CompteDtoresponse;
import com.solution.mecroservice.Entities.Compte;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class CompteMappers {
    public CompteDtoresponse fromCompte(Compte compte){
        CompteDtoresponse compteDtoresponse = new CompteDtoresponse();
        BeanUtils.copyProperties(compte,compteDtoresponse);
        return compteDtoresponse;
    }
}
