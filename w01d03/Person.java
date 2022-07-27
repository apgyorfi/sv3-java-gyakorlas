package w01d03;

class PersonData {
    public PersonData(String name, String birth, String mother) {
        System.out.print("Név: " + name + System.lineSeparator() +
                "Születési hely, idő: " + birth + System.lineSeparator() +
                "Anyja neve: " + mother);
    }
}

public class Person{

    public static void main(String[] args) {
        new PersonData("Teszt Elek", "Budapest, 1983.05.27.", "Minta Gizella");
    }

}