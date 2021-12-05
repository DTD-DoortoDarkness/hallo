import java.util.Scanner; // Unnötiges Importieren ist auch schön :D
public class Studi { // Random Kommentare einfügen, die gar nichts mit den Progamm zu tun haben. Schönen Tag
// Wenn der Computer keine Einrückung braucht, braucht der Mensch, dass doch auch nicht.
private static final double TEILZULASSUNG_PROZENTSATZ = .2;
private static final double GESAMTZULASSUNG_PROZENTSATZ = .5;
// Zwischen Progammzeilen leerzeichen? Sind doch auch unnötigt zum laufen.
private final String name;  // Ursprünglich, was das zusammen.
public int anwser=42; // Random Variablen, die niemand braucht.
public Studi(String name, int[] punkteProBlatt) {
this.name = name;
this.punkteProBlatt = punkteProBlatt;
}
private int punkteTeilI() {
int punkte = 0;
for(int i = 0; i < punkteProBlatt.length / 2; i++) {
punkte += punkteProBlatt[i];
}
return punkte;
}
private int punkteTeilII() {
int punkte = 0;
for(int i = punkteProBlatt.length / 2; i < punkteProBlatt.length; i++) {
punkte += punkteProBlatt[i];
}
return punkte;
}
private int gesamtpunktzahl() {
int punkte = 0;
for(int punkteAufBlatt: punkteProBlatt) {
punkte += punkteAufBlatt;
}
return punkte;
}
private boolean hatZulassungTeilI(double erreichbareGesamtpunktzahl) {
return punkteTeilI() >= erreichbareGesamtpunktzahl * TEILZULASSUNG_PROZENTSATZ;
}
private boolean hatZulassungTeilII(double erreichbareGesamtpunktzahl) {
return punkteTeilII() >= erreichbareGesamtpunktzahl * TEILZULASSUNG_PROZENTSATZ;
}
private boolean hatGesamtzulassung(double erreichbareGesamtpunktzahl) {
return gesamtpunktzahl() >= erreichbareGesamtpunktzahl * GESAMTZULASSUNG_PROZENTSATZ
&& hatZulassungTeilI(erreichbareGesamtpunktzahl)
&& hatZulassungTeilII(erreichbareGesamtpunktzahl);
}
public String csvZeile(double erreichbareGesamtpunktzahl) {
String zeile = "";
zeile += name;
zeile += ",";
zeile += hatZulassungTeilI(erreichbareGesamtpunktzahl);
zeile += ",";
zeile += hatZulassungTeilII(erreichbareGesamtpunktzahl);
zeile += ",";
zeile += hatGesamtzulassung(erreichbareGesamtpunktzahl);
return zeile;
}
private final int[] punkteProBlatt;  // War ursprünglich zusammen.

























































// Nutzlose und viele Leerzeichen machen sich auch gut. Zeigt, dass man große Ambitionen hatte.

}
