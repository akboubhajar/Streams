package net.hajar;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> mots = Arrays.asList("chat", "chien", "lapin", "oiseau", "éléphant");

        // 1. Filtrer les mots qui contiennent la lettre "a".
        List<String> motsAvecA = mots.stream()
                .filter(mot -> mot.contains("a"))
                .collect(Collectors.toList());
        System.out.println("Mots contenant la lettre 'a': " + motsAvecA);

        // 2. Filtrer les mots qui ont une longueur supérieure à 3 et transformer chaque mot en son inverse.
        List<String> motsInverseLongueurSuperieure3 = mots.stream()
                .filter(mot -> mot.length() > 3)
                .map(mot -> new StringBuilder(mot).reverse().toString())
                .collect(Collectors.toList());
        System.out.println("Mots inversés avec une longueur supérieure à 3: " + motsInverseLongueurSuperieure3);

        // 3. Filtrer les chaînes qui contiennent la lettre "e" et aplatir chaque chaîne en une liste de ses caractères.
        List<Character> caracteresAvecE = mots.stream()
                .filter(mot -> mot.contains("e"))
                .flatMap(mot -> mot.chars().mapToObj(c -> (char) c))
                .collect(Collectors.toList());
        System.out.println("Caractères des mots contenant la lettre 'e': " + caracteresAvecE);

        // 4. Transformer chaque chaîne en sa version en majuscules.
        List<String> motsEnMajuscules = mots.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Mots en majuscules: " + motsEnMajuscules);

        // 5. Convertir chaque chaîne en sa longueur.
        List<Integer> longueursMots = mots.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println("Longueurs des mots: " + longueursMots);

        // 6. Transformer chaque chaîne en une liste de ses caractères, puis aplatir toutes les listes en une seule liste de caractères.
        List<Character> tousCaracteres = mots.stream()
                .flatMap(mot -> mot.chars().mapToObj(c -> (char) c))
                .collect(Collectors.toList());
        System.out.println("Tous les caractères des mots: " + tousCaracteres);

        // 7. À partir d'une liste de mots, transformer chaque nom en une chaîne de la forme "Nom - Index" où l'index représente la position du nom dans la liste.
        List<String> nomsAvecIndex = mots.stream()
                .map(mot -> mot + " - " + mots.indexOf(mot))
                .collect(Collectors.toList());
        System.out.println("Noms avec index: " + nomsAvecIndex);
    }
}
