public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        if (food >= n) {
            food -= n;

        } else {
            System.out.println("Этому коту не хватило еды, он остался голодный, " + "еще ему надо " + (-(food - n)));
        }
    }


    public void info() {
        System.out.println("Тарелка: " + food);
    }


    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        if (food > 0) {
            this.food = food;
        }
    }

    public void plusFood(){
        this.food += 100;
        System.out.println("Досыпали еще корма"+" "+100+" гр.");
    }

    boolean checkFood(int n){
        return (food-n) >=0;
    }

}
