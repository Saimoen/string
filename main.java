import java.util.Scanner;

public class main {
    public static void main(final String[] args)
    {
        try (Scanner scanner = new Scanner(System.in)) {
            // Longueur
            System.out.println("-------------------- Longueur ----------------------");
            System.out.println("Veuillez saisir un mot :");
            String str = scanner.nextLine();
            System.out.println("Il y a "+ algo.Longueur(str)+" lettre(s) dans votre mot.");

            // Comparer
            System.out.println("-------------------- Comparaison ----------------------");
            System.out.println("Veuillez saisir le premier mot :");
            String first = scanner.nextLine();
            System.out.println("Veuillez saisir le deuxième mot :");
            String second = scanner.nextLine();
            System.out.println(algo.Comparer(first, second));


            // Concatener
            System.out.println("-------------------- Concaténer ----------------------");
            System.out.println("Veuillez saisir le premier mot :");
            String premierMot = scanner.nextLine();
            System.out.println("Veuillez saisir le deuxième mot :");
            String deuxiemeMot = scanner.nextLine();
            System.out.println("Voici la concaténation des mots : "+ algo.Concatener(premierMot, deuxiemeMot));


            // Extraire
            System.out.println("-------------------- Extraction ----------------------");
            System.out.println("Veuillez saisir la phrase :");
            String sentence = scanner.nextLine();
            System.out.println("Veuillez saisir la position de début de l'extrait :");
            int debut = scanner.nextInt();
            System.out.println("Veuillez saisir la position de fin de l'extrait :");
            int fin = scanner.nextInt();

            System.out.println("Voici la phrase extraite : "+ algo.Extraire(sentence, debut, fin));

        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
