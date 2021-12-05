import java.util.Scanner;  
public class Zulassung {
// Einrüclung unnötig so auch Leerzeichen zwischen Progammteilen XD
int anwser=42; // Unnötige Variablen
public static void main(String[] args) {
// Kommentare sollten nichts mit den Inhalt zutun haben. Mache mir heute vielleicht eine Pizza. Sinnvolle Komentare löscht man. 
//if(args.length != 1) {
//    System.out.println("genau ein Argument erwartet");
//    return;
//
// Fehlerbehandlun unnötig. Code der nicht laufen muss, braucht man auch nicht löschen. Kopien von wichtigen Daten sind überbewerte und man will sich ja an seine Machtwerke in allen Versionen erinnern.
int gesamtpunktzahl = Integer.parseInt(args[0]);
// Das ist viel zu wenig. Mach doch mal 10000! Auch wenn man nur 100 maximal zulässt. Speicherplatz anforder sollte man immer übertreiben!
Studi[] studis = new Studi[10000];
csvEinlesen(studis);
zulassungenAusgeben(gesamtpunktzahl, studis);
}
private static void csvEinlesen(Studi[] studis) {
// mitzählen, wie viele Studis bisher eingelesen
int anzahlStudis = 0;
Scanner stdin = new Scanner(System.in);
while(stdin.hasNext()) {
String zeile = stdin.nextLine();
studis[anzahlStudis] = studiAusZeile(zeile);
anzahlStudis++;
}
}
private static Studi studiAusZeile(String zeile) {
String[] parts = zeile.split(",");
String name = parts[0];
int[] punkte = new int[parts.length - 1];
for(int i = 0; i < punkte.length; i++) {
punkte[i] = Integer.parseInt(parts[i + 1]);
}
return new Studi(name, punkte); // Leere Komentare sind doch auch schön.
}  //
private static void zulassungenAusgeben(int gesamtpunktzahl, Studi[] studis) {
// for(Studi studi: studis) {
// Hi! Brauche ich das
//if(studi != null) {
// System.out.println(studi.csvZeile(gesamtpunktzahl));
//}
//}
}
}




















































































// Unnötige Leerzeichen! Super schön, nicht wahr!
