package Solving;
import java.util.Scanner;
public class Problems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                int n=sc.nextInt();
                int arr[] = new int[n];
                for (int i=0; i< arr.length; i++)
                    arr[i]=sc.nextInt();
        int k=sc.nextInt();
        int x[]= new int [k];
        for (int i=0; i<k; i++){
            x[i]=arr[i];
        }

        for (int i=0; i<n-k; i++){
            arr[i]=arr[i+k];
        }

        for (int i=0; i < k; i++){
            arr[n-k+i]=x[i];
        }


        for (int i=0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}