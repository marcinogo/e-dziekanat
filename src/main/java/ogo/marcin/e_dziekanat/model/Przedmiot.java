package ogo.marcin.e_dziekanat.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Przedmiot {

    @Id
    @GeneratedValue
    private Long id;

    private Integer ects;

    @OneToMany
    private Set<Zajęcia> zajęcia = new HashSet<>();

    @ManyToMany
    private Set<Prowadzący> prowadzącie = new HashSet<>();

    public Przedmiot() {
    }
}
