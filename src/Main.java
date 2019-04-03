import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
            new Person("Martin", 37867862, 25),
            new Person("Juan", 20196438, 15),
            new Person("Pedro", 15302846, 12),
            new Person("Lucas", 15302846, 41),
            new Person("Cristian", 15302846, 35),
            new Person("Sandro", 15302846, 63));

         System.out.print("****** People older than 18 ***********\n");
         persons.stream()
                    .filter(person -> person.getAge() > 18)
                    .forEach(p -> System.out.print(p.toString()));

        System.out.print("\n****** People younger than 21 ***********\n");
        persons.stream()
                    .filter(person -> person.getAge() < 21)
                    .forEach(p -> System.out.print(p.toString()));

        System.out.print("\n****** People older than 21 and ID grater than 20000000 ***********\n");
        persons.stream()
                    .filter(person -> person.getAge() > 21)
                    .filter(person -> person.getId() > 20000000)
                    .forEach(p -> System.out.print(p.toString()));

        System.out.print("\n****** Limit 5 and sorted ***********\n");
        persons.stream()
                    .limit(5)
                    .sorted(Comparator.comparing(Person::getName))
                    .forEach(p -> System.out.print(p.toString()));

    }
}
