public class Main {
    public static void main(String[] args) {


        BaseFighter testFighter = new BaseFighter(42, 45, 85, "test", 80);
        System.out.println(testFighter);
        

        BaseFighter testFighter2 = new BaseFighter(55, 78, 90, "test2", 60);
        System.out.println(testFighter2);

        int fightpow1=testFighter.fighterPower(testFighter) ;
        System.out.println("fight pow 1  = " + fightpow1);

        int fightpow2=testFighter2.fighterPower(testFighter2) ;
        System.out.println("fight pow 2  = " + fightpow2);




        int power= testFighter.fighterPower(testFighter);

        System.out.println(power);


        testFighter.train(100);

        System.out.println(testFighter);






    }

}