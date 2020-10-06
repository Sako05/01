/**
 * Date: 2020-09-30
 * Time: 10:15
 * Project: PACKAGE_NAME
 * Copyright: MIT
 */
import javax.swing.*;

public class HealthyPets {

    public static void main(String[] args)  {
        //Initiering via konstruktor
        Hund hund1 = new Hund("Sixten", 5000);
        Hund hund2 = new Hund("Dogge", 10000);
        Katt katt1= new Katt("Venus", 5000);
        Katt katt2 = new Katt("Ove", 3000);
        Orm orm1 = new Orm("Hypno", 1000);

        while (true) {
            try {
                String input = JOptionPane.showInputDialog(null, "Vilket djur ska få mat?");

                //Polymorfism nedan, samma metodsanrop förekommer i olika klasser
                if (input.equalsIgnoreCase("sixten"))
                    hund1.printMe();
                else if (input.equalsIgnoreCase("dogge"))
                    hund2.printMe();
                else if (input.equalsIgnoreCase("venus"))
                    katt1.printMe();
                else if (input.equalsIgnoreCase("ove"))
                    katt2.printMe();
                else if (input.equalsIgnoreCase("hypno"))
                    orm1.printMe();
                else
                    JOptionPane.showMessageDialog(null, "Djuret finns inte!");
            } catch (Exception e) {
                throw new IllegalArgumentException("Avbröts!");
            }
        }
    }
}