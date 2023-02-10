package zoo;
//может быть голодным и покусанным
//обходит каждое животное
// помещает в карантин
// возвращает животное в обычный вальер
public class Veterinarian extends Human {
    @Override
    void lunch(){
    if (hungry) {
        System.out.println("ветеринар пообедал");
        hungry = false;
    } else  {
        System.out.println("ветеринар еще не голоден");
    }
}



    @Override
    void makeBandage() {
        if (hurt) {
            System.out.println("ветеринар наложил себе повязку");
            hungry = false;
        } else  {
            System.out.println("ветеринар покусан");
        }


    }
    public Veterinarian () {
        this.profession = "Ветеринар";
    }
}
