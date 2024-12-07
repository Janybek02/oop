public class Main {
    public static void main(String[] args) {
//        Person person = new Person("Janybek", 22, "Orozbekov");
        Developer allInformation   = new Developer( "Janybek", 22, "Orozbekov", "Janybek000233", 234, 234, "junior", "Beckend", 12);
        Developer developer = new Developer("Wiil",  22, "Smitt", "ewewew", 3333, 9009994, "Senior", "Front-end",22  );
        Person person = new Person("Who knows", 11,"some-one");
        String[] array;
        array = new String[]{String.valueOf(allInformation), String.valueOf(developer), String.valueOf(person)};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


    }
}
//Инкапсуляция и сокрытие
//class - Person
//Своиства
// int age;
//String surname;
//String surname;

//Метод
//ходить
//писать код
//играть
//учиться
//кушать

class Person {
    private String name;
    private int age;
    private String surname;

    public Person( String name, int age, String surname) {
        this.name = name;
        this.age = age;
        this.surname = surname;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", surname='" + surname + '\'' +
                '}';
    }

    public String getName() {
        return "Hello my name is " + this.name;
    }
    public String getFullName(){
        return "Hell my name is " + name + " " + surname;
    }
}

//Наследование - extends
//class Person наследует class employees Наследует class Developer



class Employees extends Person {
    private int inn;
    private int number;
    private String nameCard;

    public Employees(String name, int age, String surname, String nameCard, int inn, int number ) {
        super(name, age, surname);
        this.nameCard = name;
        this.inn = inn;
        this.number = number;

    }
    public String getName() {
        return "Hello my name is " + this.name;
    }

    @Override
    public String toString() {
        return super.toString() +  "Employees{" +
                "inn=" + inn +
                ", number=" + number +
                ", nameCard='" + nameCard + '\'' +

                '}';
    }

}


class Developer extends Employees {
    private String level;
    private String position;
    private int language;

   public Developer( String name, int age, String surname, String nameCard, int inn, int number, String level, String position, int language) {
       super(name, age, surname, nameCard, inn, number );
       this.language = language;
       this.level = level;
       this.position = position;

   }

    @Override
    public String toString() {
        return super.toString() + "Developer{" +
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", language=" + language +
                '}';
    }
}

