package Array.Easy;
import java.util.*;
public class Secondlargestwithoutsorting {
    public static int print2largest(int arr[], int n) {
        //better
        int largest=arr[0], largest2=-1;
        for(int i=1;i<n;i++){
            if(arr[i]>largest){largest2=largest;largest=arr[i];}
            else if(arr[i]<largest){
                if(largest2<arr[i]){
                    largest2=arr[i];
                }
            }
        }
        return largest2;
        
        //brute force
        // int largest=-1;
        // for(int i=0;i<n;i++){
        //     if(largest<arr[i]) largest=arr[i];
        // }
        // int largest2=-1;
        // for(int i=0;i<n;i++){
        //     if(arr[i]!=largest) {if(largest2<arr[i]) largest2=arr[i];}
        // }
        // return largest2;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int a=print2largest(arr,n);
        System.out.println(a);
        sc.close();
    }
}
