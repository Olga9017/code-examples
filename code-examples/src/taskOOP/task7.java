package taskOOP;

public class task7 {
    public static void main(String[] args) {
        Human human = new Human();
       human.age = 24;
       human.name = "Илья" ;
        System.out.println("Имя: " + human.name + "\nВозраст: " + human.age);
        human.eat();
        human.sleep();

        Dog dog = new Dog();
        dog.name = "Шарик";
        System.out.println();
        System.out.println("Имя собаки: " + dog.name);
        dog.bark();
        dog.eat();
        dog.sleep();

        Doctors doctor = new Doctors();
        doctor.age = 45;
        doctor.name = "Ярослав";
        System.out.println();
        System.out.println("Имя: " + doctor.name);
        doctor.eat();
        doctor.sleep();


    }
}
