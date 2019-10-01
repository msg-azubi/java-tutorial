package unit_02.excercise_a.code;

public class BlumenTest {
    public static void main(String args[]) {
// Die vergrössernde Konvertierung wird implizit durchgeführt
        Blume[] blumen = new Blume[]{new Rose(), new Tulpe(),
                new Nelke()};
        for(int i = 0; i<3; i++) {
// Die @Override-Methode der Unterklasse wird aufgerufen
            (blumen[i]).identifizieren();
// Die Methode der Oberklasse wird aufgerufen
            (blumen[i]).farbe();
// Eine verkleinernde Konvertierung muss explizit durchgeführt
// werden
            switch (blumen[i].blume) {
                case Blume.ROSE:
                    ((Rose)blumen[i]).wurzeln();
                    break;
                case Blume.TULPE:
                    ((Tulpe)blumen[i]).zwiebeln();
                    break;
                case Blume.NELKE:
                    ((Nelke)blumen[i]).stauden();
            }
        }
    }
}
