package no.boligloan.config;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import no.boligloan.model.Mortgage;
import no.boligloan.repository.MortgageRepository;

@Component
public class DataInitializer implements CommandLineRunner {

    private final MortgageRepository repository;

    public DataInitializer(MortgageRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {

        if (repository.count() == 0) {
            Mortgage mortgage = new Mortgage(
                new BigDecimal("1900000.00")
            );

            repository.save(mortgage);
        }
    }
}