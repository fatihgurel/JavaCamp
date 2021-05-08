package exerciseAbstractClasses;

public class Main {

    public static void main(String[] args) {
//        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
//        womanGameCalculator.hesapla();
//        womanGameCalculator.gameOver();

        GameCalculator gameCalculator = new ManGameCalculator();
        GameCalculator gameCalculator1 = new WomanGameCalculator();
        GameCalculator gameCalculator2 = new KidsGameCalculator();
        GameCalculator gameCalculator3 = new OlderGameCalculator();

        System.out.println("Man");
        gameCalculator.hesapla();
        gameCalculator.gameOver();
        System.out.println("-----------------------");
        System.out.println("Woman");
        gameCalculator1.hesapla();
        gameCalculator1.gameOver();
        System.out.println("-----------------------");
        System.out.println("Kids");
        gameCalculator2.hesapla();
        gameCalculator2.gameOver();
        System.out.println("-----------------------");
        System.out.println("Old");
        gameCalculator3.hesapla();
        gameCalculator3.gameOver();

    }

}
