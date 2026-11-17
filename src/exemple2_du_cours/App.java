public class App {
    
    // Constructeur de la classe
    public App(){}
    
    public static void main()
    {
        // creer une instance de la fabrique de la famille electrique
        AbstractFactory factoryElectrique = new FactoryElectrique();
        Automobile autoElectrique = factoryElectrique.construireAutomobile();
        Scooter scooterElectrique = factoryElectrique.construireScooter();
        autoElectrique.methodeAutomobile();
        scooterElectrique.methodeScooter();

        // creer une instance de la familles essence
        AbstractFactory factoryEssence = new FactoryEssence();
        Automobile autoEss = factoryEssence.construireAutomobile();
        Scooter scooterEss = factoryEssence.construireScooter();
        autoEss.methodeAutomobile();
        scooterEss.methodeScooter();

    }
}