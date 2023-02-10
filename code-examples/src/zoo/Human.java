package zoo;
//обедает
//следит за белками
//должен наложить повязку, если покусает животное


public abstract class Human {
    boolean hungry;
    boolean hurt;

    String profession;

    abstract void lunch();

    void watch(Squirrels squirrel) {
        if (squirrel.cage == "Вне вальера") {
            System.out.println("Белка поймана");
            squirrel.cage = "Белка в вальере";
        } else {
            System.out.println("Белка на месте");
        }
    }

        abstract void makeBandage();


}