package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");

        Person person = new Person("Hillary", 40, 72);

        Person[] people = new Person[10]; // an array of 10 Person objects

        Person person1 = new Person("Alice", 25, 50);
        Person person2 = new Person("Bob", 30,65);

        people[0] = person1;
        people[1] = person2;

        System.out.println(person1);

        System.out.println(person);

        System.out.println(person2);

// what is an array? see below...




    }
}
