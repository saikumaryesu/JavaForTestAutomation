package arrays;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String [] args){

        int[] arr ={1, 2, 3, 2, 4, 5, 1};

        Set<Integer> set = new LinkedHashSet<>();

        for(int i=0;i<arr.length;i++){


            if(!set.add(arr[i])){


              System.out.print(arr[i]+" ");

            }


        }




    }
}
