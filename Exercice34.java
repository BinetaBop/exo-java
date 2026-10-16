public class Exercice34 {

public static boolean estEmailValide(String email) {

String modele =
"^[A-Za-z0-9._-]+@([A-Za-z0-9-]+\\.)+[A-Za-z]{2,6}$";

return email.matches(modele);
}

public static void main(String[] args) {

System.out.println(
estEmailValide("awa.diop@isep.edu.sn")
);

System.out.println(
estEmailValide("moussa@gmail")
);

System.out.println(
estEmailValide("@wave.com")
);
}
}

