public class Main {
    public static void main(String[] args) {
        gestionDeStock stock = new gestionDeStock();

        Materiel materialProduct = new Materiel("Material Product", 10, 49);
        Logiciel softwareProduct = new Logiciel("Software Product", 5, 199, "Publisher", 2023);

        stock.ajouter(materialProduct);
        stock.ajouter(materialProduct); // Adding a material product again
        stock.ajouter(softwareProduct);

        stock.lister();

    }
}