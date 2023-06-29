public class BaseFighter {


    protected int punch; //ударный уровень

    protected int wrestling; //ударный уровень

    protected int weight; //вес

    protected String name; //Имя

    protected int energy; //энергия

    protected int maxEnergy; //максимальная энергия


    public BaseFighter(int punch, int wrestling, int weight, String name, int energy) {
        this.punch = punch;
        this.wrestling = wrestling;
        this.weight = weight;
        this.name = name;
        this.energy = energy;
        this.maxEnergy = energy;

    }

    public void train(int trainTimeMinutes) {
        if (trainTimeMinutes > 150) {
            System.out.println("слишком длинная тренеровка, уровень энергии не увеличен");

        } else {
            maxEnergy = (maxEnergy + (trainTimeMinutes / 2));
            energy = energy - trainTimeMinutes / 5;

            if (maxEnergy > 100) {
                maxEnergy = 100;
            }
            if (energy < 0) {
                energy = 0;
            }
        }
    }


    //метод определения победителя в бою

    public void fighting(BaseFighter first, BaseFighter second) {
        int firstFighterPower = fighterPower(first);
        System.out.println(firstFighterPower);

        int secondFighterPower = fighterPower(second);
        System.out.println(secondFighterPower);

        if (firstFighterPower > secondFighterPower) {
            System.out.println("Победил первый боец ");

        } else {
            System.out.println("Победил второй боец ");
        }

    }

    //метод определения общей силы бойца в бою

    public int fighterPower(BaseFighter one) {
        //int totalPower=0;
        int punch = this.punch;
        int weight = this.weight;
        int wrestling = this.wrestling;
        int energy = this.energy;
        int totalPower = punch * 6 + weight * 8 + wrestling * 8 + energy * 7;

        return totalPower;
    }

    //Геттеры
    public int getPunch() {
        return punch;
    }

    public int getWrestling() {
        return wrestling;
    }

    public int getWeight() {
        return weight;
    }

    public int getEnergy() {
        return energy;
    }


    @Override
    public String toString() {
        return name + " Punch [" + punch + "]" + " Wrestling   [" + wrestling + "]" + " Energy  [" + energy + "]" + " MaxEnergy  [" + maxEnergy + "]";
    }


}
