
package com.solution.mecroservice.Web;

import com.solution.mecroservice.DTO.CompteDtorequestDTO;
import com.solution.mecroservice.DTO.CompteDtoresponse;
import com.solution.mecroservice.Mappers.CompteMappers;
import com.solution.mecroservice.Repository.CompteRepository;
import com.solution.mecroservice.Service.CompteServiceIùplement;
import com.solution.mecroservice.Service.iCompteService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CompteController {
    private CompteRepository compteRepository;
    private CompteServiceIùplement compteServiceIùplement;
    private CompteMappers compteMappers;
    private iCompteService icompteService;

    public CompteController(CompteRepository compteRepository, CompteServiceIùplement compteServiceIùplement, CompteMappers compteMappers, iCompteService icompteService) {
        this.compteRepository = compteRepository;
        this.compteServiceIùplement = compteServiceIùplement;
        this.compteMappers = compteMappers;
        this.icompteService = icompteService;
    }

@PostMapping("/compte")
    public CompteDtoresponse saveCompte(@RequestBody CompteDtorequestDTO compteDto){
        return icompteService.saveCompte(compteDto);

    }

    @GetMapping("/comptes")
    public CompteDtoresponse getCompte(@RequestParam String id){
        return compteMappers.fromCompte(compteRepository.findById(id).get());
    }
}
