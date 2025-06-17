package arrays;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueElemets {

    public static void main(String [] args){

     int [] arr =  {1, 2, 2, 3, 4, 4};

     Set<Integer> set = new LinkedHashSet<>();

     for(int i=0;i<arr.length;i++){

         if(set.add(arr[i])){


             System.out.print(arr[i]+" ");


         }



     }


    }



}
