public class Main {
    public static void main(String[] args) {
        Person person = new Person("Janybek", 22, "Orozbekov");
        Employees employees = new Employees("Janybek", 22, "Orozbekov", "Janybek000233", 234, 234);
        System.out.println(employees.toString());
        System.out.println(person.toString());
        System.out.println();
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

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", surname='" + surname + '\'' +
                '}';
    }

    public String getSurnameName(String name, String surname) {
        if (surname.equals("Janybek") || surname.equals("Orozbekov")) {
            return "i know you, and i have an information about you" ;
        } else {
            return "i dont know, who are you";
        }
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



    public int getInn() {
        return inn;
    }

    public void setInn(int inn) {
        this.inn = inn;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNameCard() {
        return nameCard;
    }

    public void setNameCard(String nameCard) {
        this.nameCard = nameCard;
    }
    @Override
    public String toString() {
        return "Employees{" +
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
        return "Developer{" +
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", language=" + language +
                '}';
    }
}

