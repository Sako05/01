/**
 * Date: 2020-09-30
 * Time: 10:15
 * Project: PACKAGE_NAME
 * Copyright: MIT
 */
import javax.swing.*;

public class Hund extends Djur {



    protected Hund(String namn, int vikt) {
        super(namn, vikt);
    }

    @Override // Polymorphism
    public void printMe() {
        int matVikt = vikt / Djurfoder.HUND.getfoderGram();                                                               // hundFoder.foderGram är Enum
        JOptionPane.showMessageDialog(null, namn + " ska få " + matVikt + " gram " + Djurfoder.HUND.getfoderTyp() + ".");
    }


}