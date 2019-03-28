import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List auxArray = new ArrayList();
        auxArray.add(new Person("Martin", 37867862, 25));
        auxArray.add(new Person("Juan", 20196438, 15));
        auxArray.add(new Person("Pedro", 15302846, 12));

        PersonList personList = new PersonList(auxArray);
        List<Person> listFiltered1 = personList.getOlderThan18();
        System.out.print("People older that 18 years:\n");
        System.out.print("----------------------------------------------------\n");
        for (Person person : listFiltered1) {
            System.out.print(person.toString());
        }
        System.out.print("----------------------------------------------------\n");

        List<Person> listFiltered2 = personList.getYoungerThan18();
        System.out.print("People younger that 18 years:\n");
        System.out.print("----------------------------------------------------\n");
        for (Person person : listFiltered2) {
            System.out.print(person.toString());
        }
        System.out.print("----------------------------------------------------\n");

        List<Person> listFiltered3 = personList.getOlderThan18AndIdMoreThan20000000();
        System.out.print("People older that 18 years and ID upper than 20.000.000:\n");
        System.out.print("----------------------------------------------------\n");
        for (Person person : listFiltered3) {
            System.out.print(person.toString());
        }
        System.out.print("----------------------------------------------------\n");
    }

}
