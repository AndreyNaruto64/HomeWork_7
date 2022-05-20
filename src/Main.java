public class Main {


    public static void main(String[] args) {

        Cat[] manyCats = new Cat[3];

        manyCats[0] = new Cat("Мур", 20, false);
        manyCats[1] = new Cat("Пушок", 20, false);
        manyCats[2] = new Cat("Барбар", 60, false);
        Plate plate = new Plate(100);

        for (Cat manyCat : manyCats) {
            plate.info();
            if (!plate.checkFood(manyCat.getAppetite())){
                plate.plusFood();
            }
            manyCat.eat(plate);
            if (plate.getFood() - manyCat.getAppetite() >= 0) {
                manyCat.fullCat();
            }
            plate.setFood(plate.getFood() - manyCat.getAppetite());
        }
        plate.info();

    }
}
