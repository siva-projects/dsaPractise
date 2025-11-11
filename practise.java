package siva;

import java.util.Arrays;

public class practise {
    public static void main(String[] args) {
    //   bubbleSortPractise();
    //   cyclicSort();
    // insertionSort();
    }
    public static void insertionSort(){
        int[] arr =  {5, 4, 3, 2, 1};
        for(int i=0;i<arr.length-1;i++){
            System.out.println("========================");
            for( int j=i+1;j>0;j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
            System.out.println("partially sorted array "+Arrays.toString(arr));
            System.out.println("======================");
        }
        System.out.println(" insertion sorted array is "+Arrays.toString(arr));
    }
    public static void cyclicSort(){
        int[] arr = {5,4,3,2,1}; // since the lenght is 5 and limit is from 1 to 5, cyclic sort is applicable here...
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] != i+1){
                int temp = arr[i];
                arr[i] = arr[temp-1];
                arr[temp-1]=temp;
            }
        }
        System.out.println("array after cyclic sort: "+Arrays.toString(arr));
    }
    public static void bubbleSortPractise(){
        System.out.println("BubbleSort is initiated...");
        int[] arr = {4, 3, 2, 5, 1};
        
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if( arr[i] > arr[j] ){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println("after sorting arr is "+Arrays.toString(arr));
    }
}
