public class Rute {
    /*
     * Klassen Rute skal ta vare på sine koordinater (radnummer og kolonnenummer)
     * og ha en referanse til labyrinten den er en del av.
     * I tillegg skal klassen ha
     * referanser til sine eventuelle
     * nabo-ruter (nord/syd/vest/oest). Det skal ikke være mulig å opprette et
     * objekt av klassen
     * Rute, kun av subklassene
     */

    int rad;
    int kolonne;

    Labyrint refLab; // TODO: dette er referanse labyrinten den er del av.

    Rute nord = null; // TODO
    Rute syd = null; // TODO
    Rute vest = null; // TODO
    Rute oest = null; // TODO
}
