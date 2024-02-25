package com.example.oblig1;

public class Bilett {
    private String filmnavn;
    private int antall;
    private String fornavn;
    private String etternavn;
    private String tlf;
    private String epost;
    public Bilett(String filmnavn,int antall,String etternavn,String tlf,String epost) {
        this.filmnavn = filmnavn;
        this.antall = antall;
        this.etternavn = etternavn;
        this.tlf = tlf;
        this.epost = epost;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public void setFilmnavn(String filmnavn) {
        this.filmnavn = filmnavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public void setEpost(String epost) {
        this.epost = epost;
    }

    public void setAntall(int antall) {
        this.antall = antall;
    }

    public String getTlf() {
        return tlf;
    }

    public String getFornavn() {
        return fornavn;
    }

    public String getFilmnavn() {
        return filmnavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEpost() {
        return epost;
    }

    public int getAntall() {
        return antall;
    }

    public String getEtternavn() {
        return etternavn;
    }
}
