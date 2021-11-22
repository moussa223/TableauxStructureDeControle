package fr.boucles;

public class ExerciceTableauEntier {
    public static void main(String[] args){

        int[] monTableau = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Le premier élément du tableau est: "+monTableau[0]);
        System.out.println("la longueur du tableau est: "+monTableau.length);
        System.out.println("le dernier élément du tableau est: "+monTableau[monTableau.length - 1]);
        monTableau[4]=8;
        System.out.println("la valeur de l'élément ayant l'index 4 est: "+ monTableau[4]);
    }

}
