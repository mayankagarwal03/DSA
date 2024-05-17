package Sorting;
import java.util.*;
public class MergeSort {
    public static void mergeSort(int a[],int low,int high){
        if(low>=high) return;
        mergeSort(a, low, (low+high)/2);
        mergeSort(a, ((low+high)/2)+1, high);
        merge(a,low,(low+high)/2,high);
    }
    public static void merge(int a[],int low,int mid,int high){
        ArrayList<Integer> z=new ArrayList<>();
        int l=low;
        int r=mid+1;
        while(l<=mid && r<=high){
            if(a[l]<=a[r]){
                z.add(a[l]);
                l++;
            }
            else{ 
                z.add(a[r]);
                r++;
            }
        }
        while(l<=mid){
            z.add(a[l]);
            l++;
        }
        while(r<=high){
            z.add(a[r]);
            r++;
        }
        for(int i=low;i<=high;i++){
            a[i]=z.get(i-low);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        mergeSort(a,0,n-1);
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        sc.close();
    }
}
