public class Wrestler extends  BaseFighter {
    public Wrestler(int punch, int wrestling, int weight, String name, int energy) {
        super(punch, wrestling, weight, name, energy);

    }

    @Override
    public void CrownBlow(){
        System.out.println( " Бросок через плечо");
    }
}
