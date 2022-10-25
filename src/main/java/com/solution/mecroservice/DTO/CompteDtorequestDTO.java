package com.solution.mecroservice.DTO;

import com.solution.mecroservice.enume.TypesCompte;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data @AllArgsConstructor @NoArgsConstructor
@Builder
public class CompteDtorequestDTO {


    private Double balence;
    private String currency;
    private TypesCompte type;
}
