package Opdracht1;

public class opdracht1 {
    public static void main(String[] args) {
        persoon persoon1 = new persoon();

        //Setters
        persoon1.setVoornaam("Martijn");
        persoon1.setAchternaam("Akkerman");
        persoon1.setGeboortedatum("2002-02-08");

        //Print of Getters
        System.out.println(persoon1.getVoornaam());
        System.out.println(persoon1.getAchternaam());
        System.out.println(persoon1.DaysAge(persoon1.getGeboortedatum()));
    }
}