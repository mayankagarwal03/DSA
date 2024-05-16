package Sorting;
import java.util.*;
public class QuickSort {
    public static void quickSort(int a[],int low, int high){
        if(low<high){
            int pindex=partition(a,low,high);
            quickSort(a, low,pindex-1);
            quickSort(a,pindex+1, high);
        }
    }
    public static int partition(int a[], int low,int high){
        int pivot=a[low];
        int i=low+1;
        int j=high;
        while(i<=j){
            while(a[i]<=pivot && i<=high-1){
                i++;
            }
            while(a[j]>pivot && j>=low-1){
                j--;
            }
            if(i<j){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        int temp=a[low];
        a[low]=a[j];
        a[j]=temp;
        return j;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        quickSort(a,0,n-1);
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        sc.close();
    }
}
