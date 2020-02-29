package richanemic.anemic.service;

import richanemic.anemic.model.Person;

public class PersonTaxService {

    private int coeficientTara;

    public PersonTaxService() {
        // read from file
        coeficientTara = 3;
    }

    public float calculeazaTaxe(Person person) {
        return person.getSalary() / (float) person.getAge();
    }

    public float calculeazaTaxeBasedOnSex(Person person) {
        if (coeficientTara == 0) {
            if (person.hasSexNA()) return person.getSalary() / (float) person.getAge();
            return person.getSalary() / (float) person.getAge() + person.getSex().ordinal();
        } else {
            return 10;
        }
    }

}
