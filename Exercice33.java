import java.util.Scanner;

public class Exercice33 {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Entrez une ligne de texte : ");
String texte = sc.nextLine();

int voyelles = 0;
int consonnes = 0;
int chiffres = 0;
int espaces = 0;
int autres = 0;

String listeVoyelles = "aeiouyéèêàù";

for (int i = 0; i < texte.length(); i++) {

char c = Character.toLowerCase(texte.charAt(i));

if (listeVoyelles.indexOf(c) != -1) {
voyelles++;

} else if (Character.isLetter(c)) {
consonnes++;

} else if (Character.isDigit(c)) {
chiffres++;

} else if (Character.isWhitespace(c)) {
espaces++;

} else {
autres++;
}
}

System.out.println("Voyelles : " + voyelles);
System.out.println("Consonnes : " + consonnes);
System.out.println("Chiffres : " + chiffres);
System.out.println("Espaces : " + espaces);
System.out.println("Autres caracteres : " + autres);

sc.close();
}
}

