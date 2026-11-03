package no.boligloan.service;
import org.springframework.stereotype.Service;

import no.boligloan.model.Mortgage;
import no.boligloan.repository.MortgageRepository;

@Service // denne er rollen til Classen, den håndterer forretningslogikk
public class MortgageService {
//dette kalles Dependency injection DI
    private final MortgageRepository repository;

public MortgageService(MortgageRepository repository) {
    this.repository = repository;
}

public Mortgage getMortgage() {
    return repository.findById(1L).orElseThrow();
}
    
}
