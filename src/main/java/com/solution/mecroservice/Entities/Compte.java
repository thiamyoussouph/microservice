package com.solution.mecroservice.Entities;

import com.solution.mecroservice.enume.TypesCompte;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
@Builder
public class Compte {
    @Id
    private String id;
    private Date date;
    private Double balence;
    private String currency;
    private TypesCompte type;


}
