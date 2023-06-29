public class Boxer extends BaseFighter{
    public Boxer(int punch, int wrestling, int weight, String name, int energy) {
        super(punch, wrestling, weight, name, energy);
    }

    @Override
    public void CrownBlow(){
        System.out.println( " Коронный удар Хук справа");
    }
}
