import java.util.ArrayList;
import java.util.List;

public class PersonList {
    private List<Person> personList;

    public PersonList(List<Person> personList) {
        this.personList = personList;
    }

    public List getOlderThan18() {
        List auxArray = new ArrayList<Person>();
        for (Person person : personList) {
            if(person.getAge() > 18)
                auxArray.add(person);
        }
        return auxArray;
    }

    public List getYoungerThan18() {
        List auxArray = new ArrayList<Person>();
        for (Person person : personList) {
            if(person.getAge() < 18)
                auxArray.add(person);
        }
        return auxArray;
    }

    public List getOlderThan18AndIdMoreThan20000000() {
        List auxArray = new ArrayList<Person>();
        for (Person person : personList) {
            if(person.getAge() > 18 && person.getId() > 20000000)
                auxArray.add(person);
        }
        return auxArray;
    }
}
