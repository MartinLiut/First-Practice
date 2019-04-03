import java.util.List;

public class Person {
    private String name;
    private int id;
    private int age;
    private int localID;
    private static int IDcounter = 1;

    public Person(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
        localID = this.IDcounter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return
            this.localID + ".   " +
            "Name: " + this.name + "   -   " +
            "ID: " + this.id + "   -   " +
            "Age: " + this.age + '\n';
    }
}
