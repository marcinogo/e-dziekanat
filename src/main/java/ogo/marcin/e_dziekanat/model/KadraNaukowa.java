package ogo.marcin.e_dziekanat.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class KadraNaukowa implements Prowadzący{

    @Id
    @GeneratedValue
    private Long id;

    private String imię;

    private String nazwisko;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private Set<Tytuł> tytuły = new HashSet<>();

    private Kalendarz kalendarz;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImię() {
        return imię;
    }

    public void setImię(String imię) {
        this.imię = imię;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Set<Tytuł> getTytuły() {
        return tytuły;
    }

    public void setTytuły(Set<Tytuł> tytuły) {
        this.tytuły = tytuły;
    }

    @Override
    public Kalendarz getKalendarz() {
        return kalendarz;
    }

    @Override
    public void setKalendarz(Kalendarz kalendarz) {
        this.kalendarz = kalendarz;
    }
}
