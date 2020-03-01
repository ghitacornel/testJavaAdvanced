package design.facade;

import java.util.List;

public class EvidentaAngajatilor {

    private void adaugaAngajat(Angajat angajat) {
    }

    void scoateAngajat(Angajat angajat) {
    }

    void updateAngajat(Angajat angajat) {
    }

    int numaraAngajati() {
        return 0;
    }

    List<Angajat> findByName(String name) {
        return null;
    }

    List<Angajat> findByContractId(Object contractId) {
        return null;
    }

    void platesteSalariile() {
    }

    List<Angajat> findAllTemporary() {
        return null;
    }

    HRClient getHrClient() {
        return new HRClient() {
            @Override
            public void adaugaAngajat(Angajat angajat) {
                EvidentaAngajatilor.this.adaugaAngajat(angajat);
            }

            @Override
            public void scoateAngajat(Angajat angajat) {
                EvidentaAngajatilor.this.scoateAngajat(angajat);
            }

            @Override
            public void updateAngajat(Angajat angajat) {
                EvidentaAngajatilor.this.updateAngajat(angajat);
            }

            @Override
            public int numaraAngajati() {
                return EvidentaAngajatilor.this.numaraAngajati();
            }
        };
    }

}
