public class Main {


    public static void main(String[] args) {
//        Cat cat = new Cat("Барсик", 10, false);
//        Cat miniCat = new Cat("Myp", 20, false);
//        Cat bigCat = new Cat("Пушок", 50, false);


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


//        plate.info();
//        System.out.println("");
//
//        cat.eat(plate);
//        if (plate.getFood() - cat.getAppetite() >= 0) {
//            cat.fullCat();
//        }
//        plate.info();
//        System.out.println("");
//
//        miniCat.eat(plate);
//        if (plate.getFood() - miniCat.getAppetite() >= 0) {
//            miniCat.fullCat();
//        }
//        plate.info();
//        System.out.println("");
//
//        bigCat.eat(plate);
//        if (plate.getFood() - bigCat.getAppetite() >= 0) {
//            bigCat.fullCat();
//        }
//        plate.info();
//
//        plate.setFood(plate.getFood() - cat.getAppetite());


    }
}
