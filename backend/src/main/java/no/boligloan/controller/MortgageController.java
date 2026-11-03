package no.boligloan.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import no.boligloan.model.Mortgage;
import no.boligloan.service.MortgageService;

@RestController //Denne klassen skal håndtere HTTP-forespørsler og sende svar tilbake.
@RequestMapping("/api/mortgage") //Dette bestemmer hvilken URL controlleren skal være knyttet til. http://localhost:8080/api/mortgage
@CrossOrigin(origins = "http://localhost:5173") // CORS, dette sier at backend kan tillate forespørsler fra denne origin(port)
public class MortgageController {
private final MortgageService mortgageService;

public MortgageController(MortgageService mortgageService) {
    this.mortgageService = mortgageService;
}

    @GetMapping
    public Mortgage getMortgage() {
        return mortgageService.getMortgage();
    }
}