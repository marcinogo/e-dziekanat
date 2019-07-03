package ogo.marcin.e_dziekanat.model;

import javax.persistence.Entity;
import java.util.Set;

@Entity
public class StudentDoktorancki extends Student implements Prowadzący{

    private Kalendarz kalendarz;

    public StudentDoktorancki() {
    }

    public StudentDoktorancki(Long numerAlbumu, String imię, String nazwisko, Integer semestr, Kalendarz kalendarz) {
        super(numerAlbumu, imię, nazwisko, semestr);
        this.kalendarz = kalendarz;
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
