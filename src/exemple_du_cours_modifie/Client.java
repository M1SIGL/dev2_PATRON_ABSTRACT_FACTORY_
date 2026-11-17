public class Client {

    public static void main(String[] args) {
        AbstractFactory factory1 = new Factory1();
        ProduitA produitA1 = factory1.createProduitA();
        ProduitB produitB1 = factory1.createProduitB();
        ProduitC produitC1 = factory1.createProduitC();
        produitA1.methodeProduitA();
        produitB1.methodeProduitB();
        produitC1.methodeProduitC();

        AbstractFactory factory2 = new Factory2();
        ProduitA produitA2 = factory2.createProduitA();
        ProduitB produitB2 = factory2.createProduitB();
        ProduitC produitC2 = factory2.createProduitC();
        produitA2.methodeProduitA();
        produitB2.methodeProduitB();
        produitC2.methodeProduitC();

        AbstractFactory factory3 = new Factory3();
        ProduitA produitA3 = factory3.createProduitA();
        ProduitB produitB3 = factory3.createProduitB();
        ProduitC produitC3 = factory3.createProduitC();
        produitA3.methodeProduitA();
        produitB3.methodeProduitB();
        produitC3.methodeProduitC();
    }
}