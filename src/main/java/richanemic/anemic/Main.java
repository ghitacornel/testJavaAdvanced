package richanemic.anemic;

import richanemic.anemic.model.Person;
import richanemic.anemic.model.Sex;
import richanemic.anemic.service.PersonService;
import richanemic.anemic.service.PersonTaxService;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();
        person.setCNP(1);
        person.setSalary(10);
        person.setAge(20);
        person.setSex(Sex.M);
        person.setName("ion");

        PersonService personService = new PersonService();
        PersonTaxService personTaxService = new PersonTaxService();


        System.out.println(personTaxService.calculeazaTaxe(person));
        System.out.println(personTaxService.calculeazaTaxeBasedOnSex(person));
        System.out.println(personService.getNameAndCNP(person));

    }
}
