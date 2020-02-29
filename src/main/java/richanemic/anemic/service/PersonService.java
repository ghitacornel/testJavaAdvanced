package richanemic.anemic.service;

import richanemic.anemic.model.Person;

public class PersonService {

    public String getNameAndCNP(Person person) {
        return person.getName() + " " + person.getCNP();
    }

}
