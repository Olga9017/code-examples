package zoo;
//кусаются и могут болеть

public class Animal {
    boolean healthy;
    String name;
    String cage = " в вольере";

    public void bite (Human human){
        human.hurt = true;
        System.out.println("Животное покусало" + human.profession);
    }
}
