package unit_02.excercise_a.code;

public class Rose extends Blume {
    // Konstruktordefinition
    Rose() {
        super(0, ROT);
    }
    // Die Methode der Oberklasse wird überschrieben und aufgerufen
    public void identifizieren() {
        super.identifizieren();
        System.out.print("Rose");
    }
    public void wurzeln() {
        System.out.println(" und hat Wurzeln");
    }
}
