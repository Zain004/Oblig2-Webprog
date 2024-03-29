package com.example.oblig1;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor //autogenerer en tom konstruktør
@AllArgsConstructor //autogenerer en konctruktør
@Data //generer auto get og set metoder
public class Bilett {
    private String filmnavn;
    private int antall;
    private String etternavn;
    private String fornavn;
    private String tlf;
    private String epost;
}
