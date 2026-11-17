public class Client {

    public static void main(String[] args) {
        AbstractFactory factory1 = new FactoryConcrete1();
        ProduitA produitA1 = factory1.createProduitA();
        ProduitB produitB1 = factory1.createProduitB();
        produitA1.methodeProduitA();
        produitB1.methodeProduitB();

        AbstractFactory factory2 = new FactoryConcrete2();
        ProduitA produitA2 = factory2.createProduitA();
        ProduitB produitB2 = factory2.createProduitB();
        produitA2.methodeProduitA();
        produitB2.methodeProduitB();
    }
}