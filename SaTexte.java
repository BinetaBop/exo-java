public class Main {
public static void main(String[] args){
String s = " Senegal, +Dakar est la capitale ";

int Avant_Nettoye = s.length();

String sNettoye = s.strip();

int Apres_Nettoye = sNettoye.length();

System.out.println("Avant nettoyage : " + Avant_Nettoye);
System.out.println("Après nettoyage : " + Apres_Nettoye);

int posVirgule = sNettoye.indexOf(",");
System.out.println("Position de la virgule : " + posVirgule);


String region = sNettoye.substring(sNettoye.indexOf("Dakar"), sNettoye.indexOf("Dakar")+5);
String sMaj = sNettoye.toUpperCase();
System.out.println("Majuscule : " + sMaj);
System.out.println("Région : " + region);

String Nouvelle = sNettoye.replaceAll("(-| |,|;)", ",");
System.out.println("Nouvelle chaîne : " + Nouvelle);
int nmbreMots = Nouvelle.split(",").length;

System.out.println("Nombre de mots : " + nmbreMots);

}
}
