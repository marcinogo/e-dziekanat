package ogo.marcin.e_dziekanat.model;

import javax.persistence.*;

@Entity
public class KadraPracownicza {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String nazisko;

    @Enumerated(EnumType.STRING)
    private Stanowisko stanowisko;

    public KadraPracownicza() {
    }

    public KadraPracownicza(String name, String nazisko, Stanowisko stanowisko) {
        this.name = name;
        this.nazisko = nazisko;
        this.stanowisko = stanowisko;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNazisko() {
        return nazisko;
    }

    public void setNazisko(String nazisko) {
        this.nazisko = nazisko;
    }

    public Stanowisko getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(Stanowisko stanowisko) {
        this.stanowisko = stanowisko;
    }
}
