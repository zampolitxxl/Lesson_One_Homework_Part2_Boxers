public class Main {
    public static void main(String[] args) {


        BaseFighter testFighter = new BaseFighter(42, 45, 85, "test", 80);
        System.out.println(testFighter);
        testFighter.CrownBlow();

        Boxer tyson = new Boxer(99,30,90,"Mike Tyson", 80);
        tyson.CrownBlow();

        Wrestler habib = new Wrestler(20, 95, 70, "Habib Nurmagamedov", 80);
        habib.CrownBlow();

        BaseFighter testFighter2 = new BaseFighter(55, 78, 90, "test2", 60);
        System.out.println(testFighter2);

        System.out.println( "Майк Тайсон до тренеровки" + tyson);
        tyson.train(100);
        System.out.println( "Майк Тайсон после тренеровки" + tyson);

        //Проблемный код ниже. Метод fightnibg
        testFighter.fighting(testFighter, testFighter2);

        int fightpow1=testFighter.fighterPower(testFighter) ;
        System.out.println("fight pow 1  = " + fightpow1);

        int fightpow2=testFighter2.fighterPower(testFighter2) ;
        System.out.println("fight pow 2  = " + fightpow2);



        //int power= testFighter.fighterPower(testFighter);

        //System.out.println(power);


        //testFighter.train(100);

        //System.out.println(testFighter);






    }

}