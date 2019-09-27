package unit_02.excercise_a.code;

public class Nelke extends Blume {
    // Konstruktordefinition
    Nelke() {
        super(2, BLAU);
    }

    // Die Methode der Oberklasse wird überschrieben und aufgerufen
    public void identifizieren() {
        super.identifizieren();
        System.out.print("Nelke");
    }

    public void stauden() {
        System.out.println(" und ist eine Staude");
    }
}