package arrays;

public class MissingNum {

    public static void main(String [] args){

     int [] arr = {1,2,4,5};

     int n=5;

    int  ExpecetdSum =  n*(n+1)/2;

    int acuatasum=0;


    for(int i=0;i<arr.length;i++){

        acuatasum=acuatasum+arr[i];

    }


    int missingNum = ExpecetdSum-acuatasum;


   System.out.println("Missing number is :"+missingNum);

    }




}
