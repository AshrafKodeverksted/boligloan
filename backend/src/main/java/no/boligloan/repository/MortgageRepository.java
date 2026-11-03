package no.boligloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import no.boligloan.model.Mortgage;

public interface MortgageRepository extends JpaRepository<Mortgage, Long>{
    
}
    