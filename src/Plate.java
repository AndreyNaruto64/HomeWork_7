public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        if (food >= n) {
            food -= n;

        } else {
            System.out.println("����� ���� �� ������� ���, �� ������� ��������, " + "��� ��� ���� " + (-(food - n)));
        }
    }


    public void info() {
        System.out.println("�������: " + food);
    }


    public int getFood() {
        // if (food > 0) {
        return food;
        //  }
        // return 0;
    }

    public void setFood(int food) {
        if (food > 0) {
            this.food = food;
        }
    }

    public void plusFood(){
        this.food += 100;
        System.out.println("�������� ��� �����"+" "+100+" ��.");
    }

    boolean checkFood(int n){
        return (food-n) >=0;
    }

}
