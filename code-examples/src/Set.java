import java.util.HashSet;
// значения должны быть уникальны
public class Set {
    public static void main(String[] args) {
        HashSet<String> mySet = new HashSet<>();
        mySet.add("Window");
        mySet.add("Door");
        mySet.add("House");
        mySet.add("House");

        System.out.println(mySet);

        mySet.remove("Door");
        //mySet.add("Door");
        System.out.println(mySet);
    }
}
