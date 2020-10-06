/**
 * Date: 2020-09-30
 * Time: 10:15
 * Project: PACKAGE_NAME
 * Copyright: MIT
 */
import javax.swing.*;

public class Katt extends Djur implements Meddelande {

    protected Katt(String namn, int vikt) {
        super(namn, vikt);
    }

    @Override // Polymorphism
    public void printMe() {
        int matVikt = vikt / Djurfoder.KATT.getfoderGram();      // kattFoder.foderGram är Enum
        JOptionPane.showMessageDialog(null, namn + " ska få " + matVikt + " gram " + Djurfoder.KATT.getfoderTyp() + ". "); // kattFoder.foderTyp är Enum

    }
}
