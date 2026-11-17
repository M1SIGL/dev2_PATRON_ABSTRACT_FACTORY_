public class Client {

    public static void main(String[] args) {
        AbstractFactory factoryEssence = new FactoryEssence();
        Automobile automobileEssence = factoryEssence.construireAutomobile();
        Scooter scooterEssence = factoryEssence.construireScooter();
        automobileEssence.methodeAutomobile();
        scooterEssence.methodeScooter();

        AbstractFactory factoryElectrique = new FactoryElectrique();
        Automobile automobileElectrique = factoryElectrique.construireAutomobile();
        Scooter scooterElectrique = factoryElectrique.construireScooter();
        automobileElectrique.methodeAutomobile();
        scooterElectrique.methodeScooter();
    }
}
