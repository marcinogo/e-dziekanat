package ogo.marcin.e_dziekanat.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
//@Inheritance(strategy = InheritanceType.JOINED)
public class Student {

    @Id
    private Long numerAlbumu;

    private String imie;

    private String nazwisko;

    @Transient
    private Set<Przedmiot> przedmioty = new HashSet<>();

    private Integer semestr;

    public Student() {
    }

    public Student(Long numerAlbumu, String imie, String nazwisko, Integer semestr) {
        this.numerAlbumu = numerAlbumu;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.semestr = semestr;
    }

    public Long getNumerAlbumu() {
        return numerAlbumu;
    }

    public void setNumerAlbumu(Long numerAlbumu) {
        this.numerAlbumu = numerAlbumu;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Set<Przedmiot> getPrzedmioty() {
        return przedmioty;
    }

    public void setPrzedmioty(Set<Przedmiot> przedmioty) {
        this.przedmioty = przedmioty;
    }

    public Integer getSemestr() {
        return semestr;
    }

    public void setSemestr(Integer semestr) {
        this.semestr = semestr;
    }
}
