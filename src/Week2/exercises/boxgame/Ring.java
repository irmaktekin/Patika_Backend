package Week2.exercises.boxgame;

public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run(Fighter fighter1, Fighter fighter2) {

        if (checkWeight()) {
            while (fighter2.health > 0 && fighter1.health > 0) {
                System.out.println("======== YENİ ROUND ===========");
                fighter2.health = fighter1.hit(fighter2);
                if (isWin()){
                    break;
                }
                fighter1.health = fighter2.hit(fighter1);
                if (isWin()){
                    break;
                }
                printScore();
            }

        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }


    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        } else if (f2.health == 0){
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        }

        return false;
    }


    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
    }
    public void findFighter(){
        //It produces number in the 0,1 range.
        double randomNumber= Math.random();
        //If the number<0.5->f1 is the first
        if(randomNumber<0.5){
            System.out.println(f1.name);
            run(f1,f2);
        }
        //If the number<0.5->f2 is the first
        else{
            System.out.println(f2.name);
            run(f2,f1);
        }

    }
}