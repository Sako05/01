/**
 * Date: 2020-09-30
 * Time: 10:16
 * Project: PACKAGE_NAME
 * Copyright: MIT
 */
import javax.swing.*;

public class Orm extends Djur implements Meddelande {

    protected Orm(String namn, int vikt) {
        super(namn, vikt);
    }

    @Override // Polymorphism
    public void printMe() {
        int matVikt = Djurfoder.ORM.getfoderGram(); // ormFoder.foderGram är Enum
        JOptionPane.showMessageDialog(null, namn + " ska få " + matVikt + " gram " + Djurfoder.ORM.getfoderTyp() + ". "); // ormFoder.foderTyp är Enum


    }
}
