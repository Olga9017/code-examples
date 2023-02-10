package zoo;
//может быть голодным и покусанным
//кормит всех животных
// вычесывает кошек
//меняет бегемотам воду

public class Zookeeper extends Human{
    @Override
    void lunch() {
       if (hungry) {
           System.out.println("смотритель пообедал");
           hungry = false;
       } else  {
           System.out.println("смотритель еще не голоден");
    }

    }

    @Override
    void makeBandage() {
        if (hurt) {
            System.out.println("смотритель наложил себе повязку");
            hungry = false;
        } else  {
            System.out.println("смотритель покусан");
        }


    }
    public Zookeeper(){
        profession = "Смотритель";
    }
}
