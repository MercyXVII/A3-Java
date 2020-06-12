package Opdracht2;

public class opdracht2 {
    public static void main(String[] args) {
        auto auto = new auto();

        auto.setMerk("Lamborghini");
        auto.setType("Centanario");
        auto.setKleur("Zwart/Geel");
        auto.setGewicht(1520);
        auto.setBrandstof("Benzine");
        auto.bepaalBelasting(auto.getBrandstof(), auto.getGewicht());

        System.out.println("Merk en type: " + auto.getMerk() + " " + auto.getType());
        System.out.println("Kleur: " + auto.getKleur());
        System.out.println("Gewicht: " + auto.getGewicht());
        System.out.println("Wegenbelasting: " + auto.getBelasting());
        System.out.println("Aantal wielen: " + auto.getAantalWielen());
    }
}