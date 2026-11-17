public class FactoryEssence extends AbstractFactory {
    @Override
    public Automobile construireAutomobile() {
        return new AutomobileEssence();
    }

    @Override
    public Scooter construireScooter() {
        return new ScooterEssence();
    }
}