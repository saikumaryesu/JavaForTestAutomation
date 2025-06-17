package arrays;

public class MaxMin {


    public static void main(String [] args){

        int [] arr =   {1, 5, 3, 9, 2};

        int max = arr[0];

        int min = arr[0];

        for(int i=0;i<arr.length;i++){


            if(arr[i]>max){


                max=arr[i];
            }
            else if(arr[i]<min){


                min=arr[i];
            }


        }

        System.out.println(max +"    "+min);





    }




}
