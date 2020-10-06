/**
 * Date: 2020-09-30
 * Time: 17:20
 * Project: PACKAGE_NAME
 * Copyright: MIT
 */

abstract class Djur implements Meddelande {
    protected String namn;
    protected int vikt;

    protected Djur(String namn, int vikt) {
        this.namn = namn;
        this.vikt = vikt;
    }

    public void printMe(){}
}