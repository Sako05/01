/**
 * Date: 2020-09-30
 * Time: 17:18
 * Project: PACKAGE_NAME
 * Copyright: MIT
 */

public enum Djurfoder {
    HUND("hundfoder", 100), KATT("kattfoder", 150), ORM("ormpellets", 20);

    protected final String foderTyp;
    protected final int foderGram;

    Djurfoder (String foderTyp, int gram) {
        this.foderTyp = foderTyp;
        this.foderGram = gram;
    }

    String getfoderTyp(){
        return foderTyp;
    }

    int getfoderGram(){
        return foderGram;
    }

}
