package no.boligloan.model;

import java.math.BigDecimal; //gir oss en datatype som egner seg til pengebeløp

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //Entity er en annotasjon. Den forteller at klassen skal representeres som en tabell i databasen.
public class Mortgage {

    @Id //forteller at id er primærnøkkelen i databasetabellen
    @GeneratedValue(strategy = GenerationType.IDENTITY) //forteller at databasen skal generere ID-en automatisk.
    private Long id;

    @Column(nullable = false, precision = 15, scale = 2) // Column gir regler for kolonnen i databasen,ikke nullable, 15 total sifrer, og 2 desimaler max Eksempel: 2000000.00.
    private BigDecimal initialBalance;

    public Mortgage() { //constuctor
    }

    public Mortgage(BigDecimal initialBalance) {
        this.initialBalance = initialBalance;
    } //Denne lar oss opprette et boliglån med en startverdi: Mortgage mortgage = new Mortgage(new BigDecimal("2000000.00"));

    public Long getId() {
        return id;
    }

    public BigDecimal getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(BigDecimal initialBalance) {
        this.initialBalance = initialBalance;
    }
    //disse tre er metoder, en metode er en funksjon som hører til en klasse. Getter brukes til å hente en verdi, mortgage.getInitialBalance(); setter brukes til å endre en verdi mortgage.setInitialBalance(new BigDecimal("1800000.00")); return betyr at metoden sender en verdi tilbake. void betyr at metoden ikke returnerer noen verdi.
}