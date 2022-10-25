package com.solution.mecroservice;

import com.solution.mecroservice.Entities.Compte;
import com.solution.mecroservice.Repository.CompteRepository;
import com.solution.mecroservice.enume.TypesCompte;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class MecroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MecroserviceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CompteRepository compteRepository) {
        return args -> {
            for (int i = 0; i < 10; i++){
                Compte compte = Compte.builder()
                        .id(UUID.randomUUID().toString())
                        .date(new Date())
                        .balence(1000.0+Math.random()*1000)
                        .currency("FCFA")
                        .type(Math.random() > 0.5 ? TypesCompte.current_account : TypesCompte.saving_account)
                        .build();
                compteRepository.save(compte);
            }


        };
    }
}
