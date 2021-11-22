package fr.boucles;

public class ExerciceBoucleEtTests {
    public static void main(String[] args){
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        System.out.println("voici les éléments du tableau");
        for(var i=0;i< array.length;i++){

            System.out.println(array[i]);
        }
        System.out.println("ordre inverse");
        for(var i=0;i< array.length;i++){

            System.out.println(array[array.length-i-1]);
        }
        System.out.println("que les éléments supérieur à 3");
        for(var i=0;i< array.length;i++){
            if(array[i]>3){
                System.out.println(array[i]);
            }
        }
        System.out.println("les entiers pairs");
        for(var i=0;i< array.length;i++){
            if(array[i]%2==0){
                System.out.println(array[i]);
            }
        }


    }

}
