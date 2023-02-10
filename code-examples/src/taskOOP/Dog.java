package taskOOP;

public class Dog extends Animal{
    public String name;
    public void bark(){
        System.out.println("Гав-гав");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест");
    }

    @Override
    public void sleep() {
        System.out.println("Собака спит");

    }
}
