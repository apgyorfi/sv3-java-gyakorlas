package w01d03;

class PersonData {

    String name;
    String birth;
    String mother;

    public PersonData(String name, String birth, String mother) {
        this.name = name;
        this.birth = birth;
        this.mother = mother;
    }

    public void getPersonData(){

        System.out.print("Név: " + name + System.lineSeparator() +
                "Születési hely, idő: " + birth + System.lineSeparator() +
                "Anyja neve: " + mother);

    }
}


public class Person{

    public static void main(String[] args) {

        PersonData person = new PersonData("Teszt Elek", "Budapest, 1983.05.27.", "Minta Gizella");
        person.getPersonData();

    }

}